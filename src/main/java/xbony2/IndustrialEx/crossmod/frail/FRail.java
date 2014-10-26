package xbony2.IndustrialEx.crossmod.frail;

import cpw.mods.fml.common.registry.GameRegistry;
import xbony2.IndustrialEx.items.IEItem;
import ic2.api.recipe.Recipes;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class FRail {

	public static Item dyeOrange;
	
	public static void init(){
		dyeOrange = new IEItem("dyeOrange");
		
		LavaLilyPadInput1 input1 = new LavaLilyPadInput1();
		Recipes.extractor.addRecipe(input1, null, new ItemStack(dyeOrange));
	}
}
