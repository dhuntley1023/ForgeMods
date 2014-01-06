package dhuntley1023.SimplestMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = SimplestMod.MODID, name="Simplest Mod", version=SimplestMod.VERSION)
public class SimplestMod {
    public static final String MODID = "simplestmod";
    public static final String VERSION = "1.0";

	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println("Hello There!");
	}
	
}
