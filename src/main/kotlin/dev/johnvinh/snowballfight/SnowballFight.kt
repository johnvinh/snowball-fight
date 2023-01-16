package dev.johnvinh.snowballfight

import dev.johnvinh.snowballfight.listeners.ArenaListener
import org.bukkit.plugin.java.JavaPlugin

class SnowballFight : JavaPlugin() {
    val configManager: ConfigManager = ConfigManager(this)

    override fun onEnable() {
        // Plugin startup logic
        server.pluginManager.registerEvents(ArenaListener(this), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}