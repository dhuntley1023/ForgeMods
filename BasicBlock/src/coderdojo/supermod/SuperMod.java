package coderdojo.supermod;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = SuperMod.MOD_ID, name = SuperMod.MOD_NAME, version = SuperMod.VERSION)
public class SuperMod {
	
	public static final String MOD_ID = "coderdojo_supermod";
	public static final String VERSION = "1.0";
	public static final String MOD_NAME = "CoderDojo SuperMod";
	
	public static final Block simpleBlock = new Block(500, Material.ground).setCreativeTab(CreativeTabs.tabBlock);
 
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("XXXXXX WELCOME TO SUPERMOD! XXXXXX");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		GameRegistry.registerBlock(simpleBlock, "simpleBlock");
	}
}

/* Lesson FLow: 
	1) Create block on a tab
		Create it using separate new and setCreativeTab methods
		Show how it can be combined.  Show how you can find the list of Blocks in the MC Code.
		
		Have them run it and note the name
		
	2) Give it a name
		Best practice, use same name for unlocalized name, registration name, asset name = nickName
		Best practice, set nickname to all lowercase.  This will prevent confusion later on w. asset folder.
		
		
	3) Give it a texture
		 
		
	4) Extra:
			What happens if you extend from a different Block type?
			What happens if you change other properties?
*/

// TODO: What happens when you change Material?
// TODO: What happens when you change the Tab?
// TODO: Identify the interesting properties and create a cheat-sheet for them
