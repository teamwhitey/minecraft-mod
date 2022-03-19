
package net.mcreator.betterend.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.betterend.item.EndsanddustItem;
import net.mcreator.betterend.BetterEndModElements;

@BetterEndModElements.ModElement.Tag
public class EnderdesertstuffItemGroup extends BetterEndModElements.ModElement {
	public EnderdesertstuffItemGroup(BetterEndModElements instance) {
		super(instance, 277);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabenderdesertstuff") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(EndsanddustItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
