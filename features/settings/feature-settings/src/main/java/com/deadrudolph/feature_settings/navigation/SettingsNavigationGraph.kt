package com.deadrudolph.feature_settings.navigation

import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.deadrudolph.feature_settings.di.component.SettingsComponentHolder
import com.deadrudolph.feature_settings.navigation.SettingsNavTarget.SettingsFirstFeature
import com.deadrudolph.feature_settings.presentation.ui.screen.settings.SettingsScreen

@Suppress("UnusedParameter")
fun NavGraphBuilder.addSettingsFeatureGraph(popBackStack: () -> Unit) {
    navigation(
        startDestination = SettingsFirstFeature.route.route,
        route = SettingsNavTarget.moduleRoute.route,
    ) {
        composable(SettingsFirstFeature.route.route) {
            val factory = SettingsComponentHolder.getInternal().provideVF()
            SettingsScreen(
                settingsViewModel = viewModel(factory = factory)
            )
        }
    }
}
