package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatHealthCheckEvent(

    public val cid: String,

    public val connection_id: String,

    public val created_at: Date,

    public val type: String,

    public val me: StreamChatOwnUser? = null,

) : StreamChatWSEvent()
