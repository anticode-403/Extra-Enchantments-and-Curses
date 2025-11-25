package net.js03.extraenchantments;

import net.fabricmc.api.ModInitializer;
import net.js03.extraenchantments.curses.*;
import net.js03.extraenchantments.enchantments.*;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtraEnchantsMain implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("extra_enchants");

    public static final Enchantment HEALTH_FOR_BLOOD = new HealthForBlood();
    public static final Enchantment FREEZING_ASPECT = new FreezingAspect();
    public static final Enchantment BURNING_THORNS = new BurningThorns();
    public static final Enchantment FREEZING_THORNS = new FreezingThorns();
    public static final Enchantment HELLWALKER = new HellWalker();
    public static final Enchantment PAIN_CYCLE = new PainCycle();
    public static final Enchantment SOUL_REAPER = new SoulReaper();
    public static final Enchantment CURSE_OF_ZEUS = new CurseOfZeus();
    public static final Enchantment ELECTRIFIED = new Electrified();
    public static final Enchantment CURSE_OF_UNDEAD = new CurseOfUndead();
    public static final Enchantment CURSE_OF_SLOWNESS = new CurseOfSlowness();
    public static final Enchantment CURSE_OF_INCOMPATIBILITY = new CurseOfIncompatibility();
    public static final Enchantment ELECTRIFYING_SHOT = new ElectrifyingShot();
    public static final Enchantment RESONATING_SHOT = new ResonatingShot();
    public static final Enchantment HOT_SHOT = new HotShot();
    public static final Enchantment ECHO = new Echo();
    public static final Enchantment ENIGMA_RESONATOR = new EnigmaResonator();
    public static final Enchantment TARGET_LOCK = new TargetLock();
    public static final Enchantment SWIFTNESS = new Swiftness();
    public static final Enchantment CURSE_OF_ATTRITION = new CurseOfAttrition();
    public static final Enchantment OVERSHIELD = new Overshield();
    public static final Enchantment EXPERIENCE_CATALYST = new ExperienceCatalyst();
    public static final Enchantment ENERGIZED = new Energized();
    public static final Enchantment CURSE_OF_FRAGILITY = new CurseOfFragility();


    @Override
    public void onInitialize() {
        Registry.register(Registries.ENCHANTMENT, new Identifier("extra_enchantments", "lifesteal"), HEALTH_FOR_BLOOD);
        Registry.register(Registries.ENCHANTMENT, new Identifier("extra_enchantments", "pain_cycle"), PAIN_CYCLE);
        Registry.register(Registries.ENCHANTMENT, new Identifier("extra_enchantments", "soul_reaper"), SOUL_REAPER);
        Registry.register(Registries.ENCHANTMENT, new Identifier("extra_enchantments", "freezing_aspect"), FREEZING_ASPECT);
        Registry.register(Registries.ENCHANTMENT, new Identifier("extra_enchantments", "enigma_resonator"), ENIGMA_RESONATOR);
        Registry.register(Registries.ENCHANTMENT, new Identifier("extra_enchantments", "swiftness"), SWIFTNESS);
        Registry.register(Registries.ENCHANTMENT, new Identifier("extra_enchantments", "experience_catalyst"), EXPERIENCE_CATALYST);
        Registry.register(Registries.ENCHANTMENT, new Identifier("extra_enchantments", "burning_thorns"), BURNING_THORNS);
        Registry.register(Registries.ENCHANTMENT, new Identifier("extra_enchantments", "freezing_thorns"), FREEZING_THORNS);
        Registry.register(Registries.ENCHANTMENT, new Identifier("extra_enchantments", "overshield"), OVERSHIELD);
        Registry.register(Registries.ENCHANTMENT, new Identifier("extra_enchantments", "hellwalker"), HELLWALKER);
        Registry.register(Registries.ENCHANTMENT, new Identifier("extra_enchantments", "electrified"), ELECTRIFIED);
        Registry.register(Registries.ENCHANTMENT, new Identifier("extra_enchantments", "energized"), ENERGIZED);
        Registry.register(Registries.ENCHANTMENT, new Identifier("extra_enchantments", "electrifying_shot"), ELECTRIFYING_SHOT);
        Registry.register(Registries.ENCHANTMENT, new Identifier("extra_enchantments", "resonating_shot"), RESONATING_SHOT);
        Registry.register(Registries.ENCHANTMENT, new Identifier("extra_enchantments", "echo"), ECHO);
        Registry.register(Registries.ENCHANTMENT, new Identifier("extra_enchantments", "incandescent"), HOT_SHOT);
        Registry.register(Registries.ENCHANTMENT, new Identifier("extra_enchantments", "target_lock"), TARGET_LOCK);
        Registry.register(Registries.ENCHANTMENT, new Identifier("extra_enchantments", "zeus_curse"), CURSE_OF_ZEUS);
        Registry.register(Registries.ENCHANTMENT, new Identifier("extra_enchantments", "incompatibility_curse"), CURSE_OF_INCOMPATIBILITY);
        Registry.register(Registries.ENCHANTMENT, new Identifier("extra_enchantments", "fragility_curse"), CURSE_OF_FRAGILITY);
        Registry.register(Registries.ENCHANTMENT, new Identifier("extra_enchantments", "slowness_curse"), CURSE_OF_SLOWNESS);
        Registry.register(Registries.ENCHANTMENT, new Identifier("extra_enchantments", "undead_curse"), CURSE_OF_UNDEAD);
        Registry.register(Registries.ENCHANTMENT, new Identifier("extra_enchantments", "attrition_curse"), CURSE_OF_ATTRITION);
    }
}
