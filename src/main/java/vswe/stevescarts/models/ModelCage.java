package vswe.stevescarts.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import vswe.stevescarts.helpers.ResourceHelper;
import vswe.stevescarts.modules.ModuleBase;

@SideOnly(Side.CLIENT)
public class ModelCage extends ModelCartbase {
	private static ResourceLocation texture;
	private int cageHeight;

	@Override
	public ResourceLocation getResource(final ModuleBase module) {
		return ModelCage.texture;
	}

	@Override
	protected int getTextureWidth() {
		return 32;
	}

	@Override
	protected int getTextureHeight() {
		return 32;
	}

	public ModelCage(final boolean isPlaceholder) {
		cageHeight = 26;
		if (isPlaceholder) {
			cageHeight = 14;
		}
		for (float x = -9.0f; x <= 9.0f; x += 6.0f) {
			if (Math.abs(x) != 9.0f) {
				createBar(x, 7.0f);
				createBar(x, -7.0f);
			}
			createTopBarShort(x);
		}
		for (float z = -7.0f; z <= 7.0f; z += 4.6666665f) {
			createBar(9.0f, z);
			createBar(-9.0f, z);
			createTopBarLong(z);
		}
	}

	private void createBar(final float offsetX, final float offsetZ) {
		final ModelRenderer bar = new ModelRenderer(this, 0, 0);
		AddRenderer(bar);
		bar.addBox(-0.5f, -cageHeight / 2.0f, -0.5f, 1, cageHeight, 1, 0.0f);
		bar.setRotationPoint(offsetX, -cageHeight / 2.0f - 4.0f, offsetZ);
	}

	private void createTopBarLong(final float offsetZ) {
		final ModelRenderer bar = new ModelRenderer(this, 0, 0);
		AddRenderer(bar);
		bar.addBox(-0.5f, -9.5f, -0.5f, 1, 19, 1, 0.0f);
		bar.setRotationPoint(0.005f, -cageHeight - 4.005f, offsetZ + 0.005f);
		bar.rotateAngleZ = 1.5707964f;
	}

	private void createTopBarShort(final float offsetX) {
		final ModelRenderer bar = new ModelRenderer(this, 0, 0);
		AddRenderer(bar);
		bar.addBox(-0.5f, -7.5f, -0.5f, 1, 15, 1, 0.0f);
		bar.setRotationPoint(offsetX - 0.005f, -cageHeight - 4 + 0.005f, -0.005f);
		bar.rotateAngleX = 1.5707964f;
	}

	static {
		ModelCage.texture = ResourceHelper.getResource("/models/cageModel.png");
	}
}
