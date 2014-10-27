package xbony2.IndustrialEx.recipes;

import ic2.api.recipe.Recipes;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import xbony2.IndustrialEx.api.recipe.IC2RecipeInput;
import xbony2.IndustrialEx.registery.RegBlocks;
import xbony2.IndustrialEx.registery.RegItems;

public class Ic2Recipes{

	/**
	 * Adds all the IC2 machine recipes.
	 */
	public static void addRecipes(){
		IC2RecipeInput input1 = new IC2RecipeInput(new ItemStack(RegBlocks.darkSteelBlock));
		Recipes.metalformerExtruding.addRecipe(input1, null, new ItemStack(RegItems.darkSteelShaft));
		
		IC2RecipeInput input2 = new IC2RecipeInput(new ItemStack(RegItems.darkSteelPlate));
		Recipes.metalformerRolling.addRecipe(input2, null, new ItemStack(RegItems.darkSteelItemCasing, 2));
		
		IC2RecipeInput input3 = new IC2RecipeInput(new ItemStack(RegItems.darkSteelIngot));
		Recipes.metalformerRolling.addRecipe(input3, null, new ItemStack(RegItems.darkSteelPlate));
		Recipes.blockcutter.addRecipe(input1, null, new ItemStack(RegItems.darkSteelPlate, 9));
		
		IC2RecipeInput input4 = new IC2RecipeInput(new ItemStack(RegItems.darkSteelPlate, 9));
		Recipes.compressor.addRecipe(input4, null, new ItemStack(RegItems.darkSteelDensePlate));
		
		IC2RecipeInput input5 = new IC2RecipeInput(new ItemStack(RegItems.darkMixedMetalIngot));
		Recipes.compressor.addRecipe(input5, null, new ItemStack(RegItems.darkSteelIngot));
		
		IC2RecipeInput input6 = new IC2RecipeInput(new ItemStack(Blocks.waterlily));
		Recipes.extractor.addRecipe(input6, null, new ItemStack(RegItems.greenDye));
	}
	
}
