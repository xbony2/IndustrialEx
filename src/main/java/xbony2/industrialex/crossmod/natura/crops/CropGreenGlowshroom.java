package xbony2.industrialex.crossmod.natura.crops;

import mods.natura.common.NContent;
import net.minecraft.item.ItemStack;
import ic2.api.crops.CropCard;
import ic2.api.crops.ICropTile;

public class CropGreenGlowshroom extends CropCard {

	@Override
	public String name() {
		return "CropGreenGlowshroom";
	}

	@Override
	public int tier() {
		return 3;
	}

	@Override
	public int stat(int n) { //TODO: figure out what the index is for.
		return 1;
	}

	@Override
	public String[] attributes() {
		return new String[] {"Green", "Food", "Mushroom"};
	}

	@Override
	public int maxSize() {
		return 3;
	}

	@Override
	public boolean canGrow(ICropTile crop) {
		return (crop.getSize() < maxSize()) && (crop.getHydrationStorage() > 0);
	}

	@Override
	public int getOptimalHavestSize(ICropTile crop) {
		return 3;
	}

	@Override
	public boolean canBeHarvested(ICropTile crop) {
		return crop.getSize() >= 3;
	}

	@Override
	public ItemStack getGain(ICropTile crop) {
		if (crop.getSize() == 3) return new ItemStack(NContent.glowshroomGreen);
		return null;
	}

}
