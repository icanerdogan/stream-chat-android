package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatMessageResponse(

    public val duration: String,

    public val message: StreamChatMessage? = null,

) 
