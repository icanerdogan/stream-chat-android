package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatMarkReadRequest(

    public val message_id: String? = null,

    public val user_id: String? = null,

    public val user: StreamChatUserObjectRequest? = null,

) 
