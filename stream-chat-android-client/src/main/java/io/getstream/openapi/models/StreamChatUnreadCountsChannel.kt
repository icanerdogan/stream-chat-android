package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatUnreadCountsChannel(

    public val channel_id: String,

    public val last_read: Date,

    public val unread_count: Int,

) 
