package xbony2.IndustrialEx.recipes;

import net.minecraft.item.ItemStack;
import xbony2.IndustrialEx.registery.RegBlocks;
import xbony2.IndustrialEx.registery.RegItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class SmeltingRecipes {
	public static void addRecipes(){
		GameRegistry.addSmelting(RegBlocks.nytOre, new ItemStack(RegItems.nytGem), 0.6F);
		GameRegistry.addSmelting(RegBlocks.viceOre, new ItemStack(RegItems.viceGem), 0.7F);
		GameRegistry.addSmelting(RegBlocks.infusedGoldOre, new ItemStack(RegItems.infusedGoldIngot), 0.7F);
	}
}
