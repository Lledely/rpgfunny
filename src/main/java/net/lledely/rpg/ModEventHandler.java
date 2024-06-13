package net.lledely.rpg;

import net.lledely.rpg.effect.RefractionEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Iterator;

@Mod.EventBusSubscriber(Dist.CLIENT)
public class ModEventHandler {

    @SubscribeEvent
    public static void hurtEvent(LivingHurtEvent event) {
        java.util.Collection<net.minecraft.world.effect.MobEffectInstance> activeEffects = event.getEntity().getActiveEffects();
        for (MobEffectInstance effect : activeEffects) {
            if (effect.getEffect() instanceof RefractionEffect) {
                event.setAmount(0);
            }
        }
    }

}
