package org.dreamfinity.template.proxy

import cpw.mods.fml.common.event.FMLInitializationEvent
import cpw.mods.fml.common.event.FMLPostInitializationEvent
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import cpw.mods.fml.common.network.simpleimpl.MessageContext
import net.minecraft.client.Minecraft
import net.minecraft.entity.player.EntityPlayer

class ClientProxy : CommonProxy() {
    override fun preInit(event: FMLPreInitializationEvent?) {}
    override fun init(event: FMLInitializationEvent?) {
        registerKeyBindings()
        registerEvents()
        registerEvents()
    }

    override fun postInit(event: FMLPostInitializationEvent?) {}
    private fun registerKeyBindings() {}
    fun registerRenderers() {}
    private fun registerEvents() {}
    override fun getPlayerEntity(context: MessageContext): EntityPlayer? {
        return if (context.side.isClient) Minecraft.getMinecraft().thePlayer else super.getPlayerEntity(context)
    }
}