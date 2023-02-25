@file:JvmName("Lwjgl3Launcher")

package com.github.xpenatan.kotlin.lwjgl3

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
import com.github.xpenatan.kotlin.MainClass

/** Launches the desktop (LWJGL3) application. */
fun main() {
    Lwjgl3Application(MainClass(), Lwjgl3ApplicationConfiguration().apply {
        setTitle("kotlinExample")
        setWindowedMode(640, 480)
        setWindowIcon(*(arrayOf(128, 64, 32, 16).map { "libgdx$it.png" }.toTypedArray()))
    })
}
