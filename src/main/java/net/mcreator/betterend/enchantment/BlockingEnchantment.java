
package net.mcreator.betterend.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.betterend.item.WhiteSwordItem;
import net.mcreator.betterend.item.WhiteAxeItem;
import net.mcreator.betterend.item.EnderiteSwordItem;
import net.mcreator.betterend.item.EnderiteAxeItem;
import net.mcreator.betterend.item.EnderainiumSwordItem;
import net.mcreator.betterend.item.EnderainiumAxeItem;
import net.mcreator.betterend.item.CobboledendstonetoolsSwordItem;
import net.mcreator.betterend.item.CobboledendstonetoolsAxeItem;
import net.mcreator.betterend.BetterEndModElements;

@BetterEndModElements.ModElement.Tag
public class BlockingEnchantment extends BetterEndModElements.ModElement {
	@ObjectHolder("better_end:blocking")
	public static final Enchantment enchantment = null;
	public BlockingEnchantment(BetterEndModElements instance) {
		super(instance, 251);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("blocking"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.RARE, EnchantmentType.WEAPON, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 5;
		}

		@Override
		public int calcModifierDamage(int level, DamageSource source) {
			return level * 2;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == EnderiteAxeItem.block)
				return true;
			if (stack.getItem() == EnderiteSwordItem.block)
				return true;
			if (stack.getItem() == EnderainiumAxeItem.block)
				return true;
			if (stack.getItem() == EnderainiumSwordItem.block)
				return true;
			if (stack.getItem() == WhiteAxeItem.block)
				return true;
			if (stack.getItem() == WhiteSwordItem.block)
				return true;
			if (stack.getItem() == CobboledendstonetoolsAxeItem.block)
				return true;
			if (stack.getItem() == CobboledendstonetoolsSwordItem.block)
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return false;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}

		@Override
		public boolean canGenerateInLoot() {
			return true;
		}

		@Override
		public boolean canVillagerTrade() {
			return false;
		}
	}
}
