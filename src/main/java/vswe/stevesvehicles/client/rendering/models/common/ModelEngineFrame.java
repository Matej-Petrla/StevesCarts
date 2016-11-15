package vswe.stevesvehicles.client.rendering.models.common;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import vswe.stevesvehicles.client.ResourceHelper;
import vswe.stevesvehicles.module.ModuleBase;

@SideOnly(Side.CLIENT)
public class ModelEngineFrame extends ModelEngineBase {
	private static final ResourceLocation TEXTURE = ResourceHelper.getResource("/models/engineModelFrame.png");

	@Override
	public ResourceLocation getResource(ModuleBase module) {
		return TEXTURE;
	}

	@Override
	protected int getTextureWidth() {
		return 8;
	}

	@Override
	protected int getTextureHeight() {
		return 8;
	}

	public ModelEngineFrame() {
		ModelRenderer left = new ModelRenderer(this, 0, 0);
		anchor.addChild(left);
		fixSize(left);
		left.addBox(-0.5F, // X
				-2.5F, // Y
				-0.5F, // Z
				1, // Size X
				5, // Size Y
				1, // Size Z
				0.0F);
		left.setRotationPoint(-4F, // X
				0, // Y
				0 // Z
				);
		ModelRenderer right = new ModelRenderer(this, 0, 0);
		anchor.addChild(right);
		fixSize(right);
		right.addBox(-0.5F, // X
				-2.5F, // Y
				-0.5F, // Z
				1, // Size X
				5, // Size Y
				1, // Size Z
				0.0F);
		right.setRotationPoint(4F, // X
				0, // Y
				0 // Z
				);
		ModelRenderer top = new ModelRenderer(this, 4, 0);
		anchor.addChild(top);
		fixSize(top);
		top.addBox(-0.5F, // X
				-3.5F, // Y
				-0.5F, // Z
				1, // Size X
				7, // Size Y
				1, // Size Z
				0.0F);
		top.setRotationPoint(0, // X
				-3F, // Y
				0 // Z
				);
		top.rotateAngleZ = (float) Math.PI / 2;
		ModelRenderer bot = new ModelRenderer(this, 4, 0);
		anchor.addChild(bot);
		fixSize(bot);
		bot.addBox(-0.5F, // X
				-3.5F, // Y
				-0.5F, // Z
				1, // Size X
				7, // Size Y
				1, // Size Z
				0.0F);
		bot.setRotationPoint(0, // X
				2F, // Y
				0 // Z
				);
		bot.rotateAngleZ = (float) Math.PI / 2;
	}
}