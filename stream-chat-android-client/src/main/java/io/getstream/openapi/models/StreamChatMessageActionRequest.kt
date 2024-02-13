package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatMessageActionRequest(

    public val form_data: Map<String, String>,

    public val ID: String? = null,

    public val user_id: String? = null,

    public val user: StreamChatUserObjectRequest? = null,

) 
