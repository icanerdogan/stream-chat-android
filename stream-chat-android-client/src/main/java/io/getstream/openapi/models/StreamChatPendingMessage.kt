package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatPendingMessage(

    public val channel: StreamChatChannel? = null,

    public val message: StreamChatMessage? = null,

    public val metadata: Map<String, String>? = null,

    public val user: StreamChatUserObject? = null,

) 
