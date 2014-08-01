package xbony2.IndustrialEx.registery;

import xbony2.IndustrialEx.blocks.IEBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RegBlocks {

	public static Block darkSteelBlock;
	
	/**
	 * Registers blocks
	 * 
	 * @author xbony2
	 */
	public static void registerBlocks(){
		darkSteelBlock = new IEBlock(Material.iron, "darkSteelBlock");
		
		GameRegistry.registerBlock(darkSteelBlock, "darkSteelBlock");
	}
}
