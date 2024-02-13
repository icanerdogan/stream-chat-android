package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatBanResponse(

    public val created_at: Date,

    public val expires: Date? = null,

    public val reason: String? = null,

    public val shadow: Boolean? = null,

    public val banned_by: StreamChatUserObject? = null,

    public val channel: StreamChatChannelResponse? = null,

    public val user: StreamChatUserObject? = null,

) 
