package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatSendEventRequest(

    public val event: StreamChatEventRequest,

) 
