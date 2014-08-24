package xbony2.IndustrialEx.crossmod;

import xbony2.IndustrialEx.crossmod.bauble.Baubles;
import xbony2.IndustrialEx.crossmod.natura.Natura;
import cpw.mods.fml.common.Loader;

public class CrossMod {

	public static boolean baubles;
	public static boolean natura;
	
	public static void preinit(){
		if(Loader.isModLoaded("Baubles")){
			baubles = true;
		}else{
			baubles = false;
		}
		if(Loader.isModLoaded("Natura")){
			baubles = true;
		}else{
			baubles = false;
		}
	}
	
	public static void init(){
		if(baubles){
			Baubles.init();
		}
		if(natura){
			Natura.init();
		}
	}
	
	public static void postInit(){
		
	}
}
