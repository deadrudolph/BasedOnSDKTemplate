package com.deadrudolph.feature_settings.di.dependencies

import com.deadrudolph.feature_settings.di.component.SettingsComponentInternal
import com.deadrudolph.navigation.Navigator
import com.deadrudolph.navigation.di.component.NavigationComponentHolder

internal class DependenciesImpl : SettingsComponentInternal.Dependencies {

    override val navigation: Navigator
        get() = NavigationComponentHolder.get().navigator()
}
