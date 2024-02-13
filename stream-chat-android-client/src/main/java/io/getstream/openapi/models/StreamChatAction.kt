package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatAction(

    public val name: String,

    public val text: String,

    public val type: String,

    public val style: String? = null,

    public val value: String? = null,

) 
