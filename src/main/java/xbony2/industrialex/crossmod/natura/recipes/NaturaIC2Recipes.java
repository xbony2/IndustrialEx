package xbony2.industrialex.crossmod.natura.recipes;

import ic2.api.item.IC2Items;
import ic2.api.recipe.Recipes;
import mods.natura.common.NContent;
import net.minecraft.item.ItemStack;
import static xbony2.industrialex.api.recipe.CannerUtil.*;
import xbony2.industrialex.api.recipe.IC2RecipeInput;

public class NaturaIC2Recipes {
	
	/**
	 * Adds all the IC2 machine recipes for natura crossmod stuff.
	 */
	public static void addRecipes(){
		IC2RecipeInput input1 = new IC2RecipeInput(new ItemStack(NContent.berryItem));
		Recipes.cannerBottle.addRecipe(EMPTY_X1, input1, FILLED_X1);
		
		IC2RecipeInput input2 = new IC2RecipeInput(new ItemStack(NContent.berryItem, 1, 1));
		Recipes.cannerBottle.addRecipe(EMPTY_X1, input2, FILLED_X1);
		
		IC2RecipeInput input3 = new IC2RecipeInput(new ItemStack(NContent.berryItem, 1, 2));
		Recipes.cannerBottle.addRecipe(EMPTY_X1, input3, FILLED_X1);
		
		IC2RecipeInput input4 = new IC2RecipeInput(new ItemStack(NContent.berryItem, 1, 3));
		Recipes.cannerBottle.addRecipe(EMPTY_X1, input4, FILLED_X1);
		
		IC2RecipeInput input5 = new IC2RecipeInput(new ItemStack(NContent.netherBerryItem));
		Recipes.cannerBottle.addRecipe(EMPTY_X1, input5, FILLED_X1);
		
		IC2RecipeInput input6 = new IC2RecipeInput(new ItemStack(NContent.netherBerryItem, 1, 1));
		Recipes.cannerBottle.addRecipe(EMPTY_X1, input6, FILLED_X1);
		
		IC2RecipeInput input7 = new IC2RecipeInput(new ItemStack(NContent.netherBerryItem, 1, 2));
		Recipes.cannerBottle.addRecipe(EMPTY_X1, input7, FILLED_X1);
		
		IC2RecipeInput input8 = new IC2RecipeInput(new ItemStack(NContent.netherBerryItem, 1, 3));
		Recipes.cannerBottle.addRecipe(EMPTY_X1, input8, FILLED_X1);
		
		IC2RecipeInput input9 = new IC2RecipeInput(new ItemStack(NContent.waterDrop));
		Recipes.cannerBottle.addRecipe(EMPTY_X1, input9, FILLED_X1);
		
		IC2RecipeInput input10 = new IC2RecipeInput(new ItemStack(NContent.potashApple));
		Recipes.cannerBottle.addRecipe(EMPTY_X4, input10, FILLED_X4);
		
		IC2RecipeInput input11 = new IC2RecipeInput(new ItemStack(NContent.seedFood));
		Recipes.cannerBottle.addRecipe(EMPTY_X3, input11, FILLED_X3);
		
		IC2RecipeInput input12 = new IC2RecipeInput(new ItemStack(NContent.impMeat));
		Recipes.cannerBottle.addRecipe(EMPTY_X3, input12, FILLED_X3);
		
		IC2RecipeInput input13 = new IC2RecipeInput(new ItemStack(NContent.impMeat, 1, 1));
		Recipes.cannerBottle.addRecipe(EMPTY_X8, input13, FILLED_X8);
		
	}
}
