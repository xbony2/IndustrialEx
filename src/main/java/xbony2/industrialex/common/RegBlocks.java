package xbony2.industrialex.common;

import xbony2.industrialex.blocks.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RegBlocks {
	public static Block darkSteelBlock;
	public static Block nytOre;
	public static Block viceOre;
	public static Block infusedGoldOre;
	public static Block nytBlock;
	public static Block viceBlock;
	public static Block infusedGoldBlock;
	
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
		nytBlock = new IEBaseBlock(Material.iron, "blockNyt");
		viceBlock = new IEBaseBlock(Material.iron, "blockVice");
		infusedGoldBlock = new IEBaseBlock(Material.iron, "blockInfusedGold");
	}
}
