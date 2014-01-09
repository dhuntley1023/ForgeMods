package coderdojo.BasicBlock.SuperMod;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = "coderdojo.supermod", name = "CoderDojo SuperMod", version = "1.0")
public class SuperMod {
	
	public static final Block simpleBlock = new Block(500, Material.ground);
 
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("XXXXXX WELCOME TO SUPERMOD! XXXXXX");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	}
}
