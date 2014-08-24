package xbony2.IndustrialEx.crops;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class CC0 implements Runnable{

	@Override
	public void run(){
		try{
			new CC1(3000, "RedMushroom", "Xbony2 & MistrX", new ItemStack(Blocks.red_mushroom, 3), new ItemStack(Blocks.red_mushroom), 2, 2, 1, 2, /**/0, 1, 3, 0, 2, new String[]{"red", "mushroom", "food"});
			new CC1(3001, "RedMushroom", "Xbony2 & MistrX", new ItemStack(Blocks.brown_mushroom, 3), new ItemStack(Blocks.brown_mushroom), 2, 2, 1, 2, /**/0, 2, 0, 0, 2, new String[]{"brown", "mushroom", "food"});
		}catch(Throwable e){
			System.out.println("[ERROROEERRORERRORERRORERRORERROREERORROE] CROPS NOT WORKING!!! #BLAMEGREG");
		}
	}

}
