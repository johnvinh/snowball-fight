package dev.johnvinh.snowballfight

import org.bukkit.plugin.java.JavaPlugin

class SnowballFight : JavaPlugin() {
    val configManager: ConfigManager = ConfigManager(this)

    override fun onEnable() {
        // Plugin startup logic
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}