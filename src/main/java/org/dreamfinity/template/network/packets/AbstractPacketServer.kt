package org.dreamfinity.template.network.packets

import io.netty.buffer.ByteBuf

abstract class AbstractPacketServer : BasePacket() {
    override fun read(data: ByteBuf?) {}
}