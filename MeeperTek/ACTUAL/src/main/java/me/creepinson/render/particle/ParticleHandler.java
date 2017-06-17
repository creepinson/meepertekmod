package me.creepinson.render.particle;

import me.creepinson.render.particle.moppity.MoppityAura;
import me.creepinson.render.particle.moppity.MoppityAuraAqua;
import me.creepinson.render.particle.moppity.MoppityAuraGreen;
import me.creepinson.render.particle.moppity.MoppityAuraMagenta;
import me.creepinson.render.particle.moppity.MoppityAuraRed;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.Particle;
import net.minecraft.entity.Entity;

public class ParticleHandler {
	
	public void moppityAuraBlue(Entity theEntity)
	{
	    double motionX = theEntity.world.rand.nextGaussian() * 0.02D;
	    double motionY = theEntity.world.rand.nextGaussian() * 0.02D;
	    double motionZ = theEntity.world.rand.nextGaussian() * 0.02D;
	    Particle particleMysterious = new MoppityAura(
	          theEntity.world, 
	          theEntity.posX + theEntity.world.rand.nextFloat() * theEntity.width 
	                * 2.0F - theEntity.width, 
	          theEntity.posY + 0.5D + theEntity.world.rand.nextFloat() 
	                * theEntity.height, 
	          theEntity.posZ + theEntity.world.rand.nextFloat() * theEntity.width 
	                * 2.0F - theEntity.width, 
	          motionX, 
	          motionY, 
	          motionZ);
	    particleMysterious.setRBGColorF(0.0F, 0.0F, 1.0F);
	    Minecraft.getMinecraft().effectRenderer.addEffect(particleMysterious);        
	}
	
	public void moppityAuraRed(Entity theEntity)
	{
	    double motionX = theEntity.world.rand.nextGaussian() * 0.02D;
	    double motionY = theEntity.world.rand.nextGaussian() * 0.02D;
	    double motionZ = theEntity.world.rand.nextGaussian() * 0.02D;
	    Particle particleMysterious = new MoppityAura(
	          theEntity.world, 
	          theEntity.posX + theEntity.world.rand.nextFloat() * theEntity.width 
	                * 2.0F - theEntity.width, 
	          theEntity.posY + 0.5D + theEntity.world.rand.nextFloat() 
	                * theEntity.height, 
	          theEntity.posZ + theEntity.world.rand.nextFloat() * theEntity.width 
	                * 2.0F - theEntity.width, 
	          motionX, 
	          motionY, 
	          motionZ);
	    particleMysterious.setRBGColorF(1.0F, 0.0F, 0.0F);
	    Minecraft.getMinecraft().effectRenderer.addEffect(particleMysterious);        
	}
	
	public void moppityAuraGreen(Entity theEntity)
	{
	    double motionX = theEntity.world.rand.nextGaussian() * 0.02D;
	    double motionY = theEntity.world.rand.nextGaussian() * 0.02D;
	    double motionZ = theEntity.world.rand.nextGaussian() * 0.02D;
	    Particle particleMysterious = new MoppityAura(
	          theEntity.world, 
	          theEntity.posX + theEntity.world.rand.nextFloat() * theEntity.width 
	                * 2.0F - theEntity.width, 
	          theEntity.posY + 0.5D + theEntity.world.rand.nextFloat() 
	                * theEntity.height, 
	          theEntity.posZ + theEntity.world.rand.nextFloat() * theEntity.width 
	                * 2.0F - theEntity.width, 
	          motionX, 
	          motionY, 
	          motionZ);
	    particleMysterious.setRBGColorF(0.0F, 1.0F, 0.0F);
	    Minecraft.getMinecraft().effectRenderer.addEffect(particleMysterious);        
	}
	
	public void moppityAuraMagenta(Entity theEntity)
	{
	    double motionX = theEntity.world.rand.nextGaussian() * 0.02D;
	    double motionY = theEntity.world.rand.nextGaussian() * 0.02D;
	    double motionZ = theEntity.world.rand.nextGaussian() * 0.02D;
	    Particle particleMysterious = new MoppityAura(
	          theEntity.world, 
	          theEntity.posX + theEntity.world.rand.nextFloat() * theEntity.width 
	                * 2.0F - theEntity.width, 
	          theEntity.posY + 0.5D + theEntity.world.rand.nextFloat() 
	                * theEntity.height, 
	          theEntity.posZ + theEntity.world.rand.nextFloat() * theEntity.width 
	                * 2.0F - theEntity.width, 
	          motionX, 
	          motionY, 
	          motionZ);
	    particleMysterious.setRBGColorF(1.0F, 0.0F, 1.0F);
	    Minecraft.getMinecraft().effectRenderer.addEffect(particleMysterious);        
	}
	
	public void moppityAuraAqua(Entity theEntity)
	{
	    double motionX = theEntity.world.rand.nextGaussian() * 0.02D;
	    double motionY = theEntity.world.rand.nextGaussian() * 0.02D;
	    double motionZ = theEntity.world.rand.nextGaussian() * 0.02D;
	    Particle particleMysterious = new MoppityAura(
	          theEntity.world, 
	          theEntity.posX + theEntity.world.rand.nextFloat() * theEntity.width 
	                * 2.0F - theEntity.width, 
	          theEntity.posY + 0.5D + theEntity.world.rand.nextFloat() 
	                * theEntity.height, 
	          theEntity.posZ + theEntity.world.rand.nextFloat() * theEntity.width 
	                * 2.0F - theEntity.width, 
	          motionX, 
	          motionY, 
	          motionZ);
	    particleMysterious.setRBGColorF(0.0F, 1.0F, 1.0F);
	    Minecraft.getMinecraft().effectRenderer.addEffect(particleMysterious);        
	}
	
	
}
