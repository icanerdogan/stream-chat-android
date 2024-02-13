package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatMarkReadResponse(

    public val duration: String,

    public val event: StreamChatMessageReadEvent? = null,

) 
