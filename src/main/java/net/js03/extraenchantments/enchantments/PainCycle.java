package net.js03.extraenchantments.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class PainCycle extends Enchantment {

    private int hits;

    public PainCycle() {
        super(Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
        hits = 0;
    }

    @Override
    public int getMinPower(int level) {
        return 5 + (level - 1) * 9;
    }

    @Override
    public int getMaxPower(int level) {
        return this.getMinPower(level) + 20;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    //    @Override
//    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
//        if (target instanceof HostileEntity || target instanceof PlayerEntity || target instanceof HoglinEntity || target instanceof BeeEntity
//                || target instanceof DolphinEntity || target instanceof GoatEntity || target instanceof GolemEntity || target instanceof LlamaEntity
//                || target instanceof TraderLlamaEntity || target instanceof PandaEntity || target instanceof PolarBearEntity || target instanceof WolfEntity
//                || target instanceof PufferfishEntity || target instanceof SlimeEntity || target instanceof MagmaCubeEntity || target instanceof PhantomEntity
//                || target instanceof EnderDragonEntity) {
//            if (!((LivingEntity) target).getRecentDamageSource().isIn(DamageTypeTags.IS_PROJECTILE)) {
//                if (hits >= 7) {
//                    if (((LivingEntity) target).getRecentDamageSource() != null) {
//                        target.damage(user.getDamageSources().magic(), 20);
//                        user.getWorld().playSound(null, target.getBlockPos(), SoundEvents.ENTITY_ARROW_HIT_PLAYER, SoundCategory.MASTER, 1f, 1f);
//                        hits = 0;
//                    }
//                } else {
//                    hits++;
//                    if (user.getHealth() < 1) {
//                        user.damage(user.getDamageSources().magic(), 100);
//                    } else {
//                        user.setHealth(user.getHealth() - 0.5f);
//                    }
//                    user.getWorld().playSound(null, user.getBlockPos(), SoundEvents.PARTICLE_SOUL_ESCAPE, SoundCategory.MASTER, 3f, 1f);
//                }
//            }
//        }
//    }
}
