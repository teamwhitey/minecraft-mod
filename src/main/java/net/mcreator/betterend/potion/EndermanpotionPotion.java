
package net.mcreator.betterend.potion;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.potion.Potion;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EndermanpotionPotion {
	@ObjectHolder("better_end:endermanpotion")
	public static final Potion potionType = null;
	@SubscribeEvent
	public static void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}
	public static class PotionCustom extends Potion {
		public PotionCustom() {
			super(new EffectInstance(HauntedPotionEffect.potion, 500, 1, false, true), new EffectInstance(Effects.STRENGTH, 3600, 2, false, true),
					new EffectInstance(Effects.SPEED, 10000, 2, false, true), new EffectInstance(Effects.RESISTANCE, 3600, 2, false, true));
			setRegistryName("endermanpotion");
		}
	}
}
