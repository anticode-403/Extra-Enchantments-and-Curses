package net.js03.extraenchantments.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class EnigmaResonator extends Enchantment {
    public EnigmaResonator() {
        super(Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }

    @Override
    public int getMinPower(int level) {
        return 5 + (level - 1) * 8;
    }

    @Override
    public int getMaxPower(int level) {
        return this.getMinPower(level) + 20;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    protected boolean canAccept(Enchantment other) {
        return !(other instanceof PainCycle) && !(other instanceof HealthForBlood) && !(other instanceof SoulReaper);
    }

    @Override
    public boolean isTreasure() {
        return false;
    }

    //    @Override
//    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
//        if (target instanceof LivingEntity) {
//            if (!((LivingEntity) target).getRecentDamageSource().isIn(DamageTypeTags.IS_PROJECTILE)) {
//                int rng = (int) (Math.random() * 35);
//                if (rng <= level) {
//                    if (((LivingEntity) target).getRecentDamageSource() != null) {
//                        target.damage(target.getDamageSources().generic(), (float) (user.getHealth() * 0.75));
//                    }
//                }
//            }
//        }
//    }
}
