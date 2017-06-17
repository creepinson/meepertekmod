package me.creepinson.core;
import me.creepinson.handler.BlockHandler;
import me.creepinson.handler.ItemHandler;
import me.creepinson.lib.proxy.CommonProxy;
import me.creepinson.lib.util.Utils;
import me.creepinson.render.particle.ParticleHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
@Mod(modid = Utils.MODID, version = Utils.VERSION)
public class MeeperTek
{
	@SidedProxy(serverSide = Utils.SEVERPROXY, clientSide = Utils.CLIENTPROXY)
public static CommonProxy proxy;
public static ParticleHandler ph = new ParticleHandler();
	
 
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
      
    	ItemHandler.init();
    	ItemHandler.register();
    	BlockHandler.init();
    	BlockHandler.register();
     	Utils.getLogger().info("Pre Init");
    	
    	proxy.registerRenderers();
    	
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
      
    	Utils.getLogger().info("Init");
    	

    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
      
     	Utils.getLogger().info("Post Init");
    	
    	
    	
    }
    
    
    
}
