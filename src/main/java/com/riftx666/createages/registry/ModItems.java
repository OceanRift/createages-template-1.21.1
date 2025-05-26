package com.riftx666.createages.registry;

import com.riftx666.createages.CreateAges;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems {
    // DeferredRegister - это специальный класс NeoForge для регистрации контента
    // Создаем регистр для предметов
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(Registries.ITEM, CreateAges.MOD_ID);

    // Регистрируем предметы как Supplier<Item>
    // Supplier - это функциональный интерфейс, который возвращает объект

    // Механизмы
    public static final Supplier<Item> ANDESITE_MECHANISM =
            ITEMS.register("andesite_mechanism",
                    () -> new Item(new Item.Properties()));

    public static final Supplier<Item> COPPER_MECHANISM =
            ITEMS.register("copper_mechanism",
                    () -> new Item(new Item.Properties()));

    // Компоненты
    public static final Supplier<Item> ZINC_HAND =
            ITEMS.register("zinc_hand",
                    () -> new Item(new Item.Properties()));

    // Промежуточные предметы для крафта - не будут отображаться в JEI и вкладках
    public static final Supplier<Item> INCOMPLETE_ANDESITE_MECHANISM =
            ITEMS.register("incomplete_andesite_mechanism",
                    () -> new Item(new Item.Properties()));

    public static final Supplier<Item> INCOMPLETE_COPPER_MECHANISM =
            ITEMS.register("incomplete_copper_mechanism",
                    () -> new Item(new Item.Properties()));

    // Новые предметы: резина и обработанная резина
    public static final Supplier<Item> RUBBER =
            ITEMS.register("rubber",
                    () -> new Item(new Item.Properties()));

    public static final Supplier<Item> CURED_RUBBER =
            ITEMS.register("cured_rubber",
                    () -> new Item(new Item.Properties()));
}