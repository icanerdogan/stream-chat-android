package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatTargetResolution(

    public val bitrate: Int,

    public val height: Int,

    public val width: Int,

) 
