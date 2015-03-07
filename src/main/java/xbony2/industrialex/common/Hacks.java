package xbony2.industrialex.common;

import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import xbony2.industrialex.api.BonyDebugger;
import ic2.api.item.IC2Items;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

public final class Hacks {
	public static void doHacks(){
		if(IEConfig.isHardcoreMaceratorOn) makeHardcoreMaceratorRecipe();
	}
	
	public static void makeHardcoreMaceratorRecipe(){	
		List<IRecipe> rList = CraftingManager.getInstance().getRecipeList();
		Iterator<IRecipe> rIter = rList.iterator();
		
		while(rIter.hasNext()){
			ItemStack itemStack = rIter.next().getRecipeOutput();
			if (itemStack != null && itemStack == IC2Items.getItem("macerator"))
				rIter.remove();
		}
	}
}
