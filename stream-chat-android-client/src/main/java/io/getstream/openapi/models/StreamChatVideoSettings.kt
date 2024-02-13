package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatVideoSettings(

    public val access_request_enabled: Boolean,

    public val camera_default_on: Boolean,

    public val camera_facing: String,

    public val enabled: Boolean,

    public val target_resolution: StreamChatTargetResolution,

) 
