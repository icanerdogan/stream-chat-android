package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatDeleteChannelsResponse(

    public val duration: String,

    public val task_id: String? = null,

    public val result: Map<String, StreamChatDeleteChannelsResult?>? = null,

) 
