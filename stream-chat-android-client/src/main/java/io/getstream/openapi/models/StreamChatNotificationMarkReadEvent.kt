package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatNotificationMarkReadEvent(

    public val channel_id: String,

    public val channel_type: String,

    public val cid: String,

    public val created_at: Date,

    public val total_unread_count: Int,

    public val type: String,

    public val unread_channels: Int,

    public val unread_count: Int,

    public val team: String? = null,

    public val channel: StreamChatChannelResponse? = null,

    public val user: StreamChatUserObject? = null,

) : StreamChatWSEvent()
