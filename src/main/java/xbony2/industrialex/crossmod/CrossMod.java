package xbony2.industrialex.crossmod;

import xbony2.industrialex.common.IEConfig;
import xbony2.industrialex.crossmod.bauble.Baubles;
import xbony2.industrialex.crossmod.floatingrails.FRail;
import xbony2.industrialex.crossmod.natura.Natura;
import xbony2.industrialex.crossmod.thermalexpansion.ThermalExpansion4;
import xbony2.industrialex.crossmod.thermalfoundation.ThermalFoundation;
import cpw.mods.fml.common.Loader;

public class CrossMod {

	private static boolean baubles;
	private static boolean natura;
	private static boolean frails;
	private static boolean te;
	private static boolean tf;
	
	public static boolean getBaubles(){
		return baubles;
	}
	
	public static boolean getNatura(){
		return natura;
	}
	
	public static boolean getFloatingRails(){
		return frails;
	}
	
	public static boolean getThermalExpansion(){
		return te;
	}
	
	public static boolean getThermalFoundation(){
		return tf;
	}
	
	public static void preinit(){
		baubles = Loader.isModLoaded("Baubles") && IEConfig.baublesCrossmod;
		natura = Loader.isModLoaded("Natura") && IEConfig.naturaCrossmod;
		frails = Loader.isModLoaded("floatingrails") && IEConfig.frailsCrossmod;
		te = Loader.isModLoaded("ThermalExpansion") && IEConfig.teCrossmod;
		tf = Loader.isModLoaded("ThermalFoundation") && IEConfig.tfCrossmod;
	}
	
	public static void init(){
		if(baubles) Baubles.init();
		if(natura) Natura.init();
		if(frails) FRail.init();
		if(te) ThermalExpansion4.init();
		if(tf) ThermalFoundation.init();
	}
	
	public static void postInit(){
		//stub
	}
}
