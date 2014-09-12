package xbony2.IndustrialEx.crossmod.natura.ic2recipes;

import java.util.Arrays;
import java.util.List;

import xbony2.IndustrialEx.registery.RegBlocks;
import mods.natura.common.NContent;
import net.minecraft.item.ItemStack;
import ic2.api.recipe.IRecipeInput;

/**
 * Raspberry
 * @author xbony2
 *
 */
public class BerryInput1 implements IRecipeInput{

	@Override
	public boolean matches(ItemStack subject) {
		if(new ItemStack(NContent.berryItem).getItem() == subject.getItem()){
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
		List<ItemStack> daList = Arrays.asList(new ItemStack(NContent.berryItem));
		return daList;
	}

}
