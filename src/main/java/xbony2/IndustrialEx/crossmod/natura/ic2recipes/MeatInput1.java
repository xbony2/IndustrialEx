package xbony2.IndustrialEx.crossmod.natura.ic2recipes;

import ic2.api.recipe.IRecipeInput;

import java.util.Arrays;
import java.util.List;

import xbony2.IndustrialEx.api.BonyDebugger;
import mods.natura.common.NContent;
import net.minecraft.item.ItemStack;

/**
 * Raw Imphide
 * @author xbony2
 *
 */
public class MeatInput1 implements IRecipeInput{

	@Override
	public boolean matches(ItemStack subject) {
		if(new ItemStack(NContent.impMeat).getItem() == subject.getItem() && subject.getItemDamage() == 0){
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
		List<ItemStack> list = Arrays.asList(new ItemStack(NContent.impMeat));
		return list;
	}

}
