package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatHuaweiConfigFields(

    public val enabled: Boolean,

    public val id: String? = null,

    public val secret: String? = null,

) 
