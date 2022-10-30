package net.gruffelwop.gea;

import net.fabricmc.api.ModInitializer;
import net.gruffelwop.gea.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class geaMod implements ModInitializer {

	public static final String MOD_ID = "gea";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
