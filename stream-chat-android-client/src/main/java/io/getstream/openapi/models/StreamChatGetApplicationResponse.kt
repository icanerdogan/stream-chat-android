package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatGetApplicationResponse(

    public val duration: String,

    public val app: StreamChatApp,

) 
