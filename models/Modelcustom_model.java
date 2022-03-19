// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer bb_main;

	public Modelcustom_model() {
		texWidth = 64;
		texHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setPos(0.0F, 24.0F, 0.0F);
		bb_main.texOffs(4, 7).addBox(-7.0F, -6.0F, 6.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bb_main.texOffs(0, 7).addBox(6.0F, -6.0F, 6.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bb_main.texOffs(4, 0).addBox(6.0F, -6.0F, -7.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bb_main.texOffs(0, 0).addBox(-7.0F, -6.0F, -7.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		bb_main.texOffs(0, 0).addBox(-7.0F, -19.0F, -7.0F, 14.0F, 13.0F, 14.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}