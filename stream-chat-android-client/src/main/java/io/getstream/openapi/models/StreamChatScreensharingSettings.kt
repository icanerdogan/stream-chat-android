package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatScreensharingSettings(

    public val access_request_enabled: Boolean,

    public val enabled: Boolean,

) 
