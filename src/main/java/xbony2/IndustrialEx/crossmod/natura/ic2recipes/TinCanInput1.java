package xbony2.IndustrialEx.crossmod.natura.ic2recipes;

import ic2.api.item.IC2Items;
import ic2.api.recipe.IRecipeInput;

import java.util.Arrays;
import java.util.List;

import net.minecraft.item.ItemStack;

public class TinCanInput1 implements IRecipeInput{

	@Override
	public boolean matches(ItemStack subject) {
		if(new ItemStack(IC2Items.getItem("tinCan").getItem()).getItem() == subject.getItem()){
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
		List<ItemStack> daList = Arrays.asList(new ItemStack(IC2Items.getItem("tinCan").getItem()));
		return daList;
	}

}
