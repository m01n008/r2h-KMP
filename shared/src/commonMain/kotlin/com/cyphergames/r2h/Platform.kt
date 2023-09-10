package com.cyphergames.r2h

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform