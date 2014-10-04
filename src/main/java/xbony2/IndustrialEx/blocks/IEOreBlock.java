package xbony2.IndustrialEx.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

public class IEOreBlock extends IEBlock{

	private Item gem;
	private int gemMeta;
	
	public IEOreBlock(Material material, String unlocalizedName) {
		super(material, unlocalizedName);
		this.setResistance(5.0F);
	}
	
	public IEOreBlock(Material material, String unlocalizedName, Item gem) {
		super(material, unlocalizedName);
		this.setResistance(5.0F);
		this.gem = gem;
	}
	
	public IEOreBlock(Material material, String unlocalizedName, Item gem, int gemMeta) {
		super(material, unlocalizedName);
		this.setResistance(5.0F);
		this.gem = gem;
		this.gemMeta = gemMeta;
	}

	@Override
	public Item getItemDropped(int par1, Random rand, int par2){
		if(gem != null) return gem;
		return Item.getItemFromBlock(this);
    }
	
	@Override
	public int damageDropped(int meta){
		return gemMeta;
	}
	
	@Override
    public int getExpDrop(IBlockAccess access, int metadata, int fortune){
		if(gem != null){
			int rand = new Random().nextInt(7) + 1;
			return rand;
		}
		return 0;
    }
}
