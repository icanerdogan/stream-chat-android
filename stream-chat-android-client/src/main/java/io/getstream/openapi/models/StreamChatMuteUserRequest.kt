package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatMuteUserRequest(

    public val target_ids: List<String>,

    public val timeout: Int? = null,

    public val user_id: String? = null,

    public val user: StreamChatUserObjectRequest? = null,

) 
