package com.bored.morefuelsmod;

import com.bored.morefuelsmod.block.ModBlocks;
import com.bored.morefuelsmod.item.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	public static void init(){
		
		//Mod Blocks and Items Recipes
		
		//Pellet Fuel to Pellet Block
		GameRegistry.addRecipe(new ItemStack(ModBlocks.pelletBlock),"###","###","###",'#',ModItems.pelletsFuel);
		//Pellet Block to Pellet Fuel
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 9),"###","###","###",'#',ModBlocks.pelletBlock);
		//Concentrated Pellet Fuel to Concentrated Pellet Block
		GameRegistry.addRecipe(new ItemStack(ModBlocks.concentratedPelletBlock),"###","###","###",'#',ModItems.concentratedPelletsFuel);
		//Concentrated Pellet Block to Concentrated Pellet Fuel
		GameRegistry.addRecipe(new ItemStack(ModItems.concentratedPelletsFuel, 9),"###","###","###",'#',ModBlocks.concentratedPelletBlock);
		//Coal and Bitumen to Bituminous Coal
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bituminousCoal),new Object[]{Items.coal,ModItems.bitumen});
		//Gunpowder, Coal Dust, and Slime Ball to Can of Slimoline
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.canSlimoline),new Object[]{Items.gunpowder,ModItems.dustCoal,Items.slime_ball});
		
		//Mod Fuels to Fuel Pellets Recipes
		
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.getItemFromBlock(Blocks.deadbush));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 3),"###","###","###",'#',Item.getItemFromBlock(Blocks.cactus));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.getItemFromBlock(Blocks.web));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.lever));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.grass));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.getItemFromBlock(Blocks.double_plant));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.red_flower));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.yellow_flower));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 9),"###","###","###",'#',Items.item_frame);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 15),"###","###","###",'#',Items.bed);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 10),"###","###","###",'#',Items.painting);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 7),"###","###","###",'#',Items.sign);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 3),"###","###","###",'#',Item.getItemFromBlock(Blocks.ladder));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.rail));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.activator_rail));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.detector_rail));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.golden_rail));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 10),"###","###","###",'#',Item.getItemFromBlock(Blocks.piston));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 9),"###","###","###",'#',Item.getItemFromBlock(Blocks.sticky_piston));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.vine));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.waterlily));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.getItemFromBlock(Blocks.tripwire_hook));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 9),"###","###","###",'#',Item.getItemFromBlock(Blocks.hay_block));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.getItemFromBlock(Blocks.carpet));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.getItemFromBlock(Blocks.wool));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.arrow);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.feather);
		//GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.wheat);
		//Supposed to handle wheat, but this causes an override of 9 wheat = 1 hay block. Just gunna leave hay blocks in
		//And comment this for now. Might work out a solution later, might not. 
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.wheat_seeds);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.melon_seeds);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.pumpkin_seeds);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.torch));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.redstone_torch));
		//GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.unlit_redstone_torch));
		//Causes a crash because of unknown reasons
		//Do not uncomment
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 6),"###","###","###",'#',Items.oak_door);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 6),"###","###","###",'#',Items.acacia_door);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 6),"###","###","###",'#',Items.birch_door);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 6),"###","###","###",'#',Items.dark_oak_door);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 6),"###","###","###",'#',Items.jungle_door);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 6),"###","###","###",'#',Items.spruce_door);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 3),"###","###","###",'#',Item.getItemFromBlock(Blocks.wooden_button));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 3),"###","###","###",'#',Items.bowl);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 15),"###","###","###",'#',Items.boat);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 3),"###","###","###",'#',Items.reeds);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 3),"###","###","###",'#',Items.paper);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 10),"###","###","###",'#',Items.book);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 11),"###","###","###",'#',Items.writable_book);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 11),"###","###","###",'#',Items.written_book);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 4),"###","###","###",'#',Items.chest_minecart);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 25),"###","###","###",'#',Items.map);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 25),"###","###","###",'#',Items.filled_map);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 3),"###","###","###",'#',Items.fishing_rod);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 3),"###","###","###",'#',Items.carrot_on_a_stick);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.getItemFromBlock(Blocks.tallgrass));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.brown_mushroom));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Item.getItemFromBlock(Blocks.red_mushroom));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.getItemFromBlock(Blocks.brown_mushroom_block));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Item.getItemFromBlock(Blocks.red_mushroom_block));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 6),"###","###","###",'#',Items.armor_stand);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 15),"###","###","###",'#',Items.fire_charge);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 32),"###","###","###",'#',Items.firework_charge);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 51),"###","###","###",'#',Items.fireworks);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 16),"###","###","###",'#',Items.gunpowder);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 12),"###","###","###",'#',Items.blaze_powder);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 20),"###","###","###",'#',Items.magma_cream);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 20),"###","###","###",'#',Items.ghast_tear);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 50),"###","###","###",'#',Items.spawn_egg);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.poisonous_potato);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.rotten_flesh);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.spider_eye);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Items.fermented_spider_eye);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 2),"###","###","###",'#',Items.rabbit_foot);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel),"###","###","###",'#',Items.leather);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 4),"###","###","###",'#',Items.leather_boots);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 8),"###","###","###",'#',Items.leather_chestplate);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 5),"###","###","###",'#',Items.leather_helmet);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 7),"###","###","###",'#',Items.leather_leggings);
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 81),"###","###","###",'#',Item.getItemFromBlock(Blocks.tnt));
		GameRegistry.addRecipe(new ItemStack(ModItems.pelletsFuel, 82),"###","###","###",'#',Items.tnt_minecart);
	}
}

