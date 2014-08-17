package xbony2.IndustrialEx.crossmod;

import xbony2.IndustrialEx.crossmod.bauble.Baubles;
import cpw.mods.fml.common.Loader;

public class CrossMod {

	public static boolean baubles;
	
	public static void preinit(){
		if(Loader.isModLoaded("Baubles")){
			baubles = true;
		}else{
			baubles = false;
		}
	}
	
	public static void init(){
		if(baubles){
			Baubles.init();
		}
	}
	
	public static void postInit(){
		
	}
}
