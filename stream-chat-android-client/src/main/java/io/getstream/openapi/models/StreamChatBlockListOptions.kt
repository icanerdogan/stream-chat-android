package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatBlockListOptions(

    public val behavior: String,

    public val blocklist: String,

) 
