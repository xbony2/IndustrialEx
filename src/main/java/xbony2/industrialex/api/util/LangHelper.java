package xbony2.industrialex.api.util;

import net.minecraft.util.StatCollector;

public class LangHelper {
	public static String translate(String key) {
		return StatCollector.translateToLocal(key);
	}
	
	public static String translate(String key, Object[] object) {
		return StatCollector.translateToLocalFormatted(key, object);
	}
}
