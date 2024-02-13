package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatUnreadCountsResponse(

    public val duration: String,

    public val total_unread_count: Int,

    public val channel_type: List<StreamChatUnreadCountsChannelType>,

    public val channels: List<StreamChatUnreadCountsChannel>,

) 
