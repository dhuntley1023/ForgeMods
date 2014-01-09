package dhuntley1023.SimplestMod;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockHelper {
	
	private static int nextID = 0;
	
	private static void CompleteBlock(Block b, String nickName, String niceName, CreativeTabs tab) {
		b.setCreativeTab(tab);
		b.setUnlocalizedName(nickName);
		b.setTextureName("simplestmod" + ":" + nickName);
		
		GameRegistry.registerBlock(b, nickName);
		LanguageRegistry.addName(b, niceName);
	}
	
	public static Block MakeBlock(Material m, String nickName, String niceName, CreativeTabs tab) {
		
		assert nextID != 0 : "nextID must be set prior to making a block";
		
		Block b = new Block(nextID++, m);
		CompleteBlock(b, nickName, niceName, tab);
		
		return b;
	}

	public static BlockSand MakeSandBlock(Material m, String nickName, String niceName, CreativeTabs tab) {
		
		assert nextID != 0 : "nextID must be set prior to making a block";
		
		BlockSand b = new BlockSand(nextID++, m);
		CompleteBlock((Block) b, nickName, niceName, tab);
		
		return b;
	}
	
	public static void setNextID(int nextID) {
		BlockHelper.nextID = nextID;
	}

}
