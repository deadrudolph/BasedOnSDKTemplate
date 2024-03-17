package com.deadrudolph.feature_settings.presentation.ui.screen.settings

import com.example.feature_settings_domain.model.SettingsModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

internal class SettingsViewModelImpl @Inject constructor() : SettingsViewModel() {

    override val settingsFlow: StateFlow<List<SettingsModel>> = MutableStateFlow(
        getDefaultSettingsModel()
    )

    override fun onSettingClick(id: String) {
        // TODO add some logic
    }

    private fun getDefaultSettingsModel() = listOf(
        SettingsModel(
            "1",
            "Mock setting 1"
        ),
        SettingsModel(
            "2",
            "Mock setting 2"
        ),
        SettingsModel(
            "3",
            "Mock setting 3"
        ),
        SettingsModel(
            "4",
            "Mock setting 4"
        ),
        SettingsModel(
            "5",
            "Mock setting 5"
        )
    )
}
