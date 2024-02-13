package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatMuteChannelResponse(

    public val duration: String,

    public val channel_mutes: List<StreamChatChannelMute?>? = null,

    public val channel_mute: StreamChatChannelMute? = null,

    public val own_user: StreamChatOwnUser? = null,

) 
