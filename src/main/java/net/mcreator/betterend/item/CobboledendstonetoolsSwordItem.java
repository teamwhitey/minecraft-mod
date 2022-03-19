
package net.mcreator.betterend.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.betterend.itemgroup.BetterendstuffItemGroup;
import net.mcreator.betterend.block.CobboledendstoneBlock;
import net.mcreator.betterend.BetterEndModElements;

@BetterEndModElements.ModElement.Tag
public class CobboledendstonetoolsSwordItem extends BetterEndModElements.ModElement {
	@ObjectHolder("better_end:cobboledendstonetools_sword")
	public static final Item block = null;
	public CobboledendstonetoolsSwordItem(BetterEndModElements instance) {
		super(instance, 81);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 4f;
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
		}, 3, -3f, new Item.Properties().group(BetterendstuffItemGroup.tab)) {
		}.setRegistryName("cobboledendstonetools_sword"));
	}
}
