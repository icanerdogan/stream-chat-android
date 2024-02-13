package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatNotificationMarkUnreadEvent(

    public val channel_id: String,

    public val channel_type: String,

    public val cid: String,

    public val created_at: Date,

    public val first_unread_message_id: String,

    public val last_read_at: Date,

    public val total_unread_count: Int,

    public val type: String,

    public val unread_channels: Int,

    public val unread_count: Int,

    public val unread_messages: Int,

    public val last_read_message_id: String? = null,

    public val team: String? = null,

    public val channel: StreamChatChannelResponse? = null,

    public val user: StreamChatUserObject? = null,

) : StreamChatWSEvent()
