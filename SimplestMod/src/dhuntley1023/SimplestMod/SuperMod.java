package dhuntley1023.SimplestMod;


import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = SuperMod.MODID, name="Simplest Mod", version=SuperMod.VERSION)
public class SuperMod {
    public static final String MODID = "dhuntley.simplestmod";
    public static final String VERSION = "1.0";
    
    public static Block simpleBlock;
    public static BlockSand newBlock;
    
    
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//Block b = new BlockSand(500,Material.ground)
		//                 .setCreativeTab(CreativeTabs.tabBlock)
		//                 .setUnlocalizedName("simpleBlock")
		//                 .setTextureName("simplestmod:simpleBlock");
		
		BlockHelper.setNextID(500);
		
		simpleBlock = BlockHelper.MakeBlock(Material.ground, "simpleBlock", "Simple Block", CreativeTabs.tabBlock);            
		newBlock = BlockHelper.MakeSandBlock(Material.ground, "newBlock", "New Block", CreativeTabs.tabBlock);   
		
		System.out.println("Hello There!");
		
		
		
		//GameRegistry.registerBlock(b,"simpleBlock");
		//LanguageRegistry.addName(b, "Simple Block");
		
		
	}
	
}
