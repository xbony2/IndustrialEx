package xbony2.industrialex.recipes;

import net.minecraft.item.ItemStack;
import xbony2.industrialex.common.RegBlocks;
import xbony2.industrialex.common.RegItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class SmeltingRecipes {
	public static void addRecipes(){
		GameRegistry.addSmelting(RegBlocks.nytOre, new ItemStack(RegItems.nytGem), 0.6F);
		GameRegistry.addSmelting(RegBlocks.viceOre, new ItemStack(RegItems.viceGem), 0.7F);
		GameRegistry.addSmelting(RegBlocks.infusedGoldOre, new ItemStack(RegItems.infusedGoldIngot), 0.7F);
	}
}
