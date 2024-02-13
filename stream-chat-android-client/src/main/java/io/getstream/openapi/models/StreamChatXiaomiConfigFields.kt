package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatXiaomiConfigFields(

    public val enabled: Boolean,

    public val package_name: String? = null,

    public val secret: String? = null,

) 
