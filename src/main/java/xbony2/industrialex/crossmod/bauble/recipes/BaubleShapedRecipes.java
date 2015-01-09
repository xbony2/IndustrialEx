package xbony2.industrialex.crossmod.bauble.recipes;

import ic2.api.item.IC2Items;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import xbony2.industrialex.crossmod.bauble.Baubles;
import cpw.mods.fml.common.registry.GameRegistry;

public class BaubleShapedRecipes {

	public static void addRecipes(){
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Baubles.unChargedNanoRing, 1), new Object[]{
			" C ",
			"C C",
			" E ", 'C', IC2Items.getItem("carbonPlate"), 'E', IC2Items.getItem("energyCrystal")}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Baubles.unChargedNanoBelt, 1), new Object[]{
			" C ",
			"CEC",
			" C ", 'C', IC2Items.getItem("carbonPlate"), 'E', IC2Items.getItem("energyCrystal")}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Baubles.unChargedNanoAmulet, 1), new Object[]{
			" S ",
			"S S",
			"CEC", 'C', IC2Items.getItem("carbonPlate"), 'E', IC2Items.getItem("energyCrystal"), 'S', Items.string}));
	}
}
