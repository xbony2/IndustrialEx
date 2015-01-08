package xbony2.industrialex.crossmod;

import xbony2.industrialex.common.IEConfig;
import xbony2.industrialex.crossmod.bauble.Baubles;
import xbony2.industrialex.crossmod.frail.FRail;
import xbony2.industrialex.crossmod.natura.Natura;
import xbony2.industrialex.crossmod.te.ThermalExpansion4;
import xbony2.industrialex.crossmod.tf.ThermalFoundation;
import cpw.mods.fml.common.Loader;

public class CrossMod {

	public static boolean baubles;
	public static boolean natura;
	public static boolean frails;
	public static boolean te;
	public static boolean tf;
	
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
		if(natura) Natura.postInit();
	}
}
