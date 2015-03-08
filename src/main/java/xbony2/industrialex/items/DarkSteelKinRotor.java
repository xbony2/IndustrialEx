package xbony2.industrialex.items;

import net.minecraft.entity.player.EntityPlayer;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ic2.api.item.ICustomDamageItem;
import ic2.api.item.IKineticWindRotor;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import xbony2.industrialex.IndustrialExpansion;
import xbony2.industrialex.api.util.LangHelper;

import java.util.List;

public class DarkSteelKinRotor extends Item implements ICustomDamageItem, IKineticWindRotor{
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
	public void registerIcons(IIconRegister register){
		this.itemIcon = register.registerIcon("industrialEx:" + "darkSteelKinRotor");
	}

	@Override
	public int getDiameter(ItemStack itemstack) {
		return 9;
	}

	@Override
	public ResourceLocation getRotorRenderTexture(ItemStack itemstack) {
		return new ResourceLocation("industrialex", "textures/items/rotorDarkSteelmodel.png");
	}

	@Override
	public float getEfficiency(ItemStack stack) {
		return 1.0F;
	}

	@Override
	public int getMinWindStrength(ItemStack stack) {
		return 17;
	}

	@Override
	public int getMaxWindStrength(ItemStack stack) {
		return 90;
	}

	@Override
	public int getCustomDamage(ItemStack stack) {
		return stack.getItemDamage();
	}

	@Override
	public int getMaxCustomDamage(ItemStack stack) {
		return MAX_DAMAGE;
	}

	@Override
	public void setCustomDamage(ItemStack stack, int damage) {
		stack.setItemDamage(damage);
	}

	@Override
	public boolean applyCustomDamage(ItemStack stack, int damage, EntityLivingBase src) {
		setCustomDamage(stack, getCustomDamage(stack) + damage);
		return true;
	}
	
	public void addInformation(ItemStack itemStack, EntityPlayer player, List info, boolean b){
		info.add(LangHelper.translate("ic2.itemrotor.wind.info", new Object[] { 
				Integer.valueOf(getMinWindStrength(null)), Integer.valueOf(getMaxWindStrength(null)) }));
	}
}
