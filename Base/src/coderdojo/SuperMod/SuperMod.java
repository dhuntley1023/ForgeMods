package coderdojo.SuperMod;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = "coderdojo.supermod", name = "CoderDojo SuperMod", version = "1.0")
public class SuperMod {
 
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("XXXXXX WELCOME TO SUPERMOD! XXXXXX");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	}
}
