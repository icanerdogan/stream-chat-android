package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatThresholds(

    public val explicit: StreamChatLabelThresholds? = null,

    public val spam: StreamChatLabelThresholds? = null,

    public val toxic: StreamChatLabelThresholds? = null,

) 
