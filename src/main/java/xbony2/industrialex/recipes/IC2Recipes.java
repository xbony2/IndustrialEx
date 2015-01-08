package xbony2.industrialex.recipes;

import ic2.api.item.IC2Items;
import ic2.api.recipe.Recipes;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import xbony2.industrialex.api.recipe.IC2RecipeInput;
import xbony2.industrialex.api.recipe.LazyOreAdd;
import xbony2.industrialex.common.RegBlocks;
import xbony2.industrialex.common.RegItems;

public class IC2Recipes{

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
		
		LazyOreAdd.addOreRecipes(new ItemStack(RegBlocks.nytOre), new ItemStack(RegBlocks.nytBlock), 
				new ItemStack(RegItems.nytGem), new ItemStack(RegItems.nytNugget), new ItemStack(RegItems.nytItemCasing), 
				new ItemStack(RegItems.nytPlate), new ItemStack(RegItems.nytDensePlate), new ItemStack(RegItems.nytCrushedOre), 
				new ItemStack(RegItems.nytPurifiedCrushedOre), new ItemStack(RegItems.nytTinyPile), 
				new ItemStack(RegItems.viceTinyPile), new ItemStack(RegItems.nytDust));
		
		LazyOreAdd.addOreRecipes(new ItemStack(RegBlocks.viceOre), new ItemStack(RegBlocks.viceBlock), 
				new ItemStack(RegItems.viceGem), new ItemStack(RegItems.viceNugget), new ItemStack(RegItems.viceItemCasing), 
				new ItemStack(RegItems.vicePlate), new ItemStack(RegItems.viceDensePlate), new ItemStack(RegItems.viceCrushedOre), 
				new ItemStack(RegItems.vicePurifiedCrushedOre), new ItemStack(RegItems.viceTinyPile), 
				IC2Items.getItem("smallSilverDust"), new ItemStack(RegItems.viceDust));
		
		LazyOreAdd.addOreRecipes(new ItemStack(RegBlocks.infusedGoldOre), new ItemStack(RegBlocks.infusedGoldBlock), 
				new ItemStack(RegItems.infusedGoldIngot), new ItemStack(RegItems.infusedGoldNugget), 
				new ItemStack(RegItems.infusedGoldItemCasing), new ItemStack(RegItems.infusedGoldPlate), 
				new ItemStack(RegItems.infusedGoldDensePlate), new ItemStack(RegItems.infusedGoldCrushedOre), 
				new ItemStack(RegItems.infusedGoldPurifiedCrushedOre), new ItemStack(RegItems.infusedGoldTinyPile), 
				IC2Items.getItem("smallGoldDust"), new ItemStack(RegItems.infusedGoldDust));
	}
	
}
