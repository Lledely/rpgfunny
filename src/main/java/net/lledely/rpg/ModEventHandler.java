package net.lledely.rpg;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(Dist.CLIENT)
public class ModEventHandler {

    @SubscribeEvent
    public void hurtEvent(LivingHurtEvent event) {

    }

}
