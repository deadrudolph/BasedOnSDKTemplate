package com.deadrudolph.feature_settings.presentation.ui.screen.settings

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.deadrudolph.uicomponents.compose.theme.CustomTheme

@Composable
internal fun SettingsScreen(
    settingsViewModel: SettingsViewModel
) {
    val settings = settingsViewModel.settingsFlow.collectAsState()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(settings.value) { value ->
            Text(
                modifier = Modifier
                    .padding(2.dp)
                    .clickable { settingsViewModel.onSettingClick(value.id) }
                    .padding(8.dp),
                text = value.name,
                style = CustomTheme.typography.body3.copy(fontSize = 20.sp)
            )
        }
    }
}
