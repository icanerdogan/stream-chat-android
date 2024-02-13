package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatFlagResponse(

    public val duration: String,

    public val flag: StreamChatFlag? = null,

) 
