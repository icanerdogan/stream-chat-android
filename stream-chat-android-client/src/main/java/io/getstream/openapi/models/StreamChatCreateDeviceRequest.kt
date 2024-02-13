package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatCreateDeviceRequest(

    public val id: String? = null,

    public val push_provider: String? = null,

    public val push_provider_name: String? = null,

    public val voip_token: Boolean? = null,

) 
