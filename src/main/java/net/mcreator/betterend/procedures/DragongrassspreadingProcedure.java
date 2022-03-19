package net.mcreator.betterend.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.betterend.block.EnderstoneBlock;
import net.mcreator.betterend.block.DragonnylimBlock;
import net.mcreator.betterend.BetterEndMod;

import java.util.Map;

public class DragongrassspreadingProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				BetterEndMod.LOGGER.warn("Failed to load dependency x for procedure Dragongrassspreading!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				BetterEndMod.LOGGER.warn("Failed to load dependency y for procedure Dragongrassspreading!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				BetterEndMod.LOGGER.warn("Failed to load dependency z for procedure Dragongrassspreading!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BetterEndMod.LOGGER.warn("Failed to load dependency world for procedure Dragongrassspreading!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.isAirBlock(new BlockPos((int) x, (int) (y + 1), (int) z)))
				&& (((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == EnderstoneBlock.block)
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == EnderstoneBlock.block))
						|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
								.getBlock() == EnderstoneBlock.block)
								|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == EnderstoneBlock.block)))
						|| (((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == EnderstoneBlock.block)
								|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getBlock() == EnderstoneBlock.block))
								|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == EnderstoneBlock.block)
										|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))
												.getBlock() == EnderstoneBlock.block)))
								|| ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getBlock() == EnderstoneBlock.block)
										|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))
												.getBlock() == EnderstoneBlock.block))
										|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))
												.getBlock() == EnderstoneBlock.block)
												|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))
														.getBlock() == EnderstoneBlock.block))))))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), DragonnylimBlock.block.getDefaultState(), 3);
		}
	}
}
