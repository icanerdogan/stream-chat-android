package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatUserDeletedEvent(

    public val created_at: Date,

    public val delete_conversation_channels: Boolean,

    public val hard_delete: Boolean,

    public val mark_messages_deleted: Boolean,

    public val type: String,

    public val user: StreamChatUserObject? = null,

) : StreamChatWSEvent()
