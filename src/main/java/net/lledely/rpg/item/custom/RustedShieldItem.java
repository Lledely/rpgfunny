package net.lledely.rpg.item.custom;

import net.lledely.rpg.effect.ModEffects;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingDamageEvent;

public class RustedShieldItem extends Item {

    private final int USE_COOLDOWN = 300;
    private final int RESISTANCE_DURATION = 100;

    public RustedShieldItem(Properties pProperties) {
        super(pProperties);
    }

    public int get_cooldown() {
        return this.USE_COOLDOWN;
    }

//    public UseAnim getUseAnimation(ItemStack p_43105_) {
//        return UseAnim.BLOCK;
//    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {

        assert player != null;
        player.getCooldowns().addCooldown(this, USE_COOLDOWN);

        player.addEffect(new MobEffectInstance(ModEffects.REFRACTION.get(),
                RESISTANCE_DURATION,
                5,
                true,
                true,
                true), player);

        return InteractionResultHolder.success(player.getItemInHand(hand));
    }


}
