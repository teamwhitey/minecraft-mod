package net.mcreator.betterend.world;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.world.GameRules;

import net.mcreator.betterend.BetterEndModElements;

import java.lang.reflect.Method;

@BetterEndModElements.ModElement.Tag
public class DosneakerspawningGameRule extends BetterEndModElements.ModElement {
	public static final GameRules.RuleKey<GameRules.BooleanValue> gamerule = GameRules.register("dosneakerspawning", GameRules.Category.MOBS,
			create(false));
	public DosneakerspawningGameRule(BetterEndModElements instance) {
		super(instance, 408);
	}

	public static GameRules.RuleType<GameRules.BooleanValue> create(boolean defaultValue) {
		try {
			Method createGameruleMethod = ObfuscationReflectionHelper.findMethod(GameRules.BooleanValue.class, "func_223568_b", boolean.class);
			createGameruleMethod.setAccessible(true);
			return (GameRules.RuleType<GameRules.BooleanValue>) createGameruleMethod.invoke(null, defaultValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
