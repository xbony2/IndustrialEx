package xbony2.IndustrialEx.registery;

import java.io.File;

import cpw.mods.fml.common.FMLLog;
import net.minecraftforge.common.config.Configuration;

public class IEConfig {

	public static boolean baublesCrossmod;
	public static boolean naturaCrossmod;
	public static boolean frailsCrossmod;
	public static boolean teCrossmod;
	public static boolean tfCrossmod;
	public static boolean ferrousDusts;
	public static boolean shinyDusts;
	public static boolean manaDusts;
	
	public static void init(File file){
		Configuration config = new Configuration(file);
		
		config.load();
		{
			baublesCrossmod = config.getBoolean("Baubles Crossmod", "Crossmod", true, "Enables/disables integration for the Baubles mod by Azanor");
			naturaCrossmod = config.getBoolean("Natura Crossmod", "Crossmod", true, "Enables/disables integration for the Natura mod by mDiyo/Prog");
			frailsCrossmod = config.getBoolean("Floating Rails Crossmod", "Crossmod", true, "Enables/disables integration for the Floating Rails mod by Ewy");
			teCrossmod = config.getBoolean("Thermal Expansion Crossmod", "Crossmod", true, "Enables/disables integration for Thermal Expansion by KingLemming and co");
			tfCrossmod = config.getBoolean("Thermal Foundation Crossmod", "Crossmod", true, "Enables/disables integration for Thermal Foundation by KingLemming and co");
			
			{
				ferrousDusts = config.getBoolean("[TF]Ferrous IC2 Dusts", "Crossmod", true, "Enables/disables allowance of ferrous ore being used in macerators/thermal centifudge/ore washing plant");
				shinyDusts = config.getBoolean("[TF]Shiny IC2 Dusts", "Crossmod", true, "Enables/disables allowance of shiny ore being used in macerators/thermal centifudge/ore washing plant");
				manaDusts = config.getBoolean("[TF]Infused Mana IC2 Dusts", "Crossmod", true, "Enables/disables allowance of infused mana ore being used in macerators/thermal centifudge/ore washing plant");
			}
			
			boolean doesHephHaveBadBreath = config.getBoolean("Does Heph have bad breath", "General", true, "Turns on and off Heph's bad breath.");
			if(!doesHephHaveBadBreath){ 
				FMLLog.info("[IndustrialEx] Hah! Nice try! (Sorry heph! :P)"); 
				doesHephHaveBadBreath = true;
			}
		}
		config.save();
	}
}
