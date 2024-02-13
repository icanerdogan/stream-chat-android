package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatDeleteChannelResponse(

    public val duration: String,

    public val channel: StreamChatChannelResponse? = null,

) 
