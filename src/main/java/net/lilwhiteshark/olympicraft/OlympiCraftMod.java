package net.lilwhiteshark.olympicraft;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OlympiCraftMod implements ModInitializer {
	public static final String MOD_ID = "olympicraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// Dionysus is best god
	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}
