package net.mende1.howtofabric;

import net.fabricmc.api.ModInitializer;
import net.mende1.howtofabric.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HowToFabric implements ModInitializer {
	public static final String MOD_ID = "howtofabric";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
