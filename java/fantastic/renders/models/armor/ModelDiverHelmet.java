// Date: 7/24/2014 8:12:52 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package fantastic.renders.models.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDiverHelmet extends ModelBiped
{
  //fields
    ModelRenderer head;
    ModelRenderer barL;
    ModelRenderer barR;
    ModelRenderer headtop1;
    ModelRenderer headL;
    ModelRenderer headR;
    ModelRenderer headbottom;
    ModelRenderer headtop2;
    ModelRenderer glassR;
    ModelRenderer glass;
    ModelRenderer glassL;
    ModelRenderer glasssideR;
    ModelRenderer glasssideL;
    ModelRenderer glasstop;
  
  public ModelDiverHelmet(float f)
  {
	  super(f, 0, 64, 128);
    textureWidth = 64;
    textureHeight = 128;
    
    head = new ModelRenderer(this, 0, 0);
    head.addBox(-4F, -8F, -4F, 8, 8, 8, f);
    head.setRotationPoint(0F, 0F, 0F);
    head.setTextureSize(64, 128);
    head.mirror = true;
    setRotation(head, 0F, 0F, 0F);
    barL = new ModelRenderer(this, 0, 22);
    barL.addBox(1F, -6.9F, -5.5F, 1, 5, 1, f);
    barL.setRotationPoint(0F, 0F, 0F);
    barL.setTextureSize(64, 128);
    barL.mirror = true;
    setRotation(barL, 0F, 0F, 0F);
    barR = new ModelRenderer(this, 0, 22);
    barR.mirror = true;
    barR.addBox(-2F, -6.9F, -5.5F, 1, 5, 1, f);
    barR.setRotationPoint(0F, 0F, 0F);
    barR.setTextureSize(64, 128);
    barR.mirror = true;
    setRotation(barR, 0F, 0F, 0F);
    barR.mirror = false;
    headtop1 = new ModelRenderer(this, 0, 16);
    headtop1.addBox(-3F, -9F, 1F, 6, 3, 3, f);
    headtop1.setRotationPoint(0F, 0F, 0F);
    headtop1.setTextureSize(64, 128);
    headtop1.mirror = true;
    setRotation(headtop1, 0.7853982F, 0F, 0F);
    headL = new ModelRenderer(this, 32, 0);
    headL.addBox(2.5F, -7F, -4.7F, 2, 5, 8, f);
    headL.setRotationPoint(0F, 0F, 0F);
    headL.setTextureSize(64, 128);
    headL.mirror = true;
    setRotation(headL, 0F, 0F, 0F);
    headR = new ModelRenderer(this, 32, 0);
    headR.mirror = true;
    headR.addBox(-4.5F, -7F, -4.7F, 2, 5, 8, f);
    headR.setRotationPoint(0F, 0F, 0F);
    headR.setTextureSize(64, 128);
    headR.mirror = true;
    setRotation(headR, 0F, 0F, 0F);
    headR.mirror = false;
    headbottom = new ModelRenderer(this, 0, 28);
    headbottom.addBox(-3F, -5.2F, -2.5F, 6, 2, 1, f);
    headbottom.setRotationPoint(0F, 0F, 0F);
    headbottom.setTextureSize(64, 128);
    headbottom.mirror = true;
    setRotation(headbottom, 0.7853982F, 0F, 0F);
    headtop2 = new ModelRenderer(this, 0, 31);
    headtop2.addBox(-3F, -9.2F, -3.5F, 6, 6, 8, f);
    headtop2.setRotationPoint(0F, 0F, 0F);
    headtop2.setTextureSize(64, 128);
    headtop2.mirror = true;
    setRotation(headtop2, 0F, 0F, 0F);
    glassR = new ModelRenderer(this, 6, 22);
    glassR.mirror = true;
    glassR.addBox(-1F, -7F, -5.5F, 2, 5, 1, f);
    glassR.setRotationPoint(0F, 0F, 0F);
    glassR.setTextureSize(64, 128);
    glassR.mirror = true;
    setRotation(glassR, 0F, 0.4712389F, 0F);
    glassR.mirror = false;
    glass = new ModelRenderer(this, 6, 22);
    glass.addBox(-1F, -7F, -5.2F, 2, 5, 1, f);
    glass.setRotationPoint(0F, 0F, 0F);
    glass.setTextureSize(64, 128);
    glass.mirror = true;
    setRotation(glass, 0F, 0F, 0F);
    glassL = new ModelRenderer(this, 6, 22);
    glassL.addBox(-1F, -7F, -5.5F, 2, 5, 1, f);
    glassL.setRotationPoint(0F, 0F, 0F);
    glassL.setTextureSize(64, 128);
    glassL.mirror = true;
    setRotation(glassL, 0F, -0.4712389F, 0F);
    glasssideR = new ModelRenderer(this, 30, 0);
    glasssideR.mirror = true;
    glasssideR.addBox(-5F, -6F, -2F, 1, 3, 3, f);
    glasssideR.setRotationPoint(0F, 0F, 0F);
    glasssideR.setTextureSize(64, 128);
    glasssideR.mirror = true;
    setRotation(glasssideR, 0F, 0F, 0F);
    glasssideR.mirror = false;
    glasssideL = new ModelRenderer(this, 30, 0);
    glasssideL.addBox(4F, -6F, -2F, 1, 3, 3, f);
    glasssideL.setRotationPoint(0F, 0F, 0F);
    glasssideL.setTextureSize(64, 128);
    glasssideL.mirror = true;
    setRotation(glasssideL, 0F, 0F, 0F);
    glasstop = new ModelRenderer(this, 19, 16);
    glasstop.addBox(-1.5F, -1F, -10F, 3, 3, 2, f);
    glasstop.setRotationPoint(0F, 0F, 0F);
    glasstop.setTextureSize(64, 128);
    glasstop.mirror = true;
    setRotation(glasstop, -1.308997F, 0F, 0F);
      
      this.bipedHead.addChild(head);
      this.bipedHead.addChild(barL);
      this.bipedHead.addChild(barR);
      this.bipedHead.addChild( headtop1);
      this.bipedHead.addChild( headL);
      this.bipedHead.addChild( headR);
      this.bipedHead.addChild( headbottom);
      this.bipedHead.addChild( headtop2);
      this.bipedHead.addChild( glassR);
      this.bipedHead.addChild(glass);
      this.bipedHead.addChild(glassL);
      this.bipedHead.addChild(glasssideR);
      this.bipedHead.addChild(glasssideL);
      this.bipedHead.addChild(glasstop);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);

    this.bipedHeadwear.cubeList.clear();
    this.bipedHeadwear.showModel = false;
  
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}