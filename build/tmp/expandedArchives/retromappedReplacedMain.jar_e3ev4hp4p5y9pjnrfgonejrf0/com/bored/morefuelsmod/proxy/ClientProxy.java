package com.bored.morefuelsmod.proxy;

import com.bored.morefuelsmod.Main;

import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new net.minecraft.client.resources.model.ModelResourceLocation(Main.modid + ":" + id, "inventory"));
	}
}
