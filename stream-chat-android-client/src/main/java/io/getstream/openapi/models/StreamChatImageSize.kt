package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatImageSize(

    public val crop: String,

    public val height: Int,

    public val resize: String,

    public val width: Int,

) 
