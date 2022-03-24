
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
public class ObsidaniteHoeItem extends BetterEndModElements.ModElement {
	@ObjectHolder("better_end:obsidanite_hoe")
	public static final Item block = null;
	public ObsidaniteHoeItem(BetterEndModElements instance) {
		super(instance, 313);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 4595;
			}

			public float getEfficiency() {
				return 21f;
			}

			public float getAttackDamage() {
				return 14f;
			}

			public int getHarvestLevel() {
				return 16;
			}

			public int getEnchantability() {
				return 112;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ObsidaniteingotItem.block));
			}
		}, 0, -3f, new Item.Properties().group(BetterendstuffItemGroup.tab)) {
		}.setRegistryName("obsidanite_hoe"));
	}
}
