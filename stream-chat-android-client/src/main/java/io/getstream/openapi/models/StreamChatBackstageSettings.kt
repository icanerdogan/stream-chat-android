package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatBackstageSettings(

    public val enabled: Boolean,

) 
