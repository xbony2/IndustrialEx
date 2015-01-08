package xbony2.industrialex.crossmod.natura;

import ic2.api.item.IC2Items;
import ic2.api.recipe.Recipes;
import mods.natura.common.NContent;
import net.minecraft.item.ItemStack;
import xbony2.industrialex.api.recipe.IC2RecipeInput;

public class Ic2Recipes {
	private final static ItemStack filled = IC2Items.getItem("filledTinCan");
	
	/**
	 * Adds all the IC2 machine recipes for natura crossmod stuff.
	 */
	protected static void addRecipes(){
		IC2RecipeInput tincan = new IC2RecipeInput(IC2Items.getItem("tinCan"));
		
		IC2RecipeInput input1 = new IC2RecipeInput(new ItemStack(NContent.berryItem));
		Recipes.cannerBottle.addRecipe(tincan, input1, filled);
		
		IC2RecipeInput input2 = new IC2RecipeInput(new ItemStack(NContent.berryItem, 1, 1));
		Recipes.cannerBottle.addRecipe(tincan, input2, filled);
		
		IC2RecipeInput input3 = new IC2RecipeInput(new ItemStack(NContent.berryItem, 1, 2));
		Recipes.cannerBottle.addRecipe(tincan, input3, filled);
		
		IC2RecipeInput input4 = new IC2RecipeInput(new ItemStack(NContent.berryItem, 1, 3));
		Recipes.cannerBottle.addRecipe(tincan, input4, filled);
		
		IC2RecipeInput input5 = new IC2RecipeInput(new ItemStack(NContent.netherBerryItem));
		Recipes.cannerBottle.addRecipe(tincan, input5, filled);
		
		IC2RecipeInput input6 = new IC2RecipeInput(new ItemStack(NContent.netherBerryItem, 1, 1));
		Recipes.cannerBottle.addRecipe(tincan, input6, filled);
		
		IC2RecipeInput input7 = new IC2RecipeInput(new ItemStack(NContent.netherBerryItem, 1, 2));
		Recipes.cannerBottle.addRecipe(tincan, input7, filled);
		
		IC2RecipeInput input8 = new IC2RecipeInput(new ItemStack(NContent.netherBerryItem, 1, 3));
		Recipes.cannerBottle.addRecipe(tincan, input8, filled);
		
		IC2RecipeInput input9 = new IC2RecipeInput(new ItemStack(NContent.waterDrop));
		Recipes.cannerBottle.addRecipe(tincan, input9, filled);
		
		IC2RecipeInput input10 = new IC2RecipeInput(new ItemStack(NContent.potashApple));
		Recipes.cannerBottle.addRecipe(tincan, input10, filled);
		
		IC2RecipeInput input11 = new IC2RecipeInput(new ItemStack(NContent.seedFood));
		Recipes.cannerBottle.addRecipe(tincan, input11, filled);
		
		IC2RecipeInput input12 = new IC2RecipeInput(new ItemStack(NContent.impMeat));
		Recipes.cannerBottle.addRecipe(tincan, input12, filled);
		
		IC2RecipeInput input13 = new IC2RecipeInput(new ItemStack(NContent.impMeat, 1, 1));
		Recipes.cannerBottle.addRecipe(tincan, input13, filled);
		
	}
}
