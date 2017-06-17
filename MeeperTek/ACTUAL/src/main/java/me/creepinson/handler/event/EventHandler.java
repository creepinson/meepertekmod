package me.creepinson.handler.event;

import me.creepinson.lib.util.Utils;
import me.creepinson.render.particle.MoppityTextures;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EventHandler {

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onTextureStitch(TextureStitchEvent event) {
		event.getMap().registerSprite(MoppityTextures.moppityAura);
	}

}
