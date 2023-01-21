package org.dreamfinity.template

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.SidedProxy
import cpw.mods.fml.common.event.FMLInitializationEvent
import cpw.mods.fml.common.event.FMLPostInitializationEvent
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import org.apache.logging.log4j.LogManager
import org.dreamfinity.template.proxy.CommonProxy

@Mod(modid = Template.MODID, name = Template.NAME, version = Template.VERSION)
class Template {
    @Mod.EventHandler
    fun preInit(event: FMLPreInitializationEvent?) {
        proxy!!.preInit(event)
    }

    @Mod.EventHandler
    fun Init(event: FMLInitializationEvent?) {
        proxy!!.init(event)
    }

    @Mod.EventHandler
    fun postInit(event: FMLPostInitializationEvent?) {
        proxy!!.postInit(event)
    }

    companion object {
        const val MODID = "template"
        const val NAME = "Mod Template"
        const val VERSION = "@version@"
        var logger = LogManager.getLogger(MODID)

        @JvmField
        @Mod.Instance(MODID)
        var instance: Template? = null

        @JvmField
        @SidedProxy(clientSide = "org.dreamfinity.template.proxy.ClientProxy", serverSide = "org.dreamfinity.template.proxy.CommonProxy")
        var proxy: CommonProxy? = null
    }
}