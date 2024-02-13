package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatSendMessageResponse(

    public val duration: String,

    public val message: StreamChatMessage,

    public val pending_message_metadata: Map<String, String>? = null,

) 
