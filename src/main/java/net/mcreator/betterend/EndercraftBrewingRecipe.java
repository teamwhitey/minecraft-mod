
package net.mcreator.betterend;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.potion.PotionUtils;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.betterend.potion.EndermanpotionPotion;
import net.mcreator.betterend.block.StrangeblockBlock;

@BetterEndModElements.ModElement.Tag
public class EndercraftBrewingRecipe extends BetterEndModElements.ModElement {
	public EndercraftBrewingRecipe(BetterEndModElements instance) {
		super(instance, 377);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}
	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == Items.POTION;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == StrangeblockBlock.block.asItem();
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), EndermanpotionPotion.potionType);
			}
			return ItemStack.EMPTY;
		}
	}
}
