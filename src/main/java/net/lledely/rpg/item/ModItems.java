package net.lledely.rpg.item;

import net.lledely.rpg.RPGFunny;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RPGFunny.MOD_ID);

    public static final RegistryObject<Item> DARK_DIAMOND = ITEMS.register("dark_diamond",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUSTED_SHIELD = ITEMS.register("rusted_shield",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SHABBY_BOW = ITEMS.register("shabby_bow",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> HOLY_WATER_BATTLE = ITEMS.register("holy_water_bottle",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> RUSTY_PICKAXE = ITEMS.register("rusty_pickaxe",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> DULL_AXE = ITEMS.register("dull_axe",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> CRACKED_HOE = ITEMS.register("cracked_hoe",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> OLD_COLLAR = ITEMS.register("old_collar",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
