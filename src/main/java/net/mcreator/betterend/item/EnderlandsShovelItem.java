
package net.mcreator.betterend.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.betterend.itemgroup.EnderdesertstuffItemGroup;
import net.mcreator.betterend.BetterEndModElements;

@BetterEndModElements.ModElement.Tag
public class EnderlandsShovelItem extends BetterEndModElements.ModElement {
	@ObjectHolder("better_end:enderlands_shovel")
	public static final Item block = null;
	public EnderlandsShovelItem(BetterEndModElements instance) {
		super(instance, 289);
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
				return Ingredient.fromStacks(new ItemStack(EnderlandsIngotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(EnderdesertstuffItemGroup.tab)) {
		}.setRegistryName("enderlands_shovel"));
	}
}
