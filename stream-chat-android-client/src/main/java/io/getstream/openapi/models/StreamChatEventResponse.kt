package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatEventResponse(

    public val duration: String,

    public val event: StreamChatWSEvent,

) 
