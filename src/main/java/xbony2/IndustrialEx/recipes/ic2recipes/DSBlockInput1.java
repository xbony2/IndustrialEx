package xbony2.IndustrialEx.recipes.ic2recipes;

import ic2.api.recipe.IRecipeInput;

import java.util.Arrays;
import java.util.List;

import net.minecraft.item.ItemStack;
import xbony2.IndustrialEx.registery.RegBlocks;

public class DSBlockInput1 implements IRecipeInput{

	@Override
	public boolean matches(ItemStack subject) {
		if(new ItemStack(RegBlocks.darkSteelBlock).getItem() == subject.getItem()){
			return true;
		}
		return false;
	}

	@Override
	public int getAmount() {
		return 1;
	}

	@Override
	public List<ItemStack> getInputs() {
		List<ItemStack> daList = Arrays.asList(new ItemStack(RegBlocks.darkSteelBlock));
		return daList;
	}

}
