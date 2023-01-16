package dev.johnvinh.snowballfight.listeners

import dev.johnvinh.snowballfight.Cuboid
import dev.johnvinh.snowballfight.SnowballFight
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.event.block.BlockPlaceEvent

class ArenaListener(private val plugin: SnowballFight) : Listener {
    private val cuboid: Cuboid = Cuboid(
        plugin.configManager.getArenaCorner1(), plugin.configManager.getArenaCorner2()
    )

    @EventHandler
    fun onBlockBreak(e: BlockBreakEvent) {
        // Don't allow players to break the arena walls or floor
        if (!(cuboid.isIn(e.block.location))) {
            e.isCancelled = true
        }
    }

    @EventHandler
    fun onBlockPlace(e: BlockPlaceEvent) {
        // Don't allow players to place blocks outside the arena
        if (!(cuboid.isIn(e.block.location))) {
            e.isCancelled = true
        }
    }
}