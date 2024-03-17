package com.deadrudolph.feature_settings.di.component

import com.deadrudolph.commondi.component.base.BaseComponent
import com.deadrudolph.commondi.holder.FeatureComponentHolder
import com.deadrudolph.commondi.module.CommonDiModule
import com.deadrudolph.commondi.util.DaggerViewModelProvider
import com.deadrudolph.feature_settings.di.component.SettingsComponentInternal.Dependencies
import com.deadrudolph.feature_settings.di.dependencies.DependenciesImpl
import com.deadrudolph.feature_settings.di.module.ViewModelModule
import com.deadrudolph.navigation.Navigator
import dagger.Component

interface SettingsComponent : BaseComponent, DaggerViewModelProvider

@Component(
    modules = [
        CommonDiModule::class,
        ViewModelModule::class
    ],

    dependencies = [
        Dependencies::class,
    ]
)
internal interface SettingsComponentInternal :
    SettingsComponent {

    interface Dependencies {
        val navigation: Navigator
    }

    @Component.Factory
    interface Factory {
        fun create(
            dependencies: Dependencies
        ): SettingsComponentInternal
    }
}

object SettingsComponentHolder : FeatureComponentHolder<SettingsComponent>() {

    override fun build(): SettingsComponent {
        return DaggerSettingsComponentInternal.factory().create(
            DependenciesImpl(),
        )
    }

    internal fun getInternal(): SettingsComponentInternal = get() as SettingsComponentInternal
}
