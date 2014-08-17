package xbony2.IndustrialEx.crossmod.bauble.recipes;

import ic2.api.item.IC2Items;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import xbony2.IndustrialEx.crossmod.bauble.Baubles;
import xbony2.IndustrialEx.registery.RegBlocks;
import cpw.mods.fml.common.registry.GameRegistry;

public class ShapedRecipes {

	public static void addRecipes(){
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Baubles.UnChargedNanoRing), new Object[]{
			" c ",
			"cec",
			" c ", 'c', IC2Items.getItem("carbonPlate"), 'e', IC2Items.getItem("energyCrystal")}));
	}
}
