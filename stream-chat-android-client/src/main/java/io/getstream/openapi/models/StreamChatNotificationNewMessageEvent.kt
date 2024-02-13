package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatNotificationNewMessageEvent(

    public val channel_id: String,

    public val channel_type: String,

    public val cid: String,

    public val created_at: Date,

    public val type: String,

    public val message: StreamChatMessage,

    public val team: String? = null,

    public val channel: StreamChatChannelResponse? = null,

) : StreamChatWSEvent()
