package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatUserDeactivatedEvent(

    public val created_at: Date,

    public val type: String,

    public val created_by: StreamChatUserObject,

    public val user: StreamChatUserObject? = null,

) : StreamChatWSEvent()
