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

    public static final RegistryObject<Item> RUSTED_SHIELD = ITEMS.register("rusted_shield",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SHABBY_BOW = ITEMS.register("shabby_bow",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
