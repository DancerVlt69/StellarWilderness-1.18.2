package net.domakingo.stellarwilderness.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import java.util.Random;

public class StarBlock extends Block {
    public StarBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void onPlace(BlockState pState, Level pLevel, BlockPos pPos, BlockState pOldState, boolean pIsMoving) {
        super.onPlace(pState, pLevel, pPos, pOldState, pIsMoving);
    }

    @Override
    public void animateTick(BlockState pState, Level pLevel, BlockPos pPos, Random pRandom) {
        super.animateTick(pState, pLevel, pPos, pRandom);
        for (int i = 0; i < 2; i++) {
            double x = pPos.getX() + 0.5 + pRandom.nextDouble() * 1; // + 0.5 per far uscire le particelle dal centro del blocco, * 0.2 per limitare lo spostamento
            double y = pPos.getY() + 0.5 + pRandom.nextDouble() * 1; // + 0.5 per far uscire le particelle dal centro del blocco, * 0.2 per limitare lo spostamento
            double z = pPos.getZ() + 0.5 + pRandom.nextDouble() * 1; // + 0.5 per far uscire le particelle dal centro del blocco, * 0.2 per limitare lo spostamento

            pLevel.addParticle(ParticleTypes.WAX_OFF, x, y, z, 0, 0, 0);
        }
    }
}