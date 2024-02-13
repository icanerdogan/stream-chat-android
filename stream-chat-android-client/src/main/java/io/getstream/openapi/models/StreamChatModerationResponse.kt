package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatModerationResponse(

    public val action: String,

    public val explicit: Double,

    public val spam: Double,

    public val toxic: Double,

) 
