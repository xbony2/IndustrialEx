package xbony2.industrialex.recipes;

import xbony2.industrialex.common.RegItems;
import xbony2.industrialex.IndustrialExpansion;
import ic2.api.item.IC2Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class ShapelessRecipes {

	/**
	 * Adds all the shapeless recipes
	 */
	public static void addRecipes(){
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(RegItems.steelNugget, 9), new Object[]{
			"ingotSteel"}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(RegItems.darkSteelNugget, 9), new Object[]{
			"ingotDarkSteel"}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(RegItems.darkSteelIngot, 9), new Object[]{
			"blockDarkSteel"}));
	}
}
