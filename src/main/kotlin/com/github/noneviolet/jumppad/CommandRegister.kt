package com.github.noneviolet.jumppad

import com.github.noneviolet.jumppad.Main.Companion.plugin
import com.github.syari.spigot.api.command.command
import com.github.syari.spigot.api.command.tab.CommandTabArgument.Companion.argument
import com.github.syari.spigot.api.string.toColor

object CommandRegister {
    fun register() {
        plugin.command("JumpPad") {
            aliases = listOf("jumppad", "jp")
            tab {
                argument {
                    tab { addAll("reload") }
                }
            }
            execute {
                when (args.lowerOrNull(0)) {
                    "reload" -> {
                        ConfigLoader.load(sender)
                        sender.sendMessage("&5[NoV's JumpPad] &rプラグインをリロードしました".toColor())
                    }
                }
            }
        }
    }
}
