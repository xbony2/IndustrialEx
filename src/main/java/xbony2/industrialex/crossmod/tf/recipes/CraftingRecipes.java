package xbony2.industrialex.crossmod.tf.recipes;

import net.minecraftforge.oredict.ShapedOreRecipe;
import thermalfoundation.item.TFItems;
import xbony2.industrialex.common.IEConfig;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingRecipes {
	private static final String[] HELMET = new String[]{"xxx", "x x"};
	private static final String[] CHESTPLATE = new String[]{"x x", "xxx", "xxx"};
	private static final String[] LEGGINGS = new String[]{"xxx", "x x", "x x"};
	private static final String[] BOOTS = new String[]{"x x", "x x"};
	private static final String[] PICKAXE = new String[]{"xxx", " s ", " s "};
	private static final String[] SWORD = new String[]{" x ", " x ", " s "};
	private static final String[] SHOVEL = new String[]{"x", "s", "s"};
	private static final String[] AXE = new String[]{"xx", "xs", " s"};
	private static final String[] BLOCK = new String[]{"xxx", "xxx", "xxx"};
	
	/**
	 * Adds crafting recipes for TE crossmod stuff
	 */
	public static void addRecipes(){
		if(IEConfig.ferrousDusts) GameRegistry.addRecipe(new ShapedOreRecipe((TFItems.dustNickel), new Object[]{
			BLOCK, 'x', "dustTinyNickel"}));
		
		if(IEConfig.shinyDusts) GameRegistry.addRecipe(new ShapedOreRecipe((TFItems.dustPlatinum), new Object[]{
			BLOCK, 'x', "dustTinyPlatinum"}));
		
		if(IEConfig.manaDusts) GameRegistry.addRecipe(new ShapedOreRecipe((TFItems.dustMithril), new Object[]{
			BLOCK, 'x', "dustTinyMithril"}));
	}
}
