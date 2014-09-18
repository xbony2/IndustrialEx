package xbony2.IndustrialEx.crossmod.natura;

import ic2.api.item.IC2Items;
import ic2.api.recipe.Recipes;
import net.minecraft.item.ItemStack;
import xbony2.IndustrialEx.crossmod.natura.ic2recipes.*;

public class Ic2Recipes {

	/**
	 * Adds all the IC2 machine recipes for natura crossmod stuff.
	 */
	public static void addRecipes(){
		TinCanInput1 tincan = new TinCanInput1();
		BerryInput1 input1 = new BerryInput1();
		Recipes.cannerBottle.addRecipe(tincan, input1, IC2Items.getItem("filledTinCan"));
		BerryInput2 input2 = new BerryInput2();
		Recipes.cannerBottle.addRecipe(tincan, input2, IC2Items.getItem("filledTinCan"));
		/*BerryInput3 input3 = new BerryInput3();
		Recipes.cannerBottle.addRecipe(tincan, input3, IC2Items.getItem("filledTinCan"));
		BerryInput4 input4 = new BerryInput4();
		Recipes.cannerBottle.addRecipe(tincan, input4, IC2Items.getItem("filledTinCan"));*/
		
	}
}
