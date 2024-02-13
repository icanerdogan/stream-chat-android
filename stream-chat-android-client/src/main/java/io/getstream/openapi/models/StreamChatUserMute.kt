package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatUserMute(

    public val created_at: Date,

    public val updated_at: Date,

    public val expires: Date? = null,

    public val target: StreamChatUserObject? = null,

    public val user: StreamChatUserObject? = null,

) 
