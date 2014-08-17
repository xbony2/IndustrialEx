package xbony2.IndustrialEx.crossmod.bauble.items;

import ic2.api.item.IElectricItem;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import xbony2.IndustrialEx.crossmod.bauble.Baubles;
import baubles.api.BaubleType;
import baubles.api.IBauble;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class NanoRing extends Item implements IElectricItem, IBauble{
	public NanoRing(String unlocalized, boolean charged){
		super();
		
		this.setUnlocalizedName(unlocalized);
		this.setMaxStackSize(1);
		this.setMaxDamage(maxEnergyStorage);
		if(!charged){
		this.setDamage(new ItemStack(Baubles.UnChargedNanoRing), 0);
		}else{
			this.setDamage(new ItemStack(Baubles.ChargedNanoRing), maxEnergyStorage);
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister){
		this.itemIcon = par1IconRegister.registerIcon("industrialEx:" + this.getUnlocalizedName());
	}
	
	private final int maxEnergyStorage = 1000000;

	@Override
	public boolean canProvideEnergy(ItemStack itemStack){
		return false;
	}

	@Override
	public Item getChargedItem(ItemStack itemStack) {
		return Baubles.ChargedNanoRing;
	}

	@Override
	public Item getEmptyItem(ItemStack itemStack) {
		return Baubles.UnChargedNanoRing;
	}

	@Override
	public double getMaxCharge(ItemStack itemStack) {
		return maxEnergyStorage;
	}

	@Override
	public int getTier(ItemStack itemStack) {
		return 3;
	}

	@Override
	public double getTransferLimit(ItemStack itemStack) {
		return 2048;
	}

	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.RING;
	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		int prevDamage = this.getDamage(itemstack);
		if(prevDamage <= 0){
			;
		}else{
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), 100, 0));
			this.setDamage(itemstack, (prevDamage - 10));
		}
	}

	@Override
	public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
		
	}

	@Override
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
		
	}

	@Override
	public boolean canEquip(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}

	@Override
	public boolean canUnequip(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}
}
