package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatLabelThresholds(

    public val block: Double? = null,

    public val flag: Double? = null,

) 
