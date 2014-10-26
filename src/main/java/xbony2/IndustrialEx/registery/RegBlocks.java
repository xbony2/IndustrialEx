package xbony2.IndustrialEx.registery;

import xbony2.IndustrialEx.blocks.IEBaseBlock;
import xbony2.IndustrialEx.blocks.IEOreBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RegBlocks {
	public static Block darkSteelBlock;
	public static Block nytOre;
	public static Block viceOre;
	public static Block infusedGoldOre;
	
	/**
	 * Registers blocks
	 * 
	 * @author xbony2
	 */
	public static void registerBlocks(){
		darkSteelBlock = new IEBaseBlock(Material.iron, "blockDarkSteel");
		nytOre = new IEOreBlock("oreNyt", RegItems.nytGem);
		viceOre = new IEOreBlock("oreVice", RegItems.viceGem);
		infusedGoldOre = new IEOreBlock("oreInfusedGold");
	}
}
