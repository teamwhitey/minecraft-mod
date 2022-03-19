
package net.mcreator.betterend.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.betterend.itemgroup.BetterendstuffItemGroup;
import net.mcreator.betterend.block.CobboledendstoneBlock;
import net.mcreator.betterend.BetterEndModElements;

@BetterEndModElements.ModElement.Tag
public class CobboledendstonetoolsPickaxeItem extends BetterEndModElements.ModElement {
	@ObjectHolder("better_end:cobboledendstonetools_pickaxe")
	public static final Item block = null;
	public CobboledendstonetoolsPickaxeItem(BetterEndModElements instance) {
		super(instance, 79);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 240;
			}

			public float getEfficiency() {
				return 3.5f;
			}

			public float getAttackDamage() {
				return -1.4f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 8;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CobboledendstoneBlock.block));
			}
		}, 1, -3.5f, new Item.Properties().group(BetterendstuffItemGroup.tab)) {
		}.setRegistryName("cobboledendstonetools_pickaxe"));
	}
}
