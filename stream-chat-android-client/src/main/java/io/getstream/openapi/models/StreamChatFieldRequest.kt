package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatFieldRequest(

    public val short: Boolean? = null,

    public val title: String? = null,

    public val value: String? = null,

) 
