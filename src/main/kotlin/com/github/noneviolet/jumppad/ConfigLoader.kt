package com.github.noneviolet.jumppad

import com.github.noneviolet.jumppad.Main.Companion.plugin
import com.github.syari.spigot.api.config.CustomConfig
import com.github.syari.spigot.api.config.config
import com.github.syari.spigot.api.config.type.ConfigDataType
import org.bukkit.Material
import org.bukkit.command.CommandSender

object ConfigLoader {

    var isEnable = true
    var blockCore = Material.EMERALD_BLOCK
    var blockPad = Material.OAK_PRESSURE_PLATE
    var jumpHeight = 2.0f

    fun load(sender: CommandSender) {
        config(sender) {
            isEnable = get("enable", ConfigDataType.Boolean) ?: false
            blockCore = get("blockCore", ConfigDataType.Material) ?: Material.EMERALD_BLOCK
            blockPad = get("blockPad", ConfigDataType.Material) ?: Material.OAK_PRESSURE_PLATE
            jumpHeight = get("jumpHeight", ConfigDataType.Float) ?: 2.0f
        }
    }
    private fun config(sender: CommandSender?, action: CustomConfig.() -> Unit) {
        plugin.config(sender, "config.yml", action = action)
    }
}
