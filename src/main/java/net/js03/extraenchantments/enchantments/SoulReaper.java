package net.js03.extraenchantments.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EquipmentSlot;

import java.util.Random;

public class SoulReaper extends Enchantment {

//    private float percentage = 1f;
    private Random rng;

    public SoulReaper() {
        super(Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
        rng = new Random();
    }

    @Override
    public float getAttackDamage(int level, EntityGroup group) {
        return -2.0f;
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
    protected boolean canAccept(Enchantment other) {
        return !(other instanceof PainCycle);
    }

    //    @Override
//    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
//        if (target instanceof HostileEntity || target instanceof PlayerEntity || target instanceof HoglinEntity || target instanceof BeeEntity
//                || target instanceof DolphinEntity || target instanceof GoatEntity || target instanceof GolemEntity || target instanceof LlamaEntity
//                || target instanceof TraderLlamaEntity || target instanceof PandaEntity || target instanceof PolarBearEntity || target instanceof WolfEntity
//                || target instanceof PufferfishEntity || target instanceof SlimeEntity || target instanceof MagmaCubeEntity || target instanceof PhantomEntity
//                || target instanceof EnderDragonEntity) {
//            if (((LivingEntity) target).isDead() && !((LivingEntity) target).getRecentDamageSource().isIn(DamageTypeTags.IS_PROJECTILE)) {
//                float randomNumber = rng.nextFloat(0.5f, 2f);
//                int randomNumber1 = rng.nextInt(6);
//                if (randomNumber1 <= 1) {
//                    user.getWorld().playSound(null, user.getBlockPos(), SoundEvents.PARTICLE_SOUL_ESCAPE, SoundCategory.MASTER, 3f, 1f);
//                    user.heal(randomNumber /* * percentage */);
//                }
//            }
//        }
//    }
}
