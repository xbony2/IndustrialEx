package xbony2.IndustrialEx.items;

import ic2.api.item.IKineticWindRotor;
import xbony2.IndustrialEx.IndustrialExpansion;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class DarkSteelKinRotor extends Item implements IKineticWindRotor{
	public DarkSteelKinRotor(){
		super();
		
		this.setUnlocalizedName("darkSteelKinRotor");
		this.setCreativeTab(IndustrialExpansion.IndustrialExTab);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister){
		this.itemIcon = par1IconRegister.registerIcon("industrialEx:" + "darkSteelKinRotor");
	}

	@Override
	public int getDiameter() {
		return 9;
	}

	@Override
	public ResourceLocation getRotorRenderTexture() {
		return new ResourceLocation("textures/items/rotorDarkSteelmodel");
	}

	@Override
	public float getefficiency() {
		return 1;
	}

	@Override
	public int getminWindStrength() {
		return 0;
	}

	@Override
	public int getmaxWindStrength() {
		return 100;
	}
}
