package xbony2.IndustrialEx.crops;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ic2.api.crops.CropCard;
import ic2.api.crops.ICropTile;
import ic2.core.IC2;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BrownMushroom extends CropCard{
    
	public String name(){
        return "bmushroom";
    }

    public String discoveredBy(){
        return "xbony2 & MistrX";
    }
    
    @SideOnly(Side.CLIENT)
    public void registerSprites(IIconRegister iconRegister){
        this.textures = new IIcon[this.maxSize()];

        for (int i = 1; i <= this.textures.length; ++i){
            this.textures[i - 1] = iconRegister.registerIcon("industrialex:crop/" + this.name() + "." + i);
        }
    }

    public int tier(){
        return 2;
    }

    public int stat(int n) {
    	switch (n){
        	case 0:
        		return 0;
        	case 1:
        		return 5;
        	case 2:
        		return 0;
        	case 3:
        		return 0;
        	case 4:
        		return 1;
        	default:
        		return 0;
        }
    }

    public String[] attributes(){
        return new String[] {"brown", "mushroom", "food"};
    }

    public int maxSize(){
        return 2;
    }

    public boolean canGrow(ICropTile crop){
    	return crop.getSize() < maxSize();
    }

    public int weightInfluences(ICropTile crop, float humidity, float nutrients, float air){
        return (int) ((double)humidity * 10 + (double)nutrients * 0.9d + (double)air);
    }

    public boolean canBeHarvested(ICropTile crop){
        return crop.getSize() == 2;
    }

    public ItemStack getGain(ICropTile crop){
        return new ItemStack(Blocks.brown_mushroom);
    }

    public ItemStack getSeeds(ICropTile crop){
        return crop.getGain() <= 1 && crop.getGrowth() <= 1 && crop.getResistance() <= 1 ? new ItemStack(Blocks.brown_mushroom, IC2.random.nextInt(2) + 1) : super.getSeeds(crop);
    }
    
    public byte getSizeAfterHarvest(ICropTile crop){
        return (byte)1;
    }
}

