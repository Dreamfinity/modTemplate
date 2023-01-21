package org.dreamfinity.template.network.packets

enum class EnumPacket(val packetClass: Class<out BasePacket?>) {
    GUILD_NAME(ClientPacketName::class.java), GUILD_GETNAME(ServerPacketName::class.java)

}