package fantastic.renders.entity;



import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import fantastic.FantasticDebug;
import fantastic.entities.EntityFeeder;
import fantastic.renders.models.ModelBasicFish;

public class RenderFeeder extends RenderLiving
{

	protected ModelBasicFish model;

	public RenderFeeder(ModelBase par1ModelBase, float par2)
	{
		super(par1ModelBase, par2);
		model = ((ModelBasicFish) mainModel);
	}

	public void renderFeeder(EntityFeeder par1, double par2, double par3, double par4, float par5, float par6)
	{
		super.doRender(par1, par2, par3, par4, par5, par6);
		
	}

	public void doRenderLiving(EntityLiving par1, double par2, double par3, double par4, float par5, float par6)
	{
		this.renderFeeder((EntityFeeder) par1, par2, par3, par4, par5, par6);
		
	}

	@Override
	public void doRender(Entity par1, double par2, double par3, double par4, float par5, float par6)
	{
		this.renderFeeder((EntityFeeder) par1, par2, par3, par4, par5, par6);
		
	}

	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return ((EntityFeeder)entity).GetTexture();

	}

	
	/**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
	@Override
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.scaleFish((EntityFeeder)par1EntityLivingBase, par2);
    }
    
    protected void scaleFish(EntityFeeder par1, float par2)
    {
    	float scale = (float)par1.GetRenderValueFromSize();
        GL11.glScalef(scale, scale, scale);
    }

	
	
	
	protected void func_82430_a(EntityFeeder par1, float par2, float par3, float par4)
    {		
		float par6 = 0;
		if (par1.worldObj.isAirBlock((int)par1.posX, (int)par1.posY, (int)par1.posZ))
		{
			FantasticDebug.Output("JUMPING !!!!!!!!!!!!!");
		    GL11.glRotatef(180F, 1.0F, 1.0F, 0.0F);
		}
		GL11.glTranslatef(0.0F, (float)(-par1.GetRenderValueFromSize()), 0.0F);
		super.rotateCorpse((EntityLivingBase)par1, par2, par3, par6);

}
	
	protected void rotateCorpse(EntityLivingBase par1EntityLivingBase, float par2, float par3, float par4)
    {
        this.func_82430_a((EntityFeeder)par1EntityLivingBase, par2, par3, par4);
        
    }
}
