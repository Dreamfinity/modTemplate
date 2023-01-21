package org.dreamfinity.template.network.packets

import io.netty.buffer.ByteBuf

class ServerPacketName : AbstractPacketServer() {
    @Throws(IndexOutOfBoundsException::class)
    override fun write(data: ByteBuf?) {
        data!!.writeBoolean(true)
    }
}