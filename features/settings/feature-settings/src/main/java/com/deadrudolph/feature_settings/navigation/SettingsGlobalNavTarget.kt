package com.deadrudolph.feature_settings.navigation

import com.deadrudolph.navigation.NavTarget

class SettingsGlobalNavTarget : NavTarget(SETTINGS_NAV_TARGET) {

    companion object {
        const val SETTINGS_NAV_TARGET_KEY = "SETTINGS"
        private const val SETTINGS_NAV_TARGET = "settings_module"
    }
}
