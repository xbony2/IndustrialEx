package xbony2.IndustrialEx.recipes.metalformer;

import ic2.api.recipe.IRecipeInput;

import java.util.Arrays;
import java.util.List;

import net.minecraft.item.ItemStack;
import xbony2.IndustrialEx.registery.RegBlocks;
import xbony2.IndustrialEx.registery.RegItems;

public class DSIngotInput implements IRecipeInput{

	@Override
	public boolean matches(ItemStack subject) {
		if(new ItemStack(RegItems.darkSteelIngot).getItem() == subject.getItem()){
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
		List<ItemStack> daList = Arrays.asList(new ItemStack(RegItems.darkSteelIngot));
		return daList;
	}

}
