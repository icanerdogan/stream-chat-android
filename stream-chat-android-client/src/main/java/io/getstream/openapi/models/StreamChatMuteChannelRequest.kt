package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatMuteChannelRequest(

    public val channel_cids: List<String>,

    public val expiration: Int? = null,

    public val user_id: String? = null,

    public val user: StreamChatUserObjectRequest? = null,

) 
