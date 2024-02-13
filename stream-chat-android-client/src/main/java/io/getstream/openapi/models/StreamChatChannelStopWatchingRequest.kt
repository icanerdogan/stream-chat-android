package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatChannelStopWatchingRequest(

    public val connection_id: String? = null,

) 
