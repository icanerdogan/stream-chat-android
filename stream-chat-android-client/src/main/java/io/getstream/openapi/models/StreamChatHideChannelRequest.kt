package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatHideChannelRequest(

    public val clear_history: Boolean? = null,

    public val user_id: String? = null,

    public val user: StreamChatUserObjectRequest? = null,

) 
