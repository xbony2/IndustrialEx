package xbony2.IndustrialEx.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import xbony2.IndustrialEx.IndustrialExpansion;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class IEBlock extends Block{

	public IEBlock(Material material, String unlocalizedName) {
		super(material);
		
		this.setBlockName(unlocalizedName);
		this.setCreativeTab(IndustrialExpansion.IndustrialExTab);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister){
		this.blockIcon = par1IconRegister.registerIcon("industrialEx:" + this.getUnlocalizedName());
	}
}