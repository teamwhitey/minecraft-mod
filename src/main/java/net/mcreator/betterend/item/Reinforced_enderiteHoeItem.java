
package net.mcreator.betterend.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.betterend.itemgroup.BetterendstuffItemGroup;
import net.mcreator.betterend.BetterEndModElements;

@BetterEndModElements.ModElement.Tag
public class Reinforced_enderiteHoeItem extends BetterEndModElements.ModElement {
	@ObjectHolder("better_end:reinforced_enderite_hoe")
	public static final Item block = null;
	public Reinforced_enderiteHoeItem(BetterEndModElements instance) {
		super(instance, 330);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1741;
			}

			public float getEfficiency() {
				return 14f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 8;
			}

			public int getEnchantability() {
				return 56;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Reinforced_enderiteIngotItem.block));
			}
		}, 0, -3f, new Item.Properties().group(BetterendstuffItemGroup.tab)) {
		}.setRegistryName("reinforced_enderite_hoe"));
	}
}
