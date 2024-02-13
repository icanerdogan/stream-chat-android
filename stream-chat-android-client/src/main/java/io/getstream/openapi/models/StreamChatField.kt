package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatField(

    public val short: Boolean,

    public val title: String,

    public val value: String,

) 
