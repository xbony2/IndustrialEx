package xbony2.IndustrialEx.crops;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import ic2.api.crops.CropCard;
import ic2.api.crops.ICropTile;
import ic2.core.IC2;

public class RedMushroom extends CropCard{

	private int growStages = 2;
	
	@Override
	public String name() {
		return "rmushroom";
	}

	@SideOnly(Side.CLIENT)
    public void registerSprites(IIconRegister iconRegister){
        this.textures = new IIcon[this.maxSize()];

        for (int i = 1; i <= this.textures.length; ++i){
            this.textures[i - 1] = iconRegister.registerIcon("industrialex:crop/" + this.name() + "." + i);
        }
    }
	
	@Override
	public int tier() {
		return 2;
	}

	public String discoveredBy(){
		return "xbony2 & MistrX";
	}
	
	@Override
	public int stat(int n){
        switch (n){
            case 0:
                return 0;
            case 1:
                return 5;
            case 2:
                return 1;
            case 3:
                return 0;
            case 4:
                return 1;
            default:
                return 0;
        }
    }
	@Override
	public String[] attributes() {
		return new String[]{"red", "mushroom", "poisonous"};
	}

	@Override
	public int maxSize() {
		return growStages;
	}

	@Override
	public boolean canGrow(ICropTile crop) {
		return crop.getSize() < maxSize();
	}

	@Override
	public boolean canBeHarvested(ICropTile crop) {
		return crop.getSize() == growStages;
	}

	@Override
	public ItemStack getGain(ICropTile crop) {
		return new ItemStack(Blocks.red_mushroom);
	}
	
	public int weightInfluences(ICropTile crop, float humidity, float nutrients, float air){
        return (int) ((double)humidity * 1.1d + (double)nutrients * 0.9d + (double)air);
    }
	
	public ItemStack getSeeds(ICropTile crop){
        return crop.getGain() <= 1 && crop.getGrowth() <= 1 && crop.getResistance() <= 1 ? new ItemStack(Blocks.red_mushroom, IC2.random.nextInt(2) + 1) : super.getSeeds(crop);
    }

	public byte getSizeAfterHarvest(ICropTile crop){
        return (byte)1;
    }
}
