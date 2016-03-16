package com.bored.morefuelsmod;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.config.Configuration;


@Mod(modid = Main.MODID, version = Main.VERSION, name=Main.MODNAME)
public class Main {

	public static final String MODID = "morefuels";
	public static final String VERSION = "1.2.0";
	public static final String MODNAME = "More Fuels Mod";
	
	@Instance(value = Main.MODID)
    public static Main instance;
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event){
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		boolean enableRFtLrecipe = config.get(Configuration.CATEGORY_GENERAL, "enableRFtLrecipe", true).getBoolean(true);
		if(enableRFtLrecipe)
			GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(Items.leather), 0.3F);
		config.save();
		//I feel like I need an "else if" statement here telling it to not add the recipe if it doesnt return true.
		//Also, how to I get the actual config file to appear......like do I make it or is it generated and if so how
		}

	
	@EventHandler
	public void init(FMLInitializationEvent event){
		GameRegistry.registerFuelHandler(new Fuels());
		}
}