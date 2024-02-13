package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatRead(

    public val last_read: Date,

    public val unread_messages: Int,

    public val last_read_message_id: String? = null,

    public val user: StreamChatUserObject? = null,

) 
