package xbony2.industrialex.crossmod.natura.crops;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.natura.common.NContent;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
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
		switch (n) {
		case 0: return 0;
		case 1: return 4;
		case 2: return 0;
		case 3: return 0;
		case 4: return 4;
		}
		return 0;
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
	
	public String discoveredBy(){
		return "xbony2";
	}
	
	@SideOnly(Side.CLIENT)
	public void registerSprites(IIconRegister iconRegister) {
		textures = new IIcon[maxSize()];

		for (int i = 1; i <= textures.length; i++) {
			textures[i-1] = iconRegister.registerIcon("industrialex:crop/crop." + name() + i);
		}
	}
	
	@Override
	public int getEmittedLight(ICropTile crop) {
		return 8;
	}
}
