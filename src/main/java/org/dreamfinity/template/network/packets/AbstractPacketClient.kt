package org.dreamfinity.template.network.packets

import io.netty.buffer.ByteBuf

@Suppress("unused")
abstract class AbstractPacketClient : BasePacket() {
    override fun write(data: ByteBuf?) {}
}