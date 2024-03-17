package com.deadrudolph.template_based_on_sdk.di.component.main

import com.deadrudolph.template_based_on_sdk.presentation.ui.activity.MainActivity

internal interface AppActivityComponent {

    fun inject(activity: MainActivity)
}
