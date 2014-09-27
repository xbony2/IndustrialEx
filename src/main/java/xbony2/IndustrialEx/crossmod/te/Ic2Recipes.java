package xbony2.IndustrialEx.crossmod.te;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import ic2.api.recipe.Recipes;
import thermalfoundation.item.TFItems;
import xbony2.IndustrialEx.crossmod.te.ic2recipes.*;
import xbony2.IndustrialEx.registery.IEConfig;

public class Ic2Recipes {
	/**
	 * Adds all the recipes for TE crossmod stuff
	 */
	public static void addRecipes(){
		BlizrodInput1 input0 = new BlizrodInput1();
		Recipes.macerator.addRecipe(input0, null, new ItemStack(TFItems.dustBlizz.getItem(), 4, 1025));
		BlizDustInput1 input00 = new BlizDustInput1();
		Recipes.extractor.addRecipe(input00, null, new ItemStack(Items.snowball));
		if(IEConfig.shinyDusts){
			ShinyOreInput1 input1 = new ShinyOreInput1();
			Recipes.macerator.addRecipe(input1, null, new ItemStack(ThermalExpansion4.crushedShinyOre, 2));
		}
		
		if(IEConfig.ferrousDusts){
			FerrousOreInput1 input2 = new FerrousOreInput1();
			Recipes.macerator.addRecipe(input2, null, new ItemStack(ThermalExpansion4.crushedFerrousOre, 2));
		}
		
		if(IEConfig.manaDusts){
			ManaOreInput1 input3 = new ManaOreInput1();
			Recipes.macerator.addRecipe(input3, null, new ItemStack(ThermalExpansion4.crushedManaOre, 2));
		}
	}
}
