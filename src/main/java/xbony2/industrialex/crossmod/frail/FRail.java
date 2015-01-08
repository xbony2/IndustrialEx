package xbony2.industrialex.crossmod.frail;

import ic2.api.recipe.Recipes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import xbony2.industrialex.api.recipe.IC2RecipeInput;
import xbony2.industrialex.items.IEItem;

import com.ewyboy.floatingrails.Content.Technical.BlocksAndItems;

public class FRail {

	public static Item dyeOrange;
	
	public static void init(){
		dyeOrange = new IEItem("dyeOrange");
		
		IC2RecipeInput input1 = new IC2RecipeInput(new ItemStack(BlocksAndItems.LavaLilySpawner));
		Recipes.extractor.addRecipe(input1, null, new ItemStack(dyeOrange));
	}
}
