package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatQueryMessageFlagsResponse(

    public val duration: String,

    public val flags: List<StreamChatMessageFlag?>,

) 
