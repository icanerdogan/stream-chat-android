package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatTypingStartEvent(

    public val channel_id: String,

    public val channel_type: String,

    public val cid: String,

    public val created_at: Date,

    public val type: String,

    public val parent_id: String? = null,

    public val user: StreamChatUserObject? = null,

) : StreamChatWSEvent()
