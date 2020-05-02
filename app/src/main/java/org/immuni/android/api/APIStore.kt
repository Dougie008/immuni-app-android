package org.immuni.android.api

import org.immuni.android.api.model.ImmuniSettings
import org.immuni.android.extensions.storage.KVStorage

/**
 * Stores and loads the settings.
 */
class APIStore(
    private val kvStorage: KVStorage
) {
    companion object {
        const val SETTINGS_KEY = "Settings"
    }

    fun saveSettings(settings: ImmuniSettings) {
        kvStorage.save(SETTINGS_KEY, settings)
    }

    fun loadSettings(): ImmuniSettings? {
        return kvStorage.load(SETTINGS_KEY)
    }
}