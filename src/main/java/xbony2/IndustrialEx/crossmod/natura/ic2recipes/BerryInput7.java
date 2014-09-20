package xbony2.IndustrialEx.crossmod.natura.ic2recipes;

import ic2.api.recipe.IRecipeInput;

import java.util.Arrays;
import java.util.List;

import xbony2.IndustrialEx.api.BonyDebugger;
import mods.natura.common.NContent;
import net.minecraft.item.ItemStack;

/**
 * Skyberry
 * @author xbony2
 *
 */
public class BerryInput7 implements IRecipeInput{

	@Override
	public boolean matches(ItemStack subject) {
		if(new ItemStack(NContent.netherBerryItem).getItem() == subject.getItem() && subject.getItemDamage() == 2){
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
		List<ItemStack> list = Arrays.asList(new ItemStack(NContent.netherBerryItem, 1, 2));
		return list;
	}

}
