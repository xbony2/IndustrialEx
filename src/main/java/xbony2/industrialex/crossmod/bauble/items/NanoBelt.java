package xbony2.industrialex.crossmod.bauble.items;

import ic2.api.item.ElectricItem;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import xbony2.industrialex.api.electric.IElectricItemBony;
import xbony2.industrialex.crossmod.bauble.Baubles;
import baubles.api.BaubleType;
import baubles.api.IBauble;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class NanoBelt extends Item implements IElectricItemBony, IBauble{
	public NanoBelt(String unlocalized, boolean charged){
		super();
		
		this.setUnlocalizedName(unlocalized);
		this.setMaxStackSize(1);
		this.setMaxDamage(this.MAX_ENERGY_NANO + 1);
		if(!charged){
			this.setDamage(new ItemStack(Baubles.unChargedNanoBelt), 1);
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister){
		this.itemIcon = par1IconRegister.registerIcon("industrialEx:" + this.getUnlocalizedName());
	}

	@Override
	public boolean canProvideEnergy(ItemStack itemStack){
		return false;
	}

	@Override
	public Item getChargedItem(ItemStack itemStack) {
		return Baubles.chargedNanoBelt;
	}

	@Override
	public Item getEmptyItem(ItemStack itemStack) {
		return Baubles.unChargedNanoBelt;
	}

	@Override
	public double getMaxCharge(ItemStack itemStack) {
		return this.MAX_ENERGY_NANO;
	}

	@Override
	public int getTier(ItemStack itemStack) {
		return 3;
	}

	@Override
	public double getTransferLimit(ItemStack itemStack) {
		return 512;
	}

	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.BELT;
	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		if(ElectricItem.manager.canUse(itemstack, 10)){
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 100, 0));
			ElectricItem.manager.discharge(itemstack, 10, 3, false, false, false);
		}
	}

	@Override
	public void onEquipped(ItemStack itemstack, EntityLivingBase player) {}

	@Override
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {}

	@Override
	public boolean canEquip(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}

	@Override
	public boolean canUnequip(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs tab, List itemList){
		ItemStack itemstack = new ItemStack(this, 1);
		ElectricItem.manager.charge(itemstack, Integer.MAX_VALUE, Integer.MAX_VALUE, true, false);
		itemList.add(itemstack);
		itemList.add(new ItemStack(this, 1, getMaxDamage()));
	}
}
