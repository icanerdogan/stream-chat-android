package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatSendReactionRequest(

    public val reaction: StreamChatReactionRequest,

    public val enforce_unique: Boolean? = null,

    public val ID: String? = null,

    public val skip_push: Boolean? = null,

) 
