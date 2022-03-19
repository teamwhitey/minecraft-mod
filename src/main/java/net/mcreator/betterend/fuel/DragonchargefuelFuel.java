
package net.mcreator.betterend.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.betterend.item.DragonchargeItem;

@Mod.EventBusSubscriber
public class DragonchargefuelFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == DragonchargeItem.block)
			event.setBurnTime(10000);
	}
}
