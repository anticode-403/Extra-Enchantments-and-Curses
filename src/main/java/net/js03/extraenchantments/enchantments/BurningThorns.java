package net.js03.extraenchantments.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;

public class BurningThorns extends Enchantment {
    public BurningThorns() {
        super(Rarity.VERY_RARE, EnchantmentTarget.ARMOR_CHEST, new EquipmentSlot[]{EquipmentSlot.CHEST});
    }

    @Override
    public int getMinPower(int level) {
        return 11 + 21 * (level - 1);
    }

    @Override
    public int getMaxPower(int level) {
        return super.getMinPower(level) + 51;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    protected boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != Enchantments.THORNS;
    }

    @Override
    public boolean isTreasure() {
        return false;
    }

    public void onUserDamaged(LivingEntity user, Entity attacker, int level) {
        int rng = (int) (1 + Math.random() * 4);
        if (attacker instanceof LivingEntity && rng <= level && !attacker.isOnFire() && attacker != user) {
            attacker.setOnFireFor(3);
        }
    }

}
