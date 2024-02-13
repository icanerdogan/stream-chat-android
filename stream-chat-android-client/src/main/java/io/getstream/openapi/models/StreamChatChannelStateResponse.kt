package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatChannelStateResponse(

    public val duration: String,

    public val members: List<StreamChatChannelMember?>,

    public val messages: List<StreamChatMessage>,

    public val pinned_messages: List<StreamChatMessage>,

    public val hidden: Boolean? = null,

    public val hide_messages_before: Date? = null,

    public val watcher_count: Int? = null,

    public val pending_messages: List<StreamChatPendingMessage?>? = null,

    public val read: List<StreamChatRead?>? = null,

    public val watchers: List<StreamChatUserObject>? = null,

    public val channel: StreamChatChannelResponse? = null,

    public val membership: StreamChatChannelMember? = null,

) 
