package net.lledely.rpg.effect;

import net.lledely.rpg.RPGFunny;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {

    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, RPGFunny.MOD_ID);

    public static final RegistryObject<MobEffect> REFRACTION = MOB_EFFECTS.register("refraction",
            () -> new RefractionEffect(MobEffectCategory.BENEFICIAL, 69));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }

}
