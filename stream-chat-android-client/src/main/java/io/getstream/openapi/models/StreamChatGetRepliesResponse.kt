package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatGetRepliesResponse(

    public val duration: String,

    public val messages: List<StreamChatMessage>,

) 
