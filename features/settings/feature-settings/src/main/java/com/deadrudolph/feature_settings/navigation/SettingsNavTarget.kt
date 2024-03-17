package com.deadrudolph.feature_settings.navigation

import com.deadrudolph.navigation.NavTarget

internal sealed class SettingsNavTarget(
    val route: NavTarget
) {
    data object SettingsFirstFeature : SettingsNavTarget(route = NavTarget("settings_first_feature"))

    companion object {

        val moduleRoute: NavTarget = SettingsGlobalNavTarget()
    }
}
