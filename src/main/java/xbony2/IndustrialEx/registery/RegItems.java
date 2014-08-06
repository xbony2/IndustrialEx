package xbony2.IndustrialEx.registery;

import cpw.mods.fml.common.registry.GameRegistry;
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
	public static Item darkSteelKinRotor;
	
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
		darkSteelKinRotor = new IEItem("darkSteelKinRotor");
		
		GameRegistry.registerItem(darkSteelIngot, "darkSteelIngot");
		GameRegistry.registerItem(darkSteelNugget, "darkSteelNugget");
		GameRegistry.registerItem(steelNugget, "steelNugget");
		GameRegistry.registerItem(darkSteelItemCasing, "darkSteelItemCasing");
		GameRegistry.registerItem(darkSteelPlate, "darkSteelPlate");
		GameRegistry.registerItem(darkSteelDensePlate, "darkSteelDensePlate");
		GameRegistry.registerItem(darkSteelRotorBlade, "darkSteelRotorBlade");
		GameRegistry.registerItem(darkSteelKinRotor, "darkSteelKinRotor");
	}
}
