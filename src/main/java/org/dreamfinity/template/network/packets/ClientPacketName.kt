package org.dreamfinity.template.network.packets

import io.netty.buffer.ByteBuf

class ClientPacketName : AbstractPacketClient() {
    var message = ""
    override fun write(data: ByteBuf?) {
        TODO("Not yet implemented")
    }

    @Throws(IndexOutOfBoundsException::class)
    override fun read(data: ByteBuf?) {
        message = readString(data!!)
    }
}