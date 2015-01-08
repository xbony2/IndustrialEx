package xbony2.industrialex.crossmod.tf.recipes;

import net.minecraftforge.oredict.ShapedOreRecipe;
import thermalfoundation.item.TFItems;
import xbony2.industrialex.common.IEConfig;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingRecipes {
	private static final String[] helmet = new String[]{"xxx", "x x"};
	private static final String[] chestplate = new String[]{"x x", "xxx", "xxx"};
	private static final String[] leggings = new String[]{"xxx", "x x", "x x"};
	private static final String[] boots = new String[]{"x x", "x x"};
	private static final String[] pickaxe = new String[]{"xxx", " s ", " s "};
	private static final String[] sword = new String[]{" x ", " x ", " s "};
	private static final String[] shovel = new String[]{"x", "s", "s"};
	private static final String[] axe = new String[]{"xx", "xs", " s"};
	private static final String[] block = new String[]{"xxx", "xxx", "xxx"};
	
	/**
	 * Adds crafting recipes for TE crossmod stuff
	 */
	public static void addRecipes(){
		if(IEConfig.ferrousDusts) GameRegistry.addRecipe(new ShapedOreRecipe((TFItems.dustNickel), new Object[]{
			block, 'x', "dustTinyNickel"}));
		
		if(IEConfig.shinyDusts) GameRegistry.addRecipe(new ShapedOreRecipe((TFItems.dustPlatinum), new Object[]{
			block, 'x', "dustTinyPlatinum"}));
		
		if(IEConfig.manaDusts) GameRegistry.addRecipe(new ShapedOreRecipe((TFItems.dustMithril), new Object[]{
			block, 'x', "dustTinyMithril"}));
	}
}
