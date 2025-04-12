package org.shu.peanutim

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform