package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatUpdateChannelResponse(

    public val duration: String,

    public val members: List<StreamChatChannelMember?>,

    public val channel: StreamChatChannelResponse? = null,

    public val message: StreamChatMessage? = null,

) 
