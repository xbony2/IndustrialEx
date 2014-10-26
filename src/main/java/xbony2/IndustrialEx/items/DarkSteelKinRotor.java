package xbony2.IndustrialEx.items;

import ic2.api.item.IKineticWindRotor;
import ic2.core.init.InternalName;
import ic2.core.item.ItemGradualInt;
import xbony2.IndustrialEx.IndustrialExpansion;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class DarkSteelKinRotor extends ItemGradualInt implements IKineticWindRotor{
	public static final int DURABILITY = 11;
	public static final int MAXDAMAGE = 604800;
	
	public DarkSteelKinRotor(){
		super(null, MAXDAMAGE);
		
		this.setUnlocalizedName("darkSteelKinRotor");
		this.setCreativeTab(IndustrialExpansion.IndustrialExTab);
		this.setMaxDamage(MAXDAMAGE);
		this.setMaxStackSize(1);
		
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
		return new ResourceLocation("industrialex", "textures/items/rotorDarkSteelmodel");
	}

	@Override
	public float getefficiency() {
		return 1.0F;
	}

	@Override
	public int getminWindStrength() {
		return 17;
	}

	@Override
	public int getmaxWindStrength() {
		return 90;
	}
}
