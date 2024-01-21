package net.lledely.rpg.item;

import net.lledely.rpg.RPGFunny;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(
            Registries.CREATIVE_MODE_TAB, RPGFunny.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RPG_TAB = CREATIVE_MODE_TABS.register("rpg_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUSTED_SHIELD.get()))
                    .title(Component.translatable("creativetab.rpg_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.RUSTED_SHIELD.get());
                        pOutput.accept(ModItems.SHABBY_BOW.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
