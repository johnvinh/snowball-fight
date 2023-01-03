package dev.johnvinh.snowballfight

import org.bukkit.Location
import org.bukkit.configuration.file.FileConfiguration

class ConfigManager(private val snowballFight: SnowballFight) {
    private val config: FileConfiguration = snowballFight.config

    fun getArenaCorner1(): Location {
        return Location(
            config.getString("arena.world")?.let { snowballFight.server.getWorld(it) },
            config.getDouble("arena.corner-1.x"),
            config.getDouble("arena.corner-1.y"),
            config.getDouble("arena.corner-1.z")
        )
    }

    fun getArenaCorner2(): Location {
        return Location(
            config.getString("arena.world")?.let { snowballFight.server.getWorld(it) },
            config.getDouble("arena.corner-2.x"),
            config.getDouble("arena.corner-2.y"),
            config.getDouble("arena.corner-2.z")
        )
    }
}