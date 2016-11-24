package stevesvehicles.client.rendering.models.common;

import net.minecraft.client.model.ModelRenderer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import stevesvehicles.client.rendering.models.ModelVehicle;

@SideOnly(Side.CLIENT)
public abstract class ModelEngineBase extends ModelVehicle {
	protected ModelRenderer anchor;

	public ModelEngineBase() {
		anchor = new ModelRenderer(this, 0, 0);
		addRenderer(anchor);
		anchor.setRotationPoint(10.5F, // X
				0.5F, // Y
				-0F // Z
				);
		anchor.rotateAngleY = -(float) Math.PI / 2;
	}
}