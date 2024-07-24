package dev.dumplings.tutorialmod;

import dev.dumplings.tutorialmod.block.ModBlocks;
import dev.dumplings.tutorialmod.item.ModItems;
import dev.dumplings.tutorialmod.item.ModItemsGroups;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
    public static final String MOD_ID = "tutorial-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
//        LOGGER.info("Hello Fabric world!");
        ModItemsGroups.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlock();
    }
}