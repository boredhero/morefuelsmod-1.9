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
					return 200;
				}
				if(fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150434_aF)){
					return 300;
				}
				//Sponges. Wet sponge burns too, need to figure out how to disable that.
				//if(fuel.getItem() == Item.getItemFromBlock(Blocks.sponge)){
				//}
				//Removed until further notice. Will be re added but must be enabled by config flag.
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150321_G)){
					return 160;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150442_at)){
					return 120;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150349_c)){
					return 100;
				}
				//Fix for tall grass and all other doubly tall plants
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150398_cm)){
					return 200;
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
					return 900;
				}
				if (fuel.func_77973_b() == Items.field_151104_aV){
					return 1500;
				}
				if (fuel.func_77973_b() == Items.field_151159_an){
					return 1000;
				}
				if (fuel.func_77973_b() == Items.field_151155_ap){
				//Actual calculation here was 633.33~ but I rounded.
					return 640;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150468_ap)){
				//Actual calculation here was 233.33~ but I rounded.
					return 240;
				}
				//Rails start here
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150448_aq)) {
				//Actual calculation here was 13.75  but I rounded.
					return 20;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150408_cc)){
				//Actual calculation here was 73.33~ but I rounded.
					return 80;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150319_E)){
				//Actual calculation here was 23.33~ but I rounded.
					return 20;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150318_D)){
					return 40;
				}
				//Pistons start here
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150331_J)){
					return 1020;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150320_F)){
					return 1040;
				}
				//Pistons end here
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150395_bd)){
					return 100;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150392_bi)){
					return 100;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150479_bC)){
				//Actual calculation here was 210 but I rounded.
					return 220;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150407_cf)){
					return 900;
				}
				//Wool and Carpet handled here
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150404_cg)){
				//Actual calculation here was 133.33~ but I rounded.
					return 140;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150325_L)){
					return 200;
				}
				//Arrows handled here
				if (fuel.func_77973_b() == Items.field_151032_g){
				//Actual calculation here was 55 but I rounded
					return 60;
				}
				if (fuel.func_77973_b() == Items.field_151008_G){
					return 100;
				}
				if (fuel.func_77973_b() == Items.field_151015_O){
					return 100;
				}
				//Seeds handled here, all 60 tick burn times
				if (fuel.func_77973_b() == Items.field_151014_N){
					return 100;
				}
				if (fuel.func_77973_b() == Items.field_151081_bc){
					return 100;
				}
				if (fuel.func_77973_b() == Items.field_151080_bb){
					return 100;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150478_aa)){
				//Actual calculation here was 30 but I rounded.
					return 40;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150429_aA)){
					return 120;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150437_az)){
				//just in case someone gets one of these in their inventory..
					return 120;
				}
				//Doors! Try the back one ;)
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
					return 300;
				}
				if (fuel.func_77973_b() == Items.field_151054_z){
				//Actual calculation here was 225 but I rounded.
					return 240;
				}
				//Updated boat handler to 1.9 to include different woods.
				if (fuel.func_77973_b() == Items.field_151124_az){
					return 1500;
				}
				if (fuel.func_77973_b() == Items.field_185153_aK){
					return 1500;
				}
				if (fuel.func_77973_b() == Items.field_185151_aI){
					return 1500;
				}
				if (fuel.func_77973_b() == Items.field_185154_aL){
					return 1500;
				}
				if (fuel.func_77973_b() == Items.field_185152_aJ){
					return 1500;
				}
				if (fuel.func_77973_b() == Items.field_185150_aH){
					return 1500;
				}
				//End of new boat handling procedure
				if (fuel.func_77973_b() == Items.field_151120_aE){
					return 300;
				}
				if (fuel.func_77973_b() == Items.field_151121_aF){
					return 300;
				}
				//Books, all burn times 300 ticks.
				if (fuel.func_77973_b() == Items.field_151122_aG) {
					return 1000;
				}
				if (fuel.func_77973_b() == Items.field_151099_bA){
					//unwritten writable book
					return 1120;
				}
				if (fuel.func_77973_b() == Items.field_151164_bB){
					//already written writable book
					return 1120;
				}
				if (fuel.func_77973_b() == Items.field_151108_aI){
				//Vanilla chest only burns for 300 Ticks.
					return 400;
				}
				//Maps, all 200 ticks
				if (fuel.func_77973_b() == Items.field_151148_bJ){
					return 2500;
				}
				if (fuel.func_77973_b() == Items.field_151098_aY){
					return 2500;
				}
				//Fishing Rods and Carrot on a Stick.
				if (fuel.func_77973_b() == Items.field_151112_aM){
					return 320;
				}
				if (fuel.func_77973_b() == Items.field_151146_bM){
					return 340;
				}
				//This handles ferns, also redundant for some items like dead bush
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150329_H)){
					return 200;
				}
				//Mushroom time! Don't get high off the fumes from burning them...
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150338_P)){
					//This covers the brown mushroom inventory item
					return 100;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150337_Q)){
					//This covers the red mushroom inventory item
					return 100;
				}
				//EXPERIMENTAL SHROOM COMPATIBILITY
				//Never actually bothered to get these items in inventory to test
				//Therefore I have no idea if this is just eating up space or if it works.
				//But someone might need it...so I'll be nice and accommodate them.
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150420_aW)){
					//This covers the giant brown mushroom BLOCK in giant mushrooms
					return 200;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150419_aX)){
					//This covers the giant red mushroom BLOCK in giant mushrooms
					return 200;
				}
				//Armor stands
				if (fuel.func_77973_b() == Items.field_179565_cj){
					return 620;
				}
				//Easter egg. Commented for now....because its pretty darn illogical tbh.
				//if (fuel.getItem() == Items.saddle){
				//	return 1000000;
				//}
				//Now for some weird misc. things
				if (fuel.func_77973_b() == Items.field_151059_bz){
				//Actual calculation here was 1466.66~ but I rounded.
					return 1480;
				}
				if (fuel.func_77973_b() == Items.field_151154_bQ){
					return 3220;
				}
				if (fuel.func_77973_b() == Items.field_151152_bP){
					return 5120;
				}
				if (fuel.func_77973_b() == Items.field_151016_H){
					return 1600;
				}
				if (fuel.func_77973_b() == Items.field_151065_br){
					return 1200;
				}
				if (fuel.func_77973_b() == Items.field_151064_bs){
					return 2000;
				}
				if (fuel.func_77973_b() == Items.field_151073_bk){
					return 2000;
				}
				//Attempt to implement spawn eggs as being burnable...idk why.
				if (fuel.func_77973_b() == Items.field_151063_bx){
					return 5000;
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
					return 220;
				}
				if (fuel.func_77973_b() == Items.field_179556_br){
					return 200;
				}
				//Lets make all leather burnable...it makes some sense.
				//All leather items ticks are calculated by multiplying the base tick.
				//Working on being able to burn damaged leather.
				if (fuel.func_77973_b() == Items.field_151116_aA){
					return 100;
				}
				if (fuel.func_77973_b() == Items.field_151021_T){
					return 400;
				}
				if (fuel.func_77973_b() == Items.field_151027_R){
					return 800;
				}
				if (fuel.func_77973_b() == Items.field_151024_Q){
					return 500;
				}
				if (fuel.func_77973_b() == Items.field_151026_S){
					return 700;
				}
				//Adding 1.9 Stuff
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_185765_cR)){
					return 600;
				}
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_185766_cS)){
					return 600;
				}
				if (fuel.func_77973_b() == Items.field_185159_cQ){
					return 1820;
				}
				if (fuel.func_77973_b() == Items.field_185157_bK){
					return 2060;
				}
				//Adding TNT
				if (fuel.func_77973_b() == Item.func_150898_a(Blocks.field_150335_W)){
					return 8080;
				}
				//Adding Minecart with TNT
				if (fuel.func_77973_b() == Items.field_151142_bV){
					return 8180;
				}
				return 0;
	}
}
