package com.riftx666.createages;

import com.mojang.logging.LogUtils;
import com.riftx666.createages.registry.ModBlocks;
import com.riftx666.createages.registry.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.slf4j.Logger;

@Mod(CreateAges.MOD_ID)
public class CreateAges {
    public static final String MOD_ID = "createages";
    private static final Logger LOGGER = LogUtils.getLogger();

    // Конструктор класса, вызывается при загрузке мода
    public CreateAges(IEventBus modEventBus) {
        LOGGER.info("Create Ages mod is loading...");

        // Регистрация предметов и блоков
        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModBlocks.registerBlockItems();

        // Добавляем обработчик для креативных вкладок
        modEventBus.addListener(this::addCreative);

        LOGGER.info("Create Ages initialized for NeoForge 21.1.169!");
    }

    // Метод для добавления предметов в креативные вкладки
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.ANDESITE_MECHANISM.get());
            event.accept(ModItems.COPPER_MECHANISM.get());
            event.accept(ModItems.ZINC_HAND.get());
            event.accept(ModItems.RUBBER.get());
            event.accept(ModItems.CURED_RUBBER.get());
            //event.accept(ModItems.INCOMPLETE_ANDESITE_MECHANISM.get());
            //event.accept(ModItems.INCOMPLETE_COPPER_MECHANISM.get());
        }

        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            event.accept(ModBlocks.ANDESITE_MACHINE.get());
            event.accept(ModBlocks.COPPER_MACHINE.get());
            event.accept(ModBlocks.BRASS_MACHINE.get());
        }
    }

    // Вспомогательный метод для создания ResourceLocation
    public static ResourceLocation asResource(String path) {
        return ResourceLocation.parse(MOD_ID + ":" + path);
    }
}