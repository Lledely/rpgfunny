package net.lledely.rpg.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class RefractionEffect extends MobEffect {

    private static final float MULTIPIER = 0.0f;
    protected RefractionEffect(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);
    }

}
