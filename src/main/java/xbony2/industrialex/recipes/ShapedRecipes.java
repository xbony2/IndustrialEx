package xbony2.industrialex.recipes;

import ic2.api.item.IC2Items;
import xbony2.industrialex.common.RegBlocks;
import xbony2.industrialex.common.RegItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class ShapedRecipes {
	
	public static final String[] HELMET = new String[]{"XXX", "X X"};
	public static final String[] CHESTPLATE = new String[]{"X X", "XXX", "XXX"};
	public static final String[] LEGGINGS = new String[]{"XXX", "X X", "X X"};
	public static final String[] BOOTS = new String[]{"X X", "X X"};
	public static final String[] PICKAXE = new String[]{"XXX", " S ", " S "};
	public static final String[] SWORD = new String[]{"X", "X", "S"};
	public static final String[] SHOVEL = new String[]{"X", "S", "S"};
	public static final String[] AXE = new String[]{"XX", "XS", " S"};
	public static final String[] BLOCK = new String[]{"XXX", "XXX", "XXX"};
	public static final String[] BLOCK_M = new String[]{"XXX", "XYX", "XXX"};
	
	/**
	 * Adds all the shaped recipes.
	 * 
	 * @author xbony2
	 */
	public static void addRecipes(){
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RegBlocks.darkSteelBlock), new Object[]{
			BLOCK, 'X', "ingotDarkSteel"}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RegItems.darkSteelKinRotor), new Object[]{
				" b ",
				"bsb",
				" b ", 's', IC2Items.getItem("steelshaft"), 'b', RegItems.darkSteelRotorBlade}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RegItems.darkSteelRotorBlade), new Object[]{
			"PIP",
			"PIP",
			"PIP", 'P', "plateDarkSteel", 'I', "ingotDarkSteel"}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RegItems.darkSteelIngot), new Object[]{
			BLOCK, 'X', "nuggetDarkSteel"}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(IC2Items.getItem("advIronIngot").getItem(), 1, 3), new Object[]{
			BLOCK, 'X', "nuggetSteel"}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RegItems.darkMixedMetalIngot), new Object[]{
			"NNN",
			"SOS",
			"NNN", 'N', "nuggetSteel", 'S', "ingotSilver", 'O', "plateObsidian"}));
	}
}
