package xbony2.IndustrialEx.crossmod.te.ic2recipes;

import java.util.Arrays;
import java.util.List;

import thermalfoundation.block.BlockOre;
import xbony2.IndustrialEx.crossmod.te.ThermalExpansion4;
import net.minecraft.item.ItemStack;
import ic2.api.recipe.IRecipeInput;

public class PCrushedShinyOreInput1 implements IRecipeInput{

	@Override
	public boolean matches(ItemStack subject){
		if(ThermalExpansion4.purifiedCrushedShinyOre == subject.getItem()){
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
		List<ItemStack> list = Arrays.asList(new ItemStack(ThermalExpansion4.purifiedCrushedShinyOre));
		return list;
	}

}
