package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatUpdateMessageRequest(

    public val message: StreamChatMessageRequest,

    public val skip_enrich_url: Boolean? = null,

) 
