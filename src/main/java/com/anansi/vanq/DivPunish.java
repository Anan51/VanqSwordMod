package com.anansi.vanq;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;

public class DivPunish extends SwordItem {

    public DivPunish(IItemTier p_i48460_1_, int p_i48460_2_, float p_i48460_3_, Properties p_i48460_4_) {
        super(p_i48460_1_, p_i48460_2_, p_i48460_3_, p_i48460_4_);
    }

    @Override
    public boolean hurtEnemy(ItemStack p_77644_1_, LivingEntity p_77644_2_, LivingEntity p_77644_3_) {

        p_77644_2_.hurt(DamageSource.MAGIC, 8f);
        p_77644_2_.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 200, 2));
        p_77644_2_.addEffect(new EffectInstance(Effects.WITHER, 200, 0));
        p_77644_2_.addEffect(new EffectInstance(Effects.WEAKNESS, 200, 2));
        return super.hurtEnemy(p_77644_1_, p_77644_2_, p_77644_3_);

    }
}
