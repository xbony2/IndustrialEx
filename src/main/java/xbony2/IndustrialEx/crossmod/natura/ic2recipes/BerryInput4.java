package xbony2.IndustrialEx.crossmod.natura.ic2recipes;

import ic2.api.recipe.IRecipeInput;

import java.util.Arrays;
import java.util.List;

import mods.natura.common.NContent;
import net.minecraft.item.ItemStack;

/**
 * Maloberry
 * @author xbony2
 *
 */
public class BerryInput4 implements IRecipeInput{

	@Override
	public boolean matches(ItemStack subject) {
		if(new ItemStack(NContent.berryItem, 1, 3) == subject && subject.getItemDamage() == 3){
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
		List<ItemStack> daList = Arrays.asList(new ItemStack(NContent.berryItem, 1, 3));
		return daList;
	}

}
