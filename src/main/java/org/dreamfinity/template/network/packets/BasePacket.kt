package org.dreamfinity.template.network.packets

import io.netty.buffer.ByteBuf

abstract class BasePacket {
    @Throws(IndexOutOfBoundsException::class)
    abstract fun write(data: ByteBuf?)
    @Throws(IndexOutOfBoundsException::class)
    abstract fun read(data: ByteBuf?)
    @Throws(IndexOutOfBoundsException::class)
    fun writeString(string: String, data: ByteBuf) {
        val stringBytes = string.toByteArray()
        data.writeInt(stringBytes.size)
        data.writeBytes(stringBytes)
    }

    @Throws(IndexOutOfBoundsException::class)
    fun readString(data: ByteBuf): String {
        val length = data.readInt()
        val stringBytes = ByteArray(length)
        data.readBytes(stringBytes)
        return stringBytes.toString()
    }
}