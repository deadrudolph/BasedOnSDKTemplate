package com.deadrudolph.feature_settings.initializer

import android.content.Context
import androidx.startup.Initializer
import com.deadrudolph.feature_settings.navigation.SettingsGlobalNavTarget
import com.deadrudolph.feature_settings.navigation.SettingsGlobalNavTarget.Companion.SETTINGS_NAV_TARGET_KEY
import com.deadrudolph.navigation.manager.NavigationManager

class SettingsInitializer : Initializer<Unit> {

    override fun create(context: Context) {
        NavigationManager.registerNavTarget(
            key = SETTINGS_NAV_TARGET_KEY,
            destination = SettingsGlobalNavTarget()
        )
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf()
    }
}
