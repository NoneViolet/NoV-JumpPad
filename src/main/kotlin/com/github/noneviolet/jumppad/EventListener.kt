package com.github.noneviolet.jumppad

import com.github.noneviolet.jumppad.Main.Companion.plugin
import com.github.syari.spigot.api.event.events
import com.github.syari.spigot.api.sound.playSound
import org.bukkit.Sound
import org.bukkit.SoundCategory
import org.bukkit.event.player.PlayerMoveEvent

object EventListener {
    fun register() {
        plugin.events {
            event<PlayerMoveEvent> {
                val player = it.player
                val pad = player.location.block.type
                val core = player.location.subtract(0.0, 1.0, 0.0).block.type
                if (pad == ConfigLoader.blockPad && core == ConfigLoader.blockCore) {
                    player.velocity = player.velocity.multiply(2).setY(ConfigLoader.jumpHeight)
                    player.playSound(Sound.ENTITY_ENDER_DRAGON_FLAP, SoundCategory.MASTER, 1.0F, 1.0F)
                }
            }
        }
    }
}
