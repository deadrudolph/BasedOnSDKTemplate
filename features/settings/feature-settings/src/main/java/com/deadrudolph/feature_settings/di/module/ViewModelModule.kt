package com.deadrudolph.feature_settings.di.module

import androidx.lifecycle.ViewModel
import com.deadrudolph.commondi.util.ViewModelKey
import com.deadrudolph.feature_settings.presentation.ui.screen.settings.SettingsViewModel
import com.deadrudolph.feature_settings.presentation.ui.screen.settings.SettingsViewModelImpl
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
internal interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(SettingsViewModel::class)
    fun bindSettingsViewModel(viewModel: SettingsViewModelImpl): ViewModel
}
