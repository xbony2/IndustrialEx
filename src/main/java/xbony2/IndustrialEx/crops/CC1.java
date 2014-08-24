package xbony2.IndustrialEx.crops;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import ic2.api.crops.CropCard;
import ic2.api.crops.Crops;
import ic2.api.crops.ICropTile;

public class CC1 extends CropCard{

	private String name = "";
	private String dis = "xbony2";
	private String[] attitudes = null;
	private int tier = 0;
	private int maxSize = 0;
	private int harvestSize = 0;
	private int afterHarvestSize = 0;
	private int[] stats = new int[5];
	private ItemStack drop = null;
	private ItemStack seed = null;
	
	public static ArrayList<CC1> cropList = new ArrayList();
	
	public CC1(int ID, String nameo, String disc, ItemStack dropo, ItemStack seedo, 
			int teiro, int maxSizeo, int afterHarvestSizeo, int sizeo, int statChemical, 
			int statFood, int statDef, int statColor, int statWeed, String[] att){
		name = nameo;
		if(disc != null && !disc.equals("")) disc = dis;
		dropo = drop;
		seedo = seed;
		teiro = tier;
		maxSizeo = maxSize;
		afterHarvestSizeo = afterHarvestSize;
		sizeo = maxSize;
		stats[0] = statChemical;
	    stats[1] = statFood;
	    stats[2] = statDef;
	    stats[3] = statColor;
	    stats[4] = statWeed;
	    att = attitudes;
	    if(seedo != null) Crops.instance.registerBaseSeed(seedo, ID, 1, 1, 1, 1);
	}
	
	@Override
	public String name(){
		return name;
	}

	@Override
	public int tier(){
		return tier;
	}

	@Override
	public int stat(int n){
		if ((n < 0) || (n >= this.stats.length)) return 0;
	    return this.stats[n];
	}

	@Override
	public String[] attributes(){
		return attitudes;
	}

	@Override
	public int maxSize(){
		return maxSize;
	}

	@Override
	public boolean canGrow(ICropTile crop){
		return crop.getSize() < maxSize();
	}

	@Override
	public boolean canBeHarvested(ICropTile crop) {
		return crop.getSize() >= this.harvestSize;
	}

	@Override
	public ItemStack getGain(ICropTile crop) {
		return drop;
	}

	public boolean rightclick(ICropTile crop, EntityPlayer player){
	    if (!canBeHarvested(crop)) return false;
	    return crop.harvest(player == null ? false : player instanceof EntityPlayerMP);
	  }
}
