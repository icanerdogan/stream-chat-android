package io.getstream.chat.android.client.parser2.adapters

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal class RawJson constructor() : MutableMap<String, Any> by mutableMapOf() {
    constructor(items: Map<String, Any>?) : this() {
        if (items != null) {
            putAll(items)

        }
    }
}

internal fun Map<String, Any>.toRawJson() =
    RawJson(this)