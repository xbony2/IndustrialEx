package xbony2.IndustrialEx.crossmod.natura.ic2recipes;

import ic2.api.recipe.IRecipeInput;

import java.util.Arrays;
import java.util.List;

import mods.natura.common.NContent;
import net.minecraft.item.ItemStack;

/**
 * Blueberry
 * @author xbony2
 *
 */
public class BerryInput2 implements IRecipeInput{

	@Override
	public boolean matches(ItemStack subject) {
		if(new ItemStack(NContent.berryItem).getItem() == subject.getItem() && subject.getItemDamage() == 1){
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
		List<ItemStack> list = Arrays.asList(new ItemStack(NContent.berryItem, 1, 1));
		return list;
	}

}
