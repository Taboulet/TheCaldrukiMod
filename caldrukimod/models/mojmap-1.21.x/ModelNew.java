// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelNew<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "modelnew"), "main");
	private final ModelPart WolfHead;
	private final ModelPart Body;
	private final ModelPart Mane;
	private final ModelPart Leg1;
	private final ModelPart Leg2;
	private final ModelPart Leg3;
	private final ModelPart Leg4;
	private final ModelPart Tail;
	private final ModelPart Ear1;
	private final ModelPart Ear2;
	private final ModelPart Nose;

	public ModelNew(ModelPart root) {
		this.WolfHead = root.getChild("WolfHead");
		this.Body = root.getChild("Body");
		this.Mane = root.getChild("Mane");
		this.Leg1 = root.getChild("Leg1");
		this.Leg2 = root.getChild("Leg2");
		this.Leg3 = root.getChild("Leg3");
		this.Leg4 = root.getChild("Leg4");
		this.Tail = root.getChild("Tail");
		this.Ear1 = root.getChild("Ear1");
		this.Ear2 = root.getChild("Ear2");
		this.Nose = root.getChild("Nose");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition WolfHead = partdefinition.addOrReplaceChild("WolfHead",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-3.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-1.0F, 13.5F, -7.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(18, 14).mirror()
						.addBox(-4.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 14.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Mane = partdefinition.addOrReplaceChild("Mane",
				CubeListBuilder.create().texOffs(21, 0).mirror()
						.addBox(-4.0F, -3.0F, -3.0F, 8.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 14.0F, -3.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Leg1 = partdefinition.addOrReplaceChild("Leg1",
				CubeListBuilder.create().texOffs(0, 18).mirror()
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.5F, 16.0F, 7.0F));

		PartDefinition Leg2 = partdefinition.addOrReplaceChild("Leg2",
				CubeListBuilder.create().texOffs(0, 18).mirror()
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.5F, 16.0F, 7.0F));

		PartDefinition Leg3 = partdefinition.addOrReplaceChild("Leg3",
				CubeListBuilder.create().texOffs(0, 18).mirror()
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.5F, 16.0F, -4.0F));

		PartDefinition Leg4 = partdefinition.addOrReplaceChild("Leg4",
				CubeListBuilder.create().texOffs(0, 18).mirror()
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.5F, 16.0F, -4.0F));

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail",
				CubeListBuilder.create().texOffs(9, 18).mirror()
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 12.0F, 8.0F, 1.1301F, 0.0F, 0.0F));

		PartDefinition Ear1 = partdefinition.addOrReplaceChild("Ear1",
				CubeListBuilder.create().texOffs(16, 14).mirror()
						.addBox(-3.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-1.0F, 13.5F, -7.0F));

		PartDefinition Ear2 = partdefinition.addOrReplaceChild("Ear2",
				CubeListBuilder.create().texOffs(16, 14).mirror()
						.addBox(1.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-1.0F, 13.5F, -7.0F));

		PartDefinition Nose = partdefinition.addOrReplaceChild("Nose",
				CubeListBuilder.create().texOffs(0, 10).mirror()
						.addBox(-2.0F, 0.0F, -5.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-0.5F, 13.5F, -7.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		WolfHead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Mane.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ear1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ear2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Nose.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}