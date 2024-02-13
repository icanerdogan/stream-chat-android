package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatActionRequest(

    public val name: String? = null,

    public val style: String? = null,

    public val text: String? = null,

    public val type: String? = null,

    public val value: String? = null,

) 
