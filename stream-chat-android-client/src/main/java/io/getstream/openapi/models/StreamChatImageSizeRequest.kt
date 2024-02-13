package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatImageSizeRequest(

    public val crop: String? = null,

    public val height: Int? = null,

    public val resize: String? = null,

    public val width: Int? = null,

) 
