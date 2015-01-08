package xbony2.industrialex.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import xbony2.industrialex.IndustrialExpansion;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class IEItem extends Item{
	public IEItem(String unlocalizedName){
		super();
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(IndustrialExpansion.IndustrialExTab);
		GameRegistry.registerItem(this, unlocalizedName);
		OreDictionary.registerOre(unlocalizedName, this);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister){
		this.itemIcon = par1IconRegister.registerIcon("industrialEx:" + this.getUnlocalizedName());
	}
}
