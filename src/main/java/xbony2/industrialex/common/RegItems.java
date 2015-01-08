package xbony2.industrialex.common;

import cpw.mods.fml.common.registry.GameRegistry;
import xbony2.industrialex.items.*;
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
	public static Item nytCrushedOre;
	public static Item nytPurifiedCrushedOre;
	public static Item nytTinyPile;
	public static Item nytDust;
	public static Item viceCrushedOre;
	public static Item vicePurifiedCrushedOre;
	public static Item viceTinyPile;
	public static Item viceDust;
	public static Item infusedGoldCrushedOre;
	public static Item infusedGoldPurifiedCrushedOre;
	public static Item infusedGoldTinyPile;
	public static Item infusedGoldDust;
	public static Item weed;
	
	/**
	 * Registers all of the items.
	 * 
	 * @author xbony2
	 */
	public static void registerItems(){
		darkSteelIngot = new IEItem("ingotDarkSteel");
		darkSteelNugget = new IEItem("nuggetDarkSteel");
		steelNugget = new IEItem("nuggetSteel");
		darkSteelItemCasing = new IEItem("itemCasingDarkSteel");
		darkSteelPlate = new IEItem("plateDarkSteel");
		darkSteelDensePlate = new IEItem("plateDenseDarkSteel");
		darkSteelRotorBlade = new IEItem("rotorBladeDarkSteel");
		//darkSteelKinRotor = new DarkSteelKinRotor();
		darkSteelShaft = new IEItem("shaftDarkSteel");
		darkMixedMetalIngot = new IEItem("XBONY2_mixedMetalIngotDarkSteel");
		greenDye = new IEItem("dyeGreen");
		nytGem = new IEItem("gemNyt");
		nytNugget = new IEItem("nuggetNyt");
		nytItemCasing = new IEItem("itemCasingNyt");
		nytPlate = new IEItem("plateNyt");
		nytDensePlate = new IEItem("plateDenseNyt");
		viceGem = new IEItem("gemVice");
		viceNugget = new IEItem("nuggetVice");
		viceItemCasing = new IEItem("itemCasingVice");
		vicePlate = new IEItem("plateVice");
		viceDensePlate = new IEItem("plateDenseVice");
		infusedGoldIngot = new IEItem("ingotInfusedGold");
		infusedGoldNugget = new IEItem("nuggetInfusedGold");
		infusedGoldItemCasing = new IEItem("itemCasingInfusedGold");
		infusedGoldPlate = new IEItem("plateInfusedGold");
		infusedGoldDensePlate = new IEItem("plateDenseInfusedGold");
		nytCrushedOre = new IEItem("crushedNyt");
		nytPurifiedCrushedOre = new IEItem("crushedPurifiedNyt");
		nytTinyPile = new IEItem("dustTinyNyt");
		viceCrushedOre = new IEItem("crushedVice");
		vicePurifiedCrushedOre = new IEItem("crushedPurifiedVice");
		viceTinyPile = new IEItem("dustTinyVice");
		infusedGoldCrushedOre = new IEItem("crushedInfusedGold");
		infusedGoldPurifiedCrushedOre = new IEItem("crushedPurifiedInfusedGold");
		infusedGoldTinyPile = new IEItem("dustTinyInfusedGold");
		nytDust = new IEItem("dustNyt");
		viceDust = new IEItem("dustVice");
		infusedGoldDust = new IEItem("dustInfusedGold");
		weed = new IEItem("XBONY2_weed");
		
		//GameRegistry.registerItem(darkSteelKinRotor, "darkSteelKinRotor");
	}
}
