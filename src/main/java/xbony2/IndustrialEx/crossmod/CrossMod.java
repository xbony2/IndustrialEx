package xbony2.IndustrialEx.crossmod;

import xbony2.IndustrialEx.crossmod.bauble.Baubles;
import xbony2.IndustrialEx.crossmod.frail.FRail;
import xbony2.IndustrialEx.crossmod.natura.Natura;
import cpw.mods.fml.common.Loader;

public class CrossMod {

	public static boolean baubles = false;
	public static boolean natura = false;
	public static boolean frails = false;
	
	public static void preinit(){
		if(Loader.isModLoaded("Baubles")) baubles = true;
		if(Loader.isModLoaded("Natura")) natura = true;
		if(Loader.isModLoaded("floatingrails")) frails = true;
		
	}
	
	public static void init(){
		if(baubles) Baubles.init();
		if(natura) Natura.init();
		if(frails) FRail.init();
	}
	
	public static void postInit(){
		if(natura) Natura.postInit();
	}
}
