package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatAPNS(

    public val body: String,

    public val title: String,

) 
