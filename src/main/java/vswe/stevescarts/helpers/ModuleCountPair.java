package vswe.stevescarts.helpers;

import net.minecraft.util.text.translation.I18n;
import vswe.stevescarts.modules.data.ModuleData;

public class ModuleCountPair {
	private ModuleData data;
	private int count;
	private String name;
	private byte extraData;

	public ModuleCountPair(final ModuleData data) {
		this.data = data;
		count = 1;
		name = data.getUnlocalizedName();
	}

	public int getCount() {
		return count;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public void increase() {
		++count;
	}

	public boolean isContainingData(final ModuleData data) {
		return this.data.equals(data);
	}

	public ModuleData getData() {
		return data;
	}

	public void setExtraData(final byte b) {
		extraData = b;
	}

	@Override
	public String toString() {
		String ret = data.getCartInfoText(I18n.translateToLocal(name), extraData);
		if (count != 1) {
			ret = ret + " x" + count;
		}
		return ret;
	}
}
