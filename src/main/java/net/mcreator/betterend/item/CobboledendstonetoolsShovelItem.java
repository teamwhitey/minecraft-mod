
package net.mcreator.betterend.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.betterend.itemgroup.BetterendstuffItemGroup;
import net.mcreator.betterend.block.CobboledendstoneBlock;
import net.mcreator.betterend.BetterEndModElements;

@BetterEndModElements.ModElement.Tag
public class CobboledendstonetoolsShovelItem extends BetterEndModElements.ModElement {
	@ObjectHolder("better_end:cobboledendstonetools_shovel")
	public static final Item block = null;
	public CobboledendstonetoolsShovelItem(BetterEndModElements instance) {
		super(instance, 82);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
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
				return Ingredient.fromStacks(new ItemStack(CobboledendstoneBlock.block));
			}
		}, 1, -3f, new Item.Properties().group(BetterendstuffItemGroup.tab)) {
		}.setRegistryName("cobboledendstonetools_shovel"));
	}
}
