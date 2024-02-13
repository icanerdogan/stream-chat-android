package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatBanRequest(

    public val target_user_id: String,

    public val banned_by_id: String? = null,

    public val id: String? = null,

    public val ip_ban: Boolean? = null,

    public val reason: String? = null,

    public val shadow: Boolean? = null,

    public val timeout: Int? = null,

    public val type: String? = null,

    public val banned_by: StreamChatUserRequest? = null,

) 
