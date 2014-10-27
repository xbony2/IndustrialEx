package xbony2.IndustrialEx.crossmod.te;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import ic2.api.item.IC2Items;
import ic2.api.recipe.Recipes;
import thermalfoundation.item.TFItems;
import xbony2.IndustrialEx.crossmod.te.ic2recipes.*;
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
	    
		BlizrodInput1 input0 = new BlizrodInput1();
		Recipes.macerator.addRecipe(input0, null, new ItemStack(TFItems.dustBlizz.getItem(), 4, 1025));
		BlizDustInput1 input00 = new BlizDustInput1();
		Recipes.extractor.addRecipe(input00, null, new ItemStack(Items.snowball));
		
		if(IEConfig.shinyDusts){
			ShinyOreInput1 input1 = new ShinyOreInput1();
			Recipes.macerator.addRecipe(input1, null, new ItemStack(ThermalExpansion4.crushedShinyOre, 2));
			CrushedShinyOreInput1 input4 = new CrushedShinyOreInput1();
			Recipes.oreWashing.addRecipe(input4, orewash, new ItemStack[]{
					new ItemStack(ThermalExpansion4.purifiedCrushedShinyOre),
					new ItemStack(ThermalExpansion4.tinyPileShinyDust, 2),
					IC2Items.getItem("stoneDust")});
			PCrushedShinyOreInput1 input7 = new PCrushedShinyOreInput1();
			Recipes.centrifuge.addRecipe(input7, centerf, new ItemStack[]{
					IC2Items.getItem("smallSilverDust"),
					TFItems.dustPlatinum});
			Recipes.centrifuge.addRecipe(input4, centerf, new ItemStack[]{
					IC2Items.getItem("smallSilverDust"),
					TFItems.dustPlatinum,
					IC2Items.getItem("stoneDust")});
			IngotShinyInput1 input10 = new IngotShinyInput1();
			Recipes.macerator.addRecipe(input10, null, TFItems.ingotPlatinum);
		}
		
		if(IEConfig.ferrousDusts){
			FerrousOreInput1 input2 = new FerrousOreInput1();
			Recipes.macerator.addRecipe(input2, null, new ItemStack(ThermalExpansion4.crushedFerrousOre, 2));
			CrushedFerrousOreInput1 input5 = new CrushedFerrousOreInput1();
			Recipes.oreWashing.addRecipe(input5, orewash, new ItemStack[]{
					new ItemStack(ThermalExpansion4.purifiedCrushedFerrousOre),
					new ItemStack(ThermalExpansion4.tinyPileFerrousDust, 2),
					IC2Items.getItem("stoneDust")});
			PCrushedFerrousOreInput1 input8 = new PCrushedFerrousOreInput1();
			Recipes.centrifuge.addRecipe(input8, centerf, new ItemStack[]{
					IC2Items.getItem("smallIronDust"),
					TFItems.dustNickel});
			Recipes.centrifuge.addRecipe(input5, centerf, new ItemStack[]{
					IC2Items.getItem("smallIronDust"),
					TFItems.dustNickel,
					IC2Items.getItem("stoneDust")});
			IngotFerrousInput1 input11 = new IngotFerrousInput1();
			Recipes.macerator.addRecipe(input11, null, TFItems.ingotNickel);
		}
		
		if(IEConfig.manaDusts){
			ManaOreInput1 input3 = new ManaOreInput1();
			Recipes.macerator.addRecipe(input3, null, new ItemStack(ThermalExpansion4.crushedManaOre, 2));
			CrushedManaOreInput1 input6 = new CrushedManaOreInput1();
			Recipes.oreWashing.addRecipe(input6, orewash, new ItemStack[]{
					new ItemStack(ThermalExpansion4.purifiedCrushedManaOre),
					new ItemStack(ThermalExpansion4.tinyPileManaDust, 2),
					IC2Items.getItem("stoneDust")});
			PCrushedManaOreInput1 input9 = new PCrushedManaOreInput1();
			Recipes.centrifuge.addRecipe(input9, centerf, new ItemStack[]{
					IC2Items.getItem("smallSilverDust"),
					TFItems.dustMithril});
			Recipes.centrifuge.addRecipe(input6, centerf, new ItemStack[]{
					IC2Items.getItem("smallSilverDust"),
					TFItems.dustMithril,
					IC2Items.getItem("stoneDust")});
			IngotManaInput1 input12 = new IngotManaInput1();
			Recipes.macerator.addRecipe(input12, null, TFItems.ingotMithril);
		}
	}
}
