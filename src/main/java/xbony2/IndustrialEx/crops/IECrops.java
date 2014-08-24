package xbony2.IndustrialEx.crops;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary.Type;
import ic2.api.crops.BaseSeed;
import ic2.api.crops.CropCard;
import ic2.api.crops.Crops;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ic2.api.crops.BaseSeed;
import ic2.api.crops.CropCard;
import ic2.api.crops.Crops;
import ic2.core.IC2;
import ic2.core.Ic2Items;
import ic2.core.init.Localization;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;

public class IECrops extends Crops{
	
    private final Map<BiomeGenBase, Integer> humidityBiomeBonus = new HashMap();
    private final Map<BiomeGenBase, Integer> nutrientBiomeBonus = new HashMap();
    private final Map<Type, Integer> humidityBiomeBonus2 = new HashMap();
    private final Map<Type, Integer> nutrientBiomeBonus2 = new HashMap();
    private final Map<ItemStack, BaseSeed> baseSeeds = new HashMap();
    private final CropCard[] crops = new CropCard[256];
    public static CropCard hongoMarron = new RedMushroom();
    public static CropCard hongoRojo = new BrownMushroom();

    public static void init(){
        Crops.instance = new IECrops();
        registerCrops();
        registerBaseSeeds();
    }

    public static void registerCrops(){
    	Crops.instance.registerCrop(hongoMarron, 100);
    	Crops.instance.registerCrop(hongoRojo, 99);
    }

    public static void registerBaseSeeds(){
        Crops.instance.registerBaseSeed(new ItemStack(Blocks.red_mushroom, 1, 32767), hongoMarron.getId(), 1, 1, 1, 1);
        Crops.instance.registerBaseSeed(new ItemStack(Blocks.brown_mushroom, 1, 32767), hongoRojo.getId(), 1, 1, 1, 1);

    }

    @Override
    public int getHumidityBiomeBonus(BiomeGenBase biome){
        return this.humidityBiomeBonus.containsKey(biome) ? ((Integer)this.humidityBiomeBonus.get(biome)).intValue() : 0;
    }

    @Override
    public int getNutrientBiomeBonus(BiomeGenBase biome){
        return this.nutrientBiomeBonus.containsKey(biome) ? ((Integer)this.nutrientBiomeBonus.get(biome)).intValue() : 0;
    }

    @Override
    public CropCard[] getCropList(){
        return this.crops;
    }

    @Override
    public short registerCrop(CropCard crop){
        for (short x = 0; x < this.crops.length; ++x){
            if (this.crops[x] == null){
                this.registerCrop(crop, x);
                return x;
            }
        }
        return (short) - 1;
    }

    @Override
    public boolean registerCrop(CropCard crop, int i){
        if (i >= 0 && i < this.crops.length){
            if (this.crops[i] == null){
                this.crops[i] = crop;
                Localization.addLocalization("ic2.cropSeed" + i, crop.name() + " Seeds");
                return true;
            }else{
                FMLLog.info("[IndustrialEx][ERROR] Cannot add crop:" + crop.name() + " on ID #" + i + ", slot already occupied by crop:" + this.crops[i].name());
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public boolean registerBaseSeed(ItemStack stack, int id, int size, int growth, int gain, int resistance){
        Iterator i$ = this.baseSeeds.keySet().iterator();
        ItemStack key;

        do{
            if (!i$.hasNext()){
                this.baseSeeds.put(stack, new BaseSeed(id, size, growth, gain, resistance, stack.stackSize));
                return true;
            }

            key = (ItemStack)i$.next();
        }
        while (key != stack || key.getItemDamage() != stack.getItemDamage());

        return false;
    }

    @Override
    public BaseSeed getBaseSeed(ItemStack stack){
        if (stack == null){
            return null;
        }else{
            Iterator i$ = this.baseSeeds.entrySet().iterator();
            ItemStack key;

            do{
                do{
                    if (!i$.hasNext()){
                        return null;
                    }

                    Entry entry = (Entry)i$.next();
                    key = (ItemStack)entry.getKey();
                }while (key != stack);
            }while (key.getItemDamage() != 32767 && key.getItemDamage() != stack.getItemDamage());

            return (BaseSeed)this.baseSeeds.get(key);
        }
    }

    @SideOnly(Side.CLIENT)
    public void startSpriteRegistration(IIconRegister iconRegister){
        CropCard[] arr$ = this.crops;
        int len$ = arr$.length;

        for (int i$ = 0; i$ < len$; ++i$){
            CropCard cropCard = arr$[i$];

            if (cropCard != null){
                cropCard.registerSprites(iconRegister);
            }
        }
    }

    @Override
    public int getIdFor(CropCard crop){
        for (int i = 0; i < this.crops.length; ++i){
            if (this.crops[i] == crop){
                return i;
            }
        }

        return -1;
    }

	@Override
	public void addBiomeBonus(Type type, int humidityBonus, int nutrientsBonus) {
		this.humidityBiomeBonus2.put(type.SWAMP, Integer.valueOf(humidityBonus));
        this.nutrientBiomeBonus2.put(type.SPOOKY, Integer.valueOf(nutrientsBonus));
	}

	@Override
	public void addBiomeBonus(BiomeGenBase biome, int humidityBonus, int nutrientsBonus){
		this.humidityBiomeBonus.put(biome, Integer.valueOf(humidityBonus));
        this.nutrientBiomeBonus.put(biome, Integer.valueOf(nutrientsBonus));
	}

	

	
}
