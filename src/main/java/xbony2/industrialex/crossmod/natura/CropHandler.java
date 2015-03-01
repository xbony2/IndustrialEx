package xbony2.industrialex.crossmod.natura;

import xbony2.industrialex.api.BonyDebugger;
import xbony2.industrialex.crossmod.natura.crops.CropGreenGlowshroom;
import ic2.api.crops.CropCard;
import ic2.api.crops.Crops;
import mods.natura.common.NContent;
import net.minecraft.item.ItemStack;

public class CropHandler {
	public static CropCard cropGreenGlowshroom = new CropGreenGlowshroom();
	
	public static void registerCrops(){
		Crops.instance.registerCrop(cropGreenGlowshroom);
	}
	
	public static void registerSeeds(){
		if(!Crops.instance.registerBaseSeed(new ItemStack(NContent.glowshroomGreen, 4), cropGreenGlowshroom.getId(), 1, 1, 1, 1))
			BonyDebugger.debug();
	}
}
