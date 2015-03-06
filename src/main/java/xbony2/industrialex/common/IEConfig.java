package xbony2.industrialex.common;

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
	public static boolean generateNyt;
	public static boolean generateVice;
	public static boolean generateInfusedGold;
	public static boolean isHardcoreMaceratorOn;
	
	public static void init(File file){
		Configuration config = new Configuration(file);
		
		config.load();
		{
			generateNyt = config.getBoolean("Generates Nyt", "World", true, "Enables/disabled the generation of Nyt Ore in the Nether");
			generateVice = config.getBoolean("Generates Vice", "World", true, "Enables/disabled the generation of Vice Ore in the Nether");
			generateInfusedGold = config.getBoolean("Generates Infused Gold", "World", true, "Enables/disabled the generation of Infused Gold Ore in the Nether");
			
			isHardcoreMaceratorOn = config.getBoolean("Hardcorizes the macerator", "Hacks", false, "Makes the IC2 Macerator require diamonds to craft");
			
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
		}
		config.save();
	}
}
