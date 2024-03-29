package {{cookiecutter.group_id}}.{{cookiecutter.modid}}.network.server;

import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;
import {{cookiecutter.group_id}}.{{cookiecutter.modid}}.{{cookiecutter.mod_main_class_name}};
import {{cookiecutter.group_id}}.{{cookiecutter.modid}}.network.AbstractMessage.AbstractServerMessage;

public class OpenGuiMessage extends AbstractServerMessage<OpenGuiMessage> {

	private int id;

	public OpenGuiMessage() {

	}

	public OpenGuiMessage(int id) {
		this.id = id;
	}

	@Override
	protected void read(PacketBuffer buffer) {
		id = buffer.readInt();
	}

	@Override
	protected void write(PacketBuffer buffer) {
		buffer.writeInt(id);
	}

	@Override
	public void process(EntityPlayer player, Side side) {
		player.openGui({{cookiecutter.mod_main_class_name}}.instance, this.id, player.worldObj, (int) player.posX, (int) player.posY, (int) player.posZ);
	}

}