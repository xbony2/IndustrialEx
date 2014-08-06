package xbony2.IndustrialEx.recipes;

import xbony2.IndustrialEx.IndustrialExpansion;
import xbony2.IndustrialEx.registery.RegItems;
import ic2.api.item.IC2Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class ShapelessRecipes {

	/**
	 * Adds all the shapeless recipes
	 */
	public static void addRecipes(){
		/*GameRegistry.addShapelessRecipe(new ItemStack(RegItems.darkSteelNugget, 9), new Object[]{
			new ItemStack(RegItems.darkSteelIngot)});*/
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(RegItems.steelNugget, 9), new Object[]{
			"ingotSteel"}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(RegItems.darkSteelNugget, 9), new Object[]{
			"ingotDarkSteel"}));
	}
}
