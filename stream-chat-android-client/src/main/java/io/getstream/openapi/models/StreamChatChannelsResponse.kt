package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatChannelsResponse(

    public val duration: String,

    public val channels: List<StreamChatChannelStateResponseFields>,

) 
