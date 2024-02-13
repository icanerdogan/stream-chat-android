package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatGetReactionsResponse(

    public val duration: String,

    public val reactions: List<StreamChatReaction?>,

) 
