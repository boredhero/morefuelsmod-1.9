package com.bored.morefuelsmod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class Fuels implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel){
		//Examples:
				//if(fuel.getItem() == Items.diamond) {
				//	return 5000;
				//}
				//if(fuel.getItem() == Item.getItemFromBlock(Blocks.deadbush)){
				//	return 50;
				//}
				//Note on timings, 20 = about 1 second in ticks.
				if(fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150330_I)){
					return 100;
				}
				if(fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150434_aF)){
					return 300;
				}
				//Sponges. Wet sponge burns too, need to figure out how to disable that.
				//if(fuel.getItem() == Item.getItemFromBlock(Blocks.sponge)){
				//}
				//Removed until further notice. Will be re added but must be enabled by config flag.
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150321_G)){
					return 150;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150442_at)){
					return 50;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150349_c)){
					return 50;
				}
				//Fix for tall grass and all other doubly tall plants
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150398_cm)){
					return 100;
				}
				//Flowers start here
				//This code SHOULD cover all flowers.
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150328_O)){
					return 100;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150327_N)){
					return 100;
				}
				//Flowers end here
				if (fuel.func_77973_b() == Items.field_151160_bD){
					return 200;
				}
				if (fuel.func_77973_b() == Items.field_151104_aV){
					return 500;
				}
				if (fuel.func_77973_b() == Items.field_151159_an){
					return 200;
				}
				if (fuel.func_77973_b() == Items.field_151155_ap){
					return 400;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150468_ap)){
					return 400;
				}
				//Rails start here
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150448_aq)) {
					return 400;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150408_cc)){
					return 400;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150319_E)){
					return 400;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150318_D)){
					return 400;
				}
				//Pistons start here
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150331_J)){
					return 400;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150320_F)){
					return 400;
				}
				//Pistons end here
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150395_bd)){
					return 200;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150392_bi)){
					return 200;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150479_bC)){
					return 50;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150407_cf)){
					return 400;
				}
				//Wool and Carpet handled here
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150404_cg)){
					return 250;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150325_L)){
					return 500;
				}
				//Arrows handled here
				if (fuel.func_77973_b() == Items.field_151032_g){
					return 50;
				}
				if (fuel.func_77973_b() == Items.field_151008_G){
					return 50;
				}
				if (fuel.func_77973_b() == Items.field_151015_O){
					return 70;
				}
				//Seeds handled here, all 60 tick burn times
				if (fuel.func_77973_b() == Items.field_151014_N){
					return 60;
				}
				if (fuel.func_77973_b() == Items.field_151081_bc){
					return 60;
				}
				if (fuel.func_77973_b() == Items.field_151080_bb){
					return 60;
				}
				//Torches handled here all 130 tick burn times
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150478_aa)){
					return 130;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150429_aA)){
					return 130;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150437_az)){
					//just in case someone gets one of these in their inventory..
					return 130;
				}
				//Doors! All 600 ticks!
				if (fuel.func_77973_b() == Items.field_179570_aq){
					return 600;
				}
				if (fuel.func_77973_b() == Items.field_179572_au){
					return 600;
				}
				if (fuel.func_77973_b() == Items.field_179568_as){
					//you little birch!
					return 600;
				}
				if (fuel.func_77973_b() == Items.field_179571_av){
					return 600;
				}
				if (fuel.func_77973_b() == Items.field_179567_at){
					return 600;
				}
				if (fuel.func_77973_b() == Items.field_179569_ar){
					return 600;
				}
				//Buttons
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150471_bO)){
					return 50;
				}
				if (fuel.func_77973_b() == Items.field_151054_z){
					return 80;
				}
				if (fuel.func_77973_b() == Items.field_151124_az){
					return 700;
				}
				if (fuel.func_77973_b() == Items.field_151120_aE){
					return 70;
				}
				if (fuel.func_77973_b() == Items.field_151121_aF){
					return 100;
				}
				//Books, all burn times 300 ticks.
				if (fuel.func_77973_b() == Items.field_151122_aG) {
					return 300;
				}
				if (fuel.func_77973_b() == Items.field_151099_bA){
					//unwritten writable book
					return 300;
				}
				if (fuel.func_77973_b() == Items.field_151164_bB){
					//already written writable book
					return 300;
				}
				//Enchanted books. Commented because illogical. May be re implemented with config default false later.
				//if (fuel.getItem() == Items.enchanted_book){
				//	return 300;
				//}
				if (fuel.func_77973_b() == Items.field_151108_aI){
					return 1000;
				}
				//Maps, all 200 ticks
				if (fuel.func_77973_b() == Items.field_151148_bJ){
					return 200;
				}
				if (fuel.func_77973_b() == Items.field_151098_aY){
					return 200;
				}
				//Fishing Rods and Carrot on a Stick, both 500 ticks
				if (fuel.func_77973_b() == Items.field_151112_aM){
					return 500;
				}
				if (fuel.func_77973_b() == Items.field_151146_bM){
					return 500;
				}
				//This handles ferns, also redundant for some items like dead bush
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150329_H)){
					return 50;
				}
				//Mushroom time! Don't get high off the fumes from burning them...
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150338_P)){
					//This covers the brown mushroom inventory item
					return 50;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150337_Q)){
					//This covers the red mushroom inventory item
					return 50;
				}
				//EXPERIMENTAL SHROOM COMPATIBILITY
				//Never actually bothered to get these items in inventory to test
				//Therefore I have no idea if this is just eating up space or if it works.
				//But someone might need it...so I'll be nice and accommodate them.
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150420_aW)){
					//This covers the giant brown mushroom BLOCK in giant mushrooms
					return 500;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150419_aX)){
					//This covers the giant red mushroom BLOCK in giant mushrooms
					return 500;
				}
				//Armor stands
				if (fuel.func_77973_b() == Items.field_179565_cj){
					return 700;
				}
				//Easter egg. Commented for now....because its pretty darn illogical tbh.
				//if (fuel.getItem() == Items.saddle){
				//	return 1000000;
				//}
				//Now for some weird misc. things
				if (fuel.func_77973_b() == Items.field_151059_bz){
					return 350;
				}
				if (fuel.func_77973_b() == Items.field_151154_bQ){
					return 350;
				}
				if (fuel.func_77973_b() == Items.field_151152_bP){
					return 500;
				}
				if (fuel.func_77973_b() == Items.field_151016_H){
					return 250;
				}
				//Attempt to implement spawn eggs as being burnable...idk why.
				if (fuel.func_77973_b() == Items.field_151063_bx){
					return 1000; //After all..they are valuable.
				}
				//Stupid stuff made burn-able just so we can get rid of it.
				if (fuel.func_77973_b() == Items.field_151170_bI){
					return 100;
				}
				if (fuel.func_77973_b() == Items.field_151078_bh){
					return 100;
				}
				if (fuel.func_77973_b() == Items.field_151070_bp){
					return 100;
				}
				if (fuel.func_77973_b() == Items.field_151071_bq){
					return 200;
				}
				if (fuel.func_77973_b() == Items.field_179556_br){
					return 200;
				}
				//Lets make all leather burnable...it makes some sense.
				//All leather items ticks are calculated by multiplying the base tick.
				//Working on being able to burn damaged leather.
				if (fuel.func_77973_b() == Items.field_151116_aA){
					return 250;
				}
				if (fuel.func_77973_b() == Items.field_151021_T){
					return 1000;
				}
				if (fuel.func_77973_b() == Items.field_151027_R){
					return 2000;
				}
				if (fuel.func_77973_b() == Items.field_151024_Q){
					return 1250;
				}
				if (fuel.func_77973_b() == Items.field_151026_S){
					return 1750;
				}
				return 0;
	}
}
