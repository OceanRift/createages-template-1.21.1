package com.riftx666.createages.registry;

import com.riftx666.createages.CreateAges;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    // Регистр для блоков
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(Registries.BLOCK, CreateAges.MOD_ID);

    // Регистрируем блоки
    public static final Supplier<Block> ANDESITE_MACHINE =
            BLOCKS.register("andesite_machine",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .mapColor(MapColor.STONE)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 6.0F)
                            .noOcclusion())); // Добавьте эту строку



    public static final Supplier<Block> COPPER_MACHINE =
            BLOCKS.register("copper_machine",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_ORANGE)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 6.0F)));

    public static final Supplier<Block> BRASS_MACHINE =
            BLOCKS.register("brass_machine",
                    () -> new Block(BlockBehaviour.Properties.of()
                            .mapColor(MapColor.GOLD)
                            .requiresCorrectToolForDrops()
                            .strength(3.5F, 6.0F)));

    // Метод для регистрации блок-предметов
    public static void registerBlockItems() {
        ModItems.ITEMS.register("andesite_machine",
                () -> new BlockItem(ANDESITE_MACHINE.get(),
                        new Item.Properties()));

        ModItems.ITEMS.register("copper_machine",
                () -> new BlockItem(COPPER_MACHINE.get(),
                        new Item.Properties()));

        ModItems.ITEMS.register("brass_machine",
                () -> new BlockItem(BRASS_MACHINE.get(),
                        new Item.Properties()));
    }
}