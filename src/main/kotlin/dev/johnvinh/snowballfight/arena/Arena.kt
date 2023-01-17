package dev.johnvinh.snowballfight.arena

import java.util.UUID

class Arena(val id: Int) {
    val players: MutableList<UUID> = mutableListOf()
}