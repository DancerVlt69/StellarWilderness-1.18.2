package net.domakingo.stellarwilderness.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.Random;

public class TestBlock extends Block {
    public TestBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void setPlacedBy(@NotNull Level pLevel, @NotNull BlockPos pPos, @NotNull BlockState pState, @Nullable LivingEntity pPlacer, @NotNull ItemStack pStack) {
        super.setPlacedBy(pLevel, pPos, pState, pPlacer, pStack);

        if (areAdjacent(pLevel, pPos, -1, 0, 0) && areAdjacent(pLevel, pPos, 1, 0, 0) ||
                areAdjacent(pLevel, pPos, 0, -1, 0) && areAdjacent(pLevel, pPos, 0, 1, 0) ||
                areAdjacent(pLevel, pPos, 0, 0, -1) && areAdjacent(pLevel, pPos, 0, 0, 1) ||
                areAdjacent(pLevel, pPos, 0, 1, 0) && areAdjacent(pLevel, pPos, 0, 2, 0) ||
                areAdjacent(pLevel, pPos, 0, -1, 0) && areAdjacent(pLevel, pPos, 0, -2, 0) ||
                areAdjacent(pLevel, pPos, 0, 0, 1) && areAdjacent(pLevel, pPos, 0, 0, 2) ||
                areAdjacent(pLevel, pPos, 0, 0, -1) && areAdjacent(pLevel, pPos, 0, 0, -2) ||
                areAdjacent(pLevel, pPos, 1, 0, 0) && areAdjacent(pLevel, pPos, 2, 0, 0) ||
                areAdjacent(pLevel, pPos, -1, 0, 0) && areAdjacent(pLevel, pPos, -2, 0, 0)) {
            Random random = new Random();
            for (int i = 0; i < 20; i++) {
                double xOffset = (random.nextDouble() - 0.5) * 0.5;
                double yOffset = (random.nextDouble() - 0.5) * 0.5;
                double zOffset = (random.nextDouble() - 0.5) * 0.5;

                double velX = random.nextDouble() - 0.5;
                double velY = random.nextDouble() - 0.5;
                double velZ = random.nextDouble() - 0.5;
                double length = Math.sqrt(velX * velX + velY * velY + velZ * velZ);
                velX /= length;
                velY /= length;
                velZ /= length;

                pLevel.addParticle(ParticleTypes.CRIT, pPos.getX() + 0.5 + xOffset, pPos.getY() + 0.5 + yOffset, pPos.getZ() + 0.5 + zOffset, velX, velY, velZ);
            }
        }
    }

    private boolean areAdjacent(Level pLevel, BlockPos pPos, int dx, int dy, int dz) {
        return pLevel.getBlockState(pPos.offset(dx, dy, dz)).getBlock() == this;
    }
}

