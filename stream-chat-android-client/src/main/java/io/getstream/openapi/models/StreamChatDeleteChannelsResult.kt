package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatDeleteChannelsResult(

    public val status: String,

    public val error: String? = null,

) 
