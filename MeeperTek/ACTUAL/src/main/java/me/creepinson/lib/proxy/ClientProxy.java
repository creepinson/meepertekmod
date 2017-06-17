package me.creepinson.lib.proxy;

import me.creepinson.handler.BlockHandler;
import me.creepinson.handler.ItemHandler;
import me.creepinson.tileentity.TECreepinoSkull;
import me.creepinson.tileentity.render.TESRCreepinoSkull;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenderers() {

		ItemHandler.registerRenders();
		BlockHandler.registerRenders();
	}
	@Override
	public void preInit() {
		  super.preInit();
		
	}

	public void init() {
		  super.init();
		  ClientRegistry.bindTileEntitySpecialRenderer(TECreepinoSkull.class, new TESRCreepinoSkull());
				}

	
}
