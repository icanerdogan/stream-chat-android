package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatChannelMemberRequest(

    public val ban_expires: Date? = null,

    public val banned: Boolean? = null,

    public val channel_role: String? = null,

    public val created_at: Date? = null,

    public val deleted_at: Date? = null,

    public val invite_accepted_at: Date? = null,

    public val invite_rejected_at: Date? = null,

    public val invited: Boolean? = null,

    public val is_moderator: Boolean? = null,

    public val shadow_banned: Boolean? = null,

    public val status: String? = null,

    public val updated_at: Date? = null,

    public val user_id: String? = null,

    public val user: StreamChatUserObjectRequest? = null,

) 
