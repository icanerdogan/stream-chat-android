package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatImageData(

    public val frames: String,

    public val height: String,

    public val size: String,

    public val url: String,

    public val width: String,

) 
