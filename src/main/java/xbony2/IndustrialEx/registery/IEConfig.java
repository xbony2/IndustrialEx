package xbony2.IndustrialEx.registery;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class IEConfig {

	public static boolean baublesCrossmod;
	public static boolean naturaCrossmod;
	public static boolean frailsCrossmod;
	
	public static void init(File file){
		Configuration config = new Configuration(file);
		
		config.load();
		{
			baublesCrossmod = config.getBoolean("Baubles Crossmod", "Crossmod", true, "Enables/disables integration for the Baubles mod by Azanor");
		}
		config.save();
	}
}
