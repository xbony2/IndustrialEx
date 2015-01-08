package xbony2.industrialex.crossmod.bauble.recipes;

import ic2.api.item.IC2Items;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import xbony2.industrialex.crossmod.bauble.Baubles;
import cpw.mods.fml.common.registry.GameRegistry;

public class ShapedRecipes {

	public static void addRecipes(){
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Baubles.UnChargedNanoRing, 1), new Object[]{
			" c ",
			"c c",
			" e ", 'c', IC2Items.getItem("carbonPlate"), 'e', IC2Items.getItem("energyCrystal")}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Baubles.UnChargedNanoBelt, 1), new Object[]{
			" c ",
			"cec",
			" c ", 'c', IC2Items.getItem("carbonPlate"), 'e', IC2Items.getItem("energyCrystal")}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Baubles.UnChargedNanoAmulet, 1), new Object[]{
			" s ",
			"s s",
			"cec", 'c', IC2Items.getItem("carbonPlate"), 'e', IC2Items.getItem("energyCrystal"), 's', Items.string}));
	}
}
