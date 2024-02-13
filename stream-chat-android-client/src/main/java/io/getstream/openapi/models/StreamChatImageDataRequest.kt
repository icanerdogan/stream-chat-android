package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatImageDataRequest(

    public val frames: String? = null,

    public val height: String? = null,

    public val size: String? = null,

    public val url: String? = null,

    public val width: String? = null,

) 
