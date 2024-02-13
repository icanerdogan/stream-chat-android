package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatDeviceFields(

    public val id: String,

    public val push_provider: String,

    public val push_provider_name: String? = null,

    public val voip: Boolean? = null,

) 
