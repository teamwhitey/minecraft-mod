package net.mcreator.betterend.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.betterend.potion.HauntedPotionEffect;
import net.mcreator.betterend.BetterEndMod;

import java.util.Map;

public class AplyhuantedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				BetterEndMod.LOGGER.warn("Failed to load dependency entity for procedure Aplyhuanted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(HauntedPotionEffect.potion, (int) 60, (int) 2, (false), (false)));
	}
}
