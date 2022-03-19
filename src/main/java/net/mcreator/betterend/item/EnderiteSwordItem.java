
package net.mcreator.betterend.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.betterend.itemgroup.BetterendstuffItemGroup;
import net.mcreator.betterend.BetterEndModElements;

@BetterEndModElements.ModElement.Tag
public class EnderiteSwordItem extends BetterEndModElements.ModElement {
	@ObjectHolder("better_end:enderite_sword")
	public static final Item block = null;
	public EnderiteSwordItem(BetterEndModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1110;
			}

			public float getEfficiency() {
				return 11f;
			}

			public float getAttackDamage() {
				return 15f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 41;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(EnderiteIngotItem.block));
			}
		}, 3, -3f, new Item.Properties().group(BetterendstuffItemGroup.tab)) {
		}.setRegistryName("enderite_sword"));
	}
}
