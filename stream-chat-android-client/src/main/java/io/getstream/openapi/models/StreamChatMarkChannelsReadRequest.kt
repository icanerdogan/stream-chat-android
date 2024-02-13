package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatMarkChannelsReadRequest(

    public val user_id: String? = null,

    public val user: StreamChatUserObjectRequest? = null,

) 
