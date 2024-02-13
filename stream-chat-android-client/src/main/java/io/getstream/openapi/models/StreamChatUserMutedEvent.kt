package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatUserMutedEvent(

    public val created_at: Date,

    public val type: String,

    public val target_user: String? = null,

    public val target_users: List<String>? = null,

    public val user: StreamChatUserObject? = null,

) : StreamChatWSEvent()
