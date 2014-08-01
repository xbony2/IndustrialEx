package xbony2.IndustrialEx.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import xbony2.IndustrialEx.IndustrialExpansion;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class IEItem extends Item{
	public IEItem(String unlocalizedName){
		super();
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(IndustrialExpansion.IndustrialExTab);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister){
		this.itemIcon = par1IconRegister.registerIcon("industrialEx:" + this.getUnlocalizedName());
	}
}
