package xbony2.industrialex.crossmod.natura;

import net.minecraft.item.ItemStack;
import mods.natura.common.NContent;
import ic2.api.crops.CropCard;
import ic2.api.crops.Crops;

public class CropHandler {
	public static CropCard cropGreenGlowshroom;
	
	public static void registerCrops(){
		
	}
	
	public static void registerSeeds(){
		Crops.instance.registerBaseSeed(new ItemStack(NContent.glowshroomGreen), cropGreenGlowshroom.getId(), 1, 1, 1, 1);
	}
}
