package com.fallenlondon.hannah;

import com.fallenlondon.hannah.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FallenLondon implements ModInitializer {
	public static final String MOD_ID = "fallen-london";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}