package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatChannelMember(

    public val banned: Boolean,

    public val channel_role: String,

    public val created_at: Date,

    public val shadow_banned: Boolean,

    public val updated_at: Date,

    public val ban_expires: Date? = null,

    public val deleted_at: Date? = null,

    public val invite_accepted_at: Date? = null,

    public val invite_rejected_at: Date? = null,

    public val invited: Boolean? = null,

    public val is_moderator: Boolean? = null,

    public val status: String? = null,

    public val user_id: String? = null,

    public val user: StreamChatUserObject? = null,

) 
