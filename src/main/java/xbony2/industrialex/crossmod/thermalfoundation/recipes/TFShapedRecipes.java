package xbony2.industrialex.crossmod.thermalfoundation.recipes;

import net.minecraftforge.oredict.ShapedOreRecipe;
import cofh.thermalfoundation.item.TFItems;
import xbony2.industrialex.common.IEConfig;
import xbony2.industrialex.recipes.ShapedRecipes;
import cpw.mods.fml.common.registry.GameRegistry;

public class TFShapedRecipes {
	
	/**
	 * Adds crafting recipes for TE crossmod stuff
	 */
	public static void addRecipes(){
		if(IEConfig.ferrousDusts) GameRegistry.addRecipe(new ShapedOreRecipe((TFItems.dustNickel), new Object[]{
			ShapedRecipes.BLOCK, 'X', "dustTinyNickel"}));
		
		if(IEConfig.shinyDusts) GameRegistry.addRecipe(new ShapedOreRecipe((TFItems.dustPlatinum), new Object[]{
				ShapedRecipes.BLOCK, 'X', "dustTinyPlatinum"}));
		
		if(IEConfig.manaDusts) GameRegistry.addRecipe(new ShapedOreRecipe((TFItems.dustMithril), new Object[]{
				ShapedRecipes.BLOCK, 'X', "dustTinyMithril"}));
	}
}
