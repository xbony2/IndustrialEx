package xbony2.IndustrialEx.recipes;

import net.minecraft.item.ItemStack;
import xbony2.IndustrialEx.recipes.metalformer.DSBlockInput;
import xbony2.IndustrialEx.recipes.metalformer.DSIngotInput;
import xbony2.IndustrialEx.recipes.metalformer.DSPlateInput1;
import xbony2.IndustrialEx.recipes.metalformer.DSPlateInput2;
import xbony2.IndustrialEx.registery.RegBlocks;
import xbony2.IndustrialEx.registery.RegItems;
import ic2.api.recipe.IRecipeInput;
import ic2.api.recipe.Recipes;

public class MetalFormerRecipes{

	/**
	 * Adds all the metal former recipes.
	 */
	public static void addRecipes(){
		DSBlockInput input1 = new DSBlockInput();
		Recipes.metalformerExtruding.addRecipe(input1, null, new ItemStack(RegItems.darkSteelShaft));
		DSPlateInput1 input2 = new DSPlateInput1();
		Recipes.metalformerRolling.addRecipe(input2, null, new ItemStack(RegItems.darkSteelItemCasing, 2));
		DSIngotInput input3 = new DSIngotInput();
		Recipes.metalformerRolling.addRecipe(input3, null, new ItemStack(RegItems.darkSteelPlate));
		Recipes.blockcutter.addRecipe(input1, null, new ItemStack(RegItems.darkSteelPlate, 9));
		DSPlateInput2 input4 = new DSPlateInput2();
		Recipes.compressor.addRecipe(input4, null, new ItemStack(RegItems.darkSteelDensePlate));
	}
	
}
