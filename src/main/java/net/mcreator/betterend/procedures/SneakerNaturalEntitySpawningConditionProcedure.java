package net.mcreator.betterend.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.betterend.world.DosneakerspawningGameRule;
import net.mcreator.betterend.BetterEndMod;

import java.util.Map;

public class SneakerNaturalEntitySpawningConditionProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BetterEndMod.LOGGER.warn("Failed to load dependency world for procedure SneakerNaturalEntitySpawningCondition!");
			return false;
		}
		IWorld world = (IWorld) dependencies.get("world");
		boolean sneakerspawn = false;
		sneakerspawn = (boolean) (world.getWorldInfo().getGameRulesInstance().getBoolean(DosneakerspawningGameRule.gamerule));
		if ((sneakerspawn == (true))) {
			return (true);
		}
		return (false);
	}
}
