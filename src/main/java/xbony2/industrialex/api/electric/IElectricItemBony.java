package xbony2.industrialex.api.electric;

import ic2.api.item.IElectricItem;

/**
 * Like IC2's IElectricItem, but different.
 * 
 * @author xbony2
 */
public interface IElectricItemBony extends IElectricItem {
	public static final int MAX_ENERGY_NANO = 1000000; //One million EU
	public static final int MAX_ENERGY_QUANTUM = 10000000; //Ten million EU
	public static final int MAX_ENERGY_REBATTERY = 10000; //Ten thousand EU
	public static final int MAX_ENERGY_E_CRYSTAL = 1000000; //One million EU
	public static final int MAX_ENERGY_LAPOTRON_CRYSTAL = 10000000; //Ten million EU
}
