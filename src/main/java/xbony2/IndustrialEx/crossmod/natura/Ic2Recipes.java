package xbony2.IndustrialEx.crossmod.natura;

import net.minecraft.item.ItemStack;
import ic2.api.item.IC2Items;
import ic2.api.recipe.Recipes;
import xbony2.IndustrialEx.crossmod.natura.ic2recipes.BerryInput1;
import xbony2.IndustrialEx.crossmod.natura.ic2recipes.TinCanInput1;

public class Ic2Recipes {

	/**
	 * Adds all the IC2 machine recipes for natura crossmod stuff.
	 */
	public static void addRecipes(){
		TinCanInput1 tincan = new TinCanInput1();
		BerryInput1 input1 = new BerryInput1();
		Recipes.cannerBottle.addRecipe(tincan, input1, new ItemStack(IC2Items.getItem("filledTinCan").getItem(), 1));
	}
}
