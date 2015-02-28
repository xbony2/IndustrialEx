package xbony2.industrialex.items;

import ic2.api.item.IKineticWindRotor;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import xbony2.industrialex.IndustrialExpansion;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DarkSteelKinRotor extends Item implements IKineticWindRotor{
	public static final int MAX_DAMAGE = 604800;
	
	public DarkSteelKinRotor(){
		super();
		
		this.setUnlocalizedName("darkSteelKinRotor");
		this.setCreativeTab(IndustrialExpansion.industrialExTab);
		this.setMaxDamage(MAX_DAMAGE);
		this.setMaxStackSize(1);
		
		GameRegistry.registerItem(this, "darkSteelKinRotor");
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
