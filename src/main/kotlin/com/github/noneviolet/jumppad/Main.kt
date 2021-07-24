package com.github.noneviolet.jumppad

import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    companion object {
        internal lateinit var plugin: JavaPlugin
    }
    init {
        plugin = this
    }

    @OptIn(ExperimentalStdlibApi::class)
    override fun onEnable() {
        EventListener.register()
        CommandRegister.register()
        ConfigLoader.load(server.consoleSender)
    }
}
