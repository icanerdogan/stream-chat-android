package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatHLSSettings(

    public val auto_on: Boolean,

    public val enabled: Boolean,

    public val quality_tracks: List<String>,

    public val layout: StreamChatLayoutSettings? = null,

) 
