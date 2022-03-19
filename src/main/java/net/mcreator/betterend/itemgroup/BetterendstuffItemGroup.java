
package net.mcreator.betterend.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.betterend.block.StrangeblockBlock;
import net.mcreator.betterend.BetterEndModElements;

@BetterEndModElements.ModElement.Tag
public class BetterendstuffItemGroup extends BetterEndModElements.ModElement {
	public BetterendstuffItemGroup(BetterEndModElements instance) {
		super(instance, 191);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabbetterendstuff") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(StrangeblockBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
