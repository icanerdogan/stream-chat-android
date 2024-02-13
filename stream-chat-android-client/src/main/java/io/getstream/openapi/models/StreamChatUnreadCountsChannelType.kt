package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatUnreadCountsChannelType(

    public val channel_count: Int,

    public val channel_type: String,

    public val unread_count: Int,

) 
