package fantastic.renders.entity;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityHanging;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fantastic.FantasticInfo;
import fantastic.entities.EntityHarpoon;


public class RenderHarpoon extends Render
{
	private static final ResourceLocation arrowTextures = new ResourceLocation(FantasticInfo.ID.toLowerCase() + ":textures/items/harpoons.png");

	public void renderHarpoon(EntityHarpoon par1EntityHarpoon, double par2, double par4, double par6, float par8, float par9)
	{
		
		this.bindEntityTexture(par1EntityHarpoon);
		GL11.glPushMatrix();
		GL11.glTranslatef((float) par2, (float) par4, (float) par6);
		GL11.glRotatef(par1EntityHarpoon.prevRotationYaw + (par1EntityHarpoon.rotationYaw - par1EntityHarpoon.prevRotationYaw) * par9 - 90.0F, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(par1EntityHarpoon.prevRotationPitch + (par1EntityHarpoon.rotationPitch - par1EntityHarpoon.prevRotationPitch) * par9, 0.0F, 0.0F, 1.0F);
		Tessellator tessellator = Tessellator.instance;
		byte b0 = 0;
		float f2 = 0.0F;
		float f3 = 0.5F;
		float f4 = (float) (0 + b0 * 10) / 32.0F;
		float f5 = (float) (5 + b0 * 10) / 32.0F;
		float f6 = 0.0F;
		float f7 = 0.15625F;
		float f8 = (float) (5 + b0 * 10) / 32.0F;
		float f9 = (float) (10 + b0 * 10) / 32.0F;
		float f10 = 0.05625F;
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		float f11 = (float) par1EntityHarpoon.arrowShake - par9;

		if (f11 > 0.0F)
		{
			float f12 = -MathHelper.sin(f11 * 3.0F) * f11;
			GL11.glRotatef(f12, 0.0F, 0.0F, 1.0F);
		}

		GL11.glRotatef(45.0F, 1.0F, 0.0F, 0.0F);
		GL11.glScalef(f10, f10, f10);
		GL11.glTranslatef(-4.0F, 0.0F, 0.0F);
		GL11.glNormal3f(f10, 0.0F, 0.0F);
		tessellator.startDrawingQuads();
		tessellator.addVertexWithUV(-7.0D, -2.0D, -2.0D, (double) f6, (double) f8);
		tessellator.addVertexWithUV(-7.0D, -2.0D, 2.0D, (double) f7, (double) f8);
		tessellator.addVertexWithUV(-7.0D, 2.0D, 2.0D, (double) f7, (double) f9);
		tessellator.addVertexWithUV(-7.0D, 2.0D, -2.0D, (double) f6, (double) f9);
		tessellator.draw();
		GL11.glNormal3f(-f10, 0.0F, 0.0F);
		tessellator.startDrawingQuads();
		tessellator.addVertexWithUV(-7.0D, 2.0D, -2.0D, (double) f6, (double) f8);
		tessellator.addVertexWithUV(-7.0D, 2.0D, 2.0D, (double) f7, (double) f8);
		tessellator.addVertexWithUV(-7.0D, -2.0D, 2.0D, (double) f7, (double) f9);
		tessellator.addVertexWithUV(-7.0D, -2.0D, -2.0D, (double) f6, (double) f9);
		tessellator.draw();

		for (int i = 0; i < 4; ++i)
		{
			GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
			GL11.glNormal3f(0.0F, 0.0F, f10);
			tessellator.startDrawingQuads();
			tessellator.addVertexWithUV(-8.0D, -2.0D, 0.0D, (double) f2, (double) f4);
			tessellator.addVertexWithUV(8.0D, -2.0D, 0.0D, (double) f3, (double) f4);
			tessellator.addVertexWithUV(8.0D, 2.0D, 0.0D, (double) f3, (double) f5);
			tessellator.addVertexWithUV(-8.0D, 2.0D, 0.0D, (double) f2, (double) f5);
			tessellator.draw();
		}

		GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		GL11.glPopMatrix();
		
		
        
        
		
		
		
		

	}

	protected ResourceLocation getArrowTextures(EntityHarpoon par1EntityHarpoon)
	{
		return arrowTextures;
	}

	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		return this.getArrowTextures((EntityHarpoon) par1Entity);
	}

	/**
	 * Actually renders the given argument. This is a synthetic bridge method,
	 * always casting down its argument and then handing it off to a worker
	 * function which does the actual work. In all probabilty, the class Render
	 * is generic (Render<T extends Entity) and this method has signature public
	 * void doRender(T entity, double d, double d1, double d2, float f, float
	 * f1). But JAD is pre 1.5 so doesn't do that.
	 */
	public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
	{
		this.renderHarpoon((EntityHarpoon) par1Entity, par2, par4, par6, par8, par9);
		this.renderLine((EntityHarpoon)par1Entity, par2, par4, par6, par8, par9);
	}

	private void renderLine(EntityHarpoon par1EntityHarpoon, double par2, double par4, double par6, float par8, float par9) 
	{
		Entity entity = null;
		if(par1EntityHarpoon.angler == null)
		{
			entity = par1EntityHarpoon.worldObj.getClosestPlayerToEntity(par1EntityHarpoon, 10);
			par1EntityHarpoon.angler = (EntityPlayer) entity;
		}
		entity = par1EntityHarpoon.angler;
        if (entity != null)
        {
        	
            par4 -= (1.2D - (double)par1EntityHarpoon.height) * 0.5D;
            Tessellator tessellator = Tessellator.instance;
            double d3 = this.func_110828_a((double)entity.prevRotationYaw, (double)entity.rotationYaw, (double)(par9 * 0.5F)) * 0.01745329238474369D;
            double d4 = this.func_110828_a((double)entity.prevRotationPitch, (double)entity.rotationPitch, (double)(par9 * 0.5F)) * 0.01745329238474369D;
            double d5 = Math.cos(d3);
            double d6 = Math.sin(d3);
            double d7 = Math.sin(d4);


            double d8 = Math.cos(d4);
            double d9 = this.func_110828_a(entity.prevPosX, entity.posX, (double)par9) - d5 * 0.7D - d6 * 0.5D * d8;
            double d10 = this.func_110828_a(entity.prevPosY + (double)entity.getEyeHeight() * 0.7D, entity.posY + (double)entity.getEyeHeight() * 0.7D, (double)par9) - d7 * 0.5D - 0.25D;
            double d11 = this.func_110828_a(entity.prevPosZ, entity.posZ, (double)par9) - d6 * 0.7D + d5 * 0.5D * d8;
            double d12 = this.func_110828_a((double)par1EntityHarpoon.prevRotationYaw, (double)par1EntityHarpoon.rotationYaw, (double)par9) * 0.01745329238474369D + (Math.PI / 2D);
            d5 = Math.cos(d12) * (double)par1EntityHarpoon.width * 0.4D;
            d6 = Math.sin(d12) * (double)par1EntityHarpoon.width * 0.4D;
            double d13 = this.func_110828_a(par1EntityHarpoon.prevPosX, par1EntityHarpoon.posX, (double)par9) + d5;
            double d14 = this.func_110828_a(par1EntityHarpoon.prevPosY, par1EntityHarpoon.posY, (double)par9);
            double d15 = this.func_110828_a(par1EntityHarpoon.prevPosZ, par1EntityHarpoon.posZ, (double)par9) + d6;
            par2 += d5;
            par6 += d6;
            double d16 = (double)((float)(d9 - d13));
            double d17 = (double)((float)(d10 - d14));
            double d18 = (double)((float)(d11 - d15));
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glDisable(GL11.GL_CULL_FACE);
            boolean flag = true;
            double d19 = 0.025D;
            tessellator.startDrawing(5);
            int i;
            float f2;

            for (i = 0; i <= 32; ++i)
            {
                if (i % 2 == 0)
                {
                    tessellator.setColorRGBA_F(0.5F, 0.4F, 0.3F, 1.0F);
                }
                else
                {
                    tessellator.setColorRGBA_F(0.35F, 0.28F, 0.21000001F, 1.0F);
                }

                f2 = (float)i / 32.0F;
                tessellator.addVertex(par2 + d16 * (double)f2 + 0.01D, par4 + d17 * (double)(f2 * f2 + f2) * 0.5D + (double)((32.0F - (float)i) / 18.0F + 0.125F)+ 0.01D, par6 + d18 * (double)f2 + 0.01D);
                tessellator.addVertex(par2 + d16 * (double)f2 + 0.035D, par4 + d17 * (double)(f2 * f2 + f2) * 0.5D + (double)((32.0F - (float)i) / 18.0F + 0.125F) + 0.035D, par6 + d18 * (double)f2 + 0.01D);
            }

            tessellator.draw();
            tessellator.startDrawing(5);

            for (i = 0; i <= 32; ++i)
            {
                if (i % 2 == 0)
                {
                    tessellator.setColorRGBA_F(0.5F, 0.4F, 0.3F, 1.0F);
                }
                else
                {
                    tessellator.setColorRGBA_F(0.35F, 0.28F, 0.21000001F, 1.0F);
                }

                f2 = (float)i / 32.0F;
                tessellator.addVertex(par2 + d16 * (double)f2 + 0.01D, par4 + d17 * (double)(f2 * f2 + f2) * 0.5D + (double)((32.0F - (float)i) / 18.0F + 0.125F) + 0.035D, par6 + d18 * (double)f2 + 0.01D);
                tessellator.addVertex(par2 + d16 * (double)f2 + 0.035D, par4 + d17 * (double)(f2 * f2 + f2) * 0.5D + (double)((32.0F - (float)i) / 18.0F + 0.125F) + 0.01D, par6 + d18 * (double)f2 + 0.035D);
            }

            tessellator.draw();
            GL11.glEnable(GL11.GL_LIGHTING);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glEnable(GL11.GL_CULL_FACE);
        } 
		
	}
	
	
	 private double func_110828_a(double par1, double par3, double par5)
	    {
	        return par1 + (par3 - par1) * par5;
	    }
}