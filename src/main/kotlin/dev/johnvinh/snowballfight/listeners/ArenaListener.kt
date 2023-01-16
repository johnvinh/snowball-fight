package dev.johnvinh.snowballfight.listeners

import dev.johnvinh.snowballfight.Cuboid
import dev.johnvinh.snowballfight.SnowballFight
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent

class ArenaListener(private val plugin: SnowballFight) : Listener {
    private val cuboid: Cuboid = Cuboid(
        plugin.configManager.getArenaCorner1(), plugin.configManager.getArenaCorner2()
    )

    @EventHandler
    fun onBlockBreak(e: BlockBreakEvent) {
        if (!(cuboid.isIn(e.block.location))) {
            e.isCancelled = true
        }
    }
}