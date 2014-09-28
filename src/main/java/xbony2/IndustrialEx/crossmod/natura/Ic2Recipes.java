package xbony2.IndustrialEx.crossmod.natura;

import ic2.api.item.IC2Items;
import ic2.api.recipe.Recipes;
import net.minecraft.item.ItemStack;
import xbony2.IndustrialEx.crossmod.natura.ic2recipes.*;

public class Ic2Recipes {

	/**
	 * Adds all the IC2 machine recipes for natura crossmod stuff.
	 */
	protected static void addRecipes(){
		TinCanInput1 tincan = new TinCanInput1();
		BerryInput1 input1 = new BerryInput1();
		Recipes.cannerBottle.addRecipe(tincan, input1, IC2Items.getItem("filledTinCan"));
		BerryInput2 input2 = new BerryInput2();
		Recipes.cannerBottle.addRecipe(tincan, input2, IC2Items.getItem("filledTinCan"));
		BerryInput3 input3 = new BerryInput3();
		Recipes.cannerBottle.addRecipe(tincan, input3, IC2Items.getItem("filledTinCan"));
		BerryInput4 input4 = new BerryInput4();
		Recipes.cannerBottle.addRecipe(tincan, input4, IC2Items.getItem("filledTinCan"));
		BerryInput5 input5 = new BerryInput5();
		Recipes.cannerBottle.addRecipe(tincan, input5, IC2Items.getItem("filledTinCan"));
		BerryInput6 input6 = new BerryInput6();
		Recipes.cannerBottle.addRecipe(tincan, input6, IC2Items.getItem("filledTinCan"));
		BerryInput7 input7 = new BerryInput7();
		Recipes.cannerBottle.addRecipe(tincan, input7, IC2Items.getItem("filledTinCan"));
		BerryInput8 input8 = new BerryInput8();
		Recipes.cannerBottle.addRecipe(tincan, input8, IC2Items.getItem("filledTinCan"));
		FruitInput1 input9 = new FruitInput1();
		Recipes.cannerBottle.addRecipe(tincan, input9, IC2Items.getItem("filledTinCan"));
		FruitInput2 input10 = new FruitInput2();
		Recipes.cannerBottle.addRecipe(tincan, input10, IC2Items.getItem("filledTinCan"));
		FruitInput3 input11 = new FruitInput3();
		Recipes.cannerBottle.addRecipe(tincan, input11, IC2Items.getItem("filledTinCan"));
		MeatInput1 input12 = new MeatInput1();
		Recipes.cannerBottle.addRecipe(tincan, input12, IC2Items.getItem("filledTinCan"));
		MeatInput2 input13 = new MeatInput2();
		Recipes.cannerBottle.addRecipe(tincan, input13, IC2Items.getItem("filledTinCan"));
		
	}
}
