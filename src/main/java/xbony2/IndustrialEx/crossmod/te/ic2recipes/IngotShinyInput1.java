package xbony2.IndustrialEx.crossmod.te.ic2recipes;

import java.util.Arrays;
import java.util.List;

import thermalfoundation.item.TFItems;
import net.minecraft.item.ItemStack;
import ic2.api.recipe.IRecipeInput;

public class IngotShinyInput1 implements IRecipeInput{

	@Override
	public boolean matches(ItemStack subject){
		if(TFItems.ingotPlatinum.getItem() == subject.getItem() && subject.getItemDamage() == TFItems.ingotPlatinum.getItemDamage()){
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
		List<ItemStack> list = Arrays.asList(new ItemStack(TFItems.ingotPlatinum.getItem(), 1, TFItems.ingotPlatinum.getItemDamage()));
		return list;
	}

}
