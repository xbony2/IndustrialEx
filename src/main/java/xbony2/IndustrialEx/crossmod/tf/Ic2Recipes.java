package xbony2.IndustrialEx.crossmod.tf;

import ic2.api.item.IC2Items;
import ic2.api.recipe.Recipes;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import thermalfoundation.block.BlockOre;
import thermalfoundation.item.TFItems;
import xbony2.IndustrialEx.api.recipe.IC2RecipeInput;
import xbony2.IndustrialEx.registery.IEConfig;

public class Ic2Recipes {
	/**
	 * Adds all the recipes for TE crossmod stuff
	 */
	protected static void addRecipes(){
		NBTTagCompound orewash = new NBTTagCompound();
	    orewash.setInteger("amount", 1000);
	    NBTTagCompound centerf = new NBTTagCompound();
	    centerf.setInteger("minHeat", 1500);
	    
		IC2RecipeInput input0 = new IC2RecipeInput(TFItems.rodBlizz);
		Recipes.macerator.addRecipe(input0, null, new ItemStack(TFItems.dustBlizz.getItem(), 4, 1025));
		IC2RecipeInput input00 = new IC2RecipeInput(TFItems.dustBlizz);
		Recipes.extractor.addRecipe(input00, null, new ItemStack(Items.snowball));
		
		if(IEConfig.shinyDusts){
			IC2RecipeInput input1 = new IC2RecipeInput(BlockOre.orePlatinum);
			Recipes.macerator.addRecipe(input1, null, new ItemStack(ThermalFoundation.crushedShinyOre, 2));
			IC2RecipeInput input4 = new IC2RecipeInput(new ItemStack(ThermalFoundation.crushedShinyOre));
			Recipes.oreWashing.addRecipe(input4, orewash, new ItemStack[]{
					new ItemStack(ThermalFoundation.purifiedCrushedShinyOre),
					new ItemStack(ThermalFoundation.tinyPileShinyDust, 2),
					IC2Items.getItem("stoneDust")});
			IC2RecipeInput input7 = new IC2RecipeInput(new ItemStack(ThermalFoundation.purifiedCrushedShinyOre));
			Recipes.centrifuge.addRecipe(input7, centerf, new ItemStack[]{
					IC2Items.getItem("smallSilverDust"),
					TFItems.dustPlatinum});
			Recipes.centrifuge.addRecipe(input4, centerf, new ItemStack[]{
					IC2Items.getItem("smallSilverDust"),
					TFItems.dustPlatinum,
					IC2Items.getItem("stoneDust")});
			IC2RecipeInput input10 = new IC2RecipeInput(TFItems.ingotPlatinum);
			Recipes.macerator.addRecipe(input10, null, TFItems.dustPlatinum);
		}
		
		if(IEConfig.ferrousDusts){
			IC2RecipeInput input2 = new IC2RecipeInput(BlockOre.oreNickel);
			Recipes.macerator.addRecipe(input2, null, new ItemStack(ThermalFoundation.crushedFerrousOre, 2));
			IC2RecipeInput input5 = new IC2RecipeInput(new ItemStack(ThermalFoundation.crushedFerrousOre));
			Recipes.oreWashing.addRecipe(input5, orewash, new ItemStack[]{
					new ItemStack(ThermalFoundation.purifiedCrushedFerrousOre),
					new ItemStack(ThermalFoundation.tinyPileFerrousDust, 2),
					IC2Items.getItem("stoneDust")});
			IC2RecipeInput input8 = new IC2RecipeInput(new ItemStack(ThermalFoundation.purifiedCrushedFerrousOre));
			Recipes.centrifuge.addRecipe(input8, centerf, new ItemStack[]{
					IC2Items.getItem("smallIronDust"),
					TFItems.dustNickel});
			Recipes.centrifuge.addRecipe(input5, centerf, new ItemStack[]{
					IC2Items.getItem("smallIronDust"),
					TFItems.dustNickel,
					IC2Items.getItem("stoneDust")});
			IC2RecipeInput input11 = new IC2RecipeInput(TFItems.ingotNickel);
			Recipes.macerator.addRecipe(input11, null, TFItems.dustNickel);
		}
		
		if(IEConfig.manaDusts){
			IC2RecipeInput input3 = new IC2RecipeInput(BlockOre.oreMithril);
			Recipes.macerator.addRecipe(input3, null, new ItemStack(ThermalFoundation.crushedManaOre, 2));
			IC2RecipeInput input6 = new IC2RecipeInput(new ItemStack(ThermalFoundation.crushedManaOre));
			Recipes.oreWashing.addRecipe(input6, orewash, new ItemStack[]{
					new ItemStack(ThermalFoundation.purifiedCrushedManaOre),
					new ItemStack(ThermalFoundation.tinyPileManaDust, 2),
					IC2Items.getItem("stoneDust")});
			IC2RecipeInput input9 = new IC2RecipeInput(new ItemStack(ThermalFoundation.purifiedCrushedManaOre));
			Recipes.centrifuge.addRecipe(input9, centerf, new ItemStack[]{
					IC2Items.getItem("smallSilverDust"),
					TFItems.dustMithril});
			Recipes.centrifuge.addRecipe(input6, centerf, new ItemStack[]{
					IC2Items.getItem("smallSilverDust"),
					TFItems.dustMithril,
					IC2Items.getItem("stoneDust")});
			IC2RecipeInput input12 = new IC2RecipeInput(TFItems.ingotMithril);
			Recipes.macerator.addRecipe(input12, null, TFItems.dustMithril);
		}
	}
}
