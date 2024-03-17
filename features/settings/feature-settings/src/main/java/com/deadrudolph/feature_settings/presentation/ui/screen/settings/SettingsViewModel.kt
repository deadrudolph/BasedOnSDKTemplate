package com.deadrudolph.feature_settings.presentation.ui.screen.settings

import com.deadrudolph.core.base.BaseViewModel
import com.example.feature_settings_domain.model.SettingsModel
import kotlinx.coroutines.flow.StateFlow

internal abstract class SettingsViewModel : BaseViewModel() {

    abstract val settingsFlow: StateFlow<List<SettingsModel>>

    abstract fun onSettingClick(id: String)
}
