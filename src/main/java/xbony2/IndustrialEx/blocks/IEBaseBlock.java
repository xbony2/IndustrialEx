package xbony2.IndustrialEx.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import xbony2.IndustrialEx.IndustrialExpansion;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraftforge.oredict.OreDictionary;

public class IEBaseBlock extends Block{

	public IEBaseBlock(Material material, String unlocalizedName) {
		super(material);
		
		this.setBlockName(unlocalizedName);
		this.setCreativeTab(IndustrialExpansion.IndustrialExTab);
		this.setStepSound(soundTypePiston);
		this.setHardness(3.0F);
		this.setResistance(10.0F);
		
		GameRegistry.registerBlock(this, unlocalizedName);
		OreDictionary.registerOre(unlocalizedName, this);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister){
		this.blockIcon = par1IconRegister.registerIcon("industrialEx:" + this.getUnlocalizedName());
	}
}
