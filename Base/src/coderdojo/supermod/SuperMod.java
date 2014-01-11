package coderdojo.supermod;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = SuperMod.MOD_ID, name = SuperMod.MOD_NAME, version = SuperMod.VERSION)
public class SuperMod {
	
	public static final String MOD_ID = "coderdojo_supermod";
	public static final String VERSION = "1.0";
	public static final String MOD_NAME = "CoderDojo SuperMod";
 
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("XXXXXX WELCOME TO SUPERMOD! XXXXXX");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	}
}
