package xbony2.IndustrialEx.registery;

import cpw.mods.fml.common.registry.GameRegistry;
import xbony2.IndustrialEx.items.DarkSteelKinRotor;
import xbony2.IndustrialEx.items.IEItem;
import net.minecraft.item.Item;

public class RegItems {

	public static Item darkSteelIngot;
	public static Item darkSteelNugget;
	public static Item steelNugget;
	public static Item darkSteelItemCasing;
	public static Item darkSteelPlate;
	public static Item darkSteelDensePlate;
	public static Item darkSteelRotorBlade;
	//public static Item darkSteelKinRotor;
	public static Item darkSteelShaft;
	public static Item darkMixedMetalIngot;
	public static Item greenDye;
	public static Item nytGem;
	public static Item nytNugget;
	public static Item nytItemCasing;
	public static Item nytPlate;
	public static Item nytDensePlate;
	public static Item viceGem;
	public static Item viceNugget;
	public static Item viceItemCasing;
	public static Item vicePlate;
	public static Item viceDensePlate;
	public static Item infusedGoldIngot;
	public static Item infusedGoldNugget;
	public static Item infusedGoldItemCasing;
	public static Item infusedGoldPlate;
	public static Item infusedGoldDensePlate;
	
	/**
	 * Registers all of the items.
	 * 
	 * @author xbony2
	 */
	public static void registerItems(){
		darkSteelIngot = new IEItem("darkSteelIngot");
		darkSteelNugget = new IEItem("darkSteelNugget");
		steelNugget = new IEItem("steelNugget");
		darkSteelItemCasing = new IEItem("darkSteelItemCasing");
		darkSteelPlate = new IEItem("darkSteelPlate");
		darkSteelDensePlate = new IEItem("darkSteelDensePlate");
		darkSteelRotorBlade = new IEItem("darkSteelRotorBlade");
		//darkSteelKinRotor = new DarkSteelKinRotor();
		darkSteelShaft = new IEItem("darkSteelShaft");
		darkMixedMetalIngot = new IEItem("darkMixedMetalIngot");
		greenDye = new IEItem("dyeGreen");
		nytGem = new IEItem("gemNyt");
		nytNugget = new IEItem("nuggetNyt");
		nytItemCasing = new IEItem("itemCasingNyt");
		nytPlate = new IEItem("plateNyt");
		nytDensePlate = new IEItem("densePlateNyt");
		viceGem = new IEItem("gemVice");
		viceNugget = new IEItem("nuggetVice");
		viceItemCasing = new IEItem("itemCasingVice");
		vicePlate = new IEItem("plateVice");
		viceDensePlate = new IEItem("densePlateVice");
		infusedGoldIngot = new IEItem("ingotInfusedGold");
		infusedGoldNugget = new IEItem("nuggetInfusedGold");
		infusedGoldItemCasing = new IEItem("itemCasingInfusedGold");
		infusedGoldPlate = new IEItem("plateInfusedGold");
		infusedGoldDensePlate = new IEItem("densePlateInfusedGold");
		
		GameRegistry.registerItem(darkSteelIngot, "darkSteelIngot");
		GameRegistry.registerItem(darkSteelNugget, "darkSteelNugget");
		GameRegistry.registerItem(steelNugget, "steelNugget");
		GameRegistry.registerItem(darkSteelItemCasing, "darkSteelItemCasing");
		GameRegistry.registerItem(darkSteelPlate, "darkSteelPlate");
		GameRegistry.registerItem(darkSteelDensePlate, "darkSteelDensePlate");
		GameRegistry.registerItem(darkSteelRotorBlade, "darkSteelRotorBlade");
		//GameRegistry.registerItem(darkSteelKinRotor, "darkSteelKinRotor");
		GameRegistry.registerItem(darkSteelShaft, "darkSteelShaft");
		GameRegistry.registerItem(darkMixedMetalIngot, "darkMixedMetalIngot");
		GameRegistry.registerItem(greenDye, "dyeGreen");
		GameRegistry.registerItem(nytGem, "gemNyt");
		GameRegistry.registerItem(viceGem, "gemVice");
		GameRegistry.registerItem(infusedGoldIngot, "ingotInfusedGold");
	}
}
