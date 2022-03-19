
package net.mcreator.betterend.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.betterend.itemgroup.EnderdesertstuffItemGroup;
import net.mcreator.betterend.BetterEndModElements;

@BetterEndModElements.ModElement.Tag
public class EnderlandsHoeItem extends BetterEndModElements.ModElement {
	@ObjectHolder("better_end:enderlands_hoe")
	public static final Item block = null;
	public EnderlandsHoeItem(BetterEndModElements instance) {
		super(instance, 290);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(EnderlandsIngotItem.block));
			}
		}, 0, -3f, new Item.Properties().group(EnderdesertstuffItemGroup.tab)) {
		}.setRegistryName("enderlands_hoe"));
	}
}
