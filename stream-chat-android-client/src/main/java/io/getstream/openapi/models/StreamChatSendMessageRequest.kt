package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatSendMessageRequest(

    public val message: StreamChatMessageRequest,

    public val skip_enrich_url: Boolean? = null,

    public val skip_push: Boolean? = null,

) 
