package xbony2.IndustrialEx.crossmod.te.ic2recipes;

import java.util.Arrays;
import java.util.List;

import thermalfoundation.item.TFItems;
import net.minecraft.item.ItemStack;
import ic2.api.recipe.IRecipeInput;

public class BlizrodInput1 implements IRecipeInput{

	@Override
	public boolean matches(ItemStack subject){
		if(TFItems.rodBlizz.getItem() == subject.getItem() && subject.getItemDamage() == 1024){
			return true;
		}
		return false;
	}

	@Override
	public int getAmount(){
		return 1;
	}

	@Override
	public List<ItemStack> getInputs() {
		List<ItemStack> list = Arrays.asList(new ItemStack(TFItems.rodBlizz.getItem(), 1, 1024));
		return list;
	}

}
