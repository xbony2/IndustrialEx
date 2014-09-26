package xbony2.IndustrialEx.registery;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class IEConfig {

	public static boolean baublesCrossmod;
	public static boolean naturaCrossmod;
	public static boolean frailsCrossmod;
	public static boolean teCrossmod;
	
	public static void init(File file){
		Configuration config = new Configuration(file);
		
		config.load();
		{
			baublesCrossmod = config.getBoolean("Baubles Crossmod", "Crossmod", true, "Enables/disables integration for the Baubles mod by Azanor");
			naturaCrossmod = config.getBoolean("Natura Crossmod", "Crossmod", true, "Enables/disables integration for the Natura mod by mDiyo/Prog");
			frailsCrossmod = config.getBoolean("Floating Rails Crossmod", "Crossmod", true, "Enables/disables integration for the Floating Rails mod by Ewy");
			teCrossmod = config.getBoolean("Thermal Expansion Crossmod", "Crossmod", true, "Enables/disables integration for Thermal Expansion by KingLemming and co");
		}
		config.save();
	}
}
