package com.LvSb.MinFac.blocks;

import com.LvSb.MinFac.setup.Registration;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;

public class MagicTile extends TileEntity {

    public MagicTile() {
        super(Registration.MAGICBLOCK_TILE.get());
    }

    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        return new AxisAlignedBB(getPos(), getPos().add(1, 3, 1));
    }
}
