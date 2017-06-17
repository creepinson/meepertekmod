package me.creepinson.tileentity;

import net.minecraft.block.BlockSkull;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TECreepinoSkull extends TileEntity implements ITickable {

	private int skullRotation;

	@Override
	public void update() {

	}

	@SideOnly(Side.CLIENT)
	public int getSkullRotation() {
		return this.skullRotation;
	}

	public void setSkullRotation(int rotation) {
		this.skullRotation = rotation;
	}

	public void mirror(Mirror mirrorIn) {
		if (this.world != null
				&& this.world.getBlockState(this.getPos()).getValue(BlockSkull.FACING) == EnumFacing.UP) {
			this.skullRotation = mirrorIn.mirrorRotation(this.skullRotation, 16);
		}
	}

	public void rotate(Rotation rotationIn) {
		if (this.world != null
				&& this.world.getBlockState(this.getPos()).getValue(BlockSkull.FACING) == EnumFacing.UP) {
			this.skullRotation = rotationIn.rotate(this.skullRotation, 16);
		}
	}
}