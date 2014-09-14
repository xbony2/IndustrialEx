package xbony2.IndustrialEx.crossmod.frail;

import ic2.api.recipe.IRecipeInput;

import java.util.Arrays;
import java.util.List;

import net.minecraft.item.ItemStack;

import com.ewyboy.floatingrails.Content.Technical.BlocksAndItems;

public class LavaLilyPadInput1 implements IRecipeInput{

	@Override
	public boolean matches(ItemStack subject) {
		if(new ItemStack(BlocksAndItems.LavaLilySpawner).getItem() == subject.getItem()){
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
		List<ItemStack> daList = Arrays.asList(new ItemStack(BlocksAndItems.LavaLilySpawner));
		return daList;
	}

}