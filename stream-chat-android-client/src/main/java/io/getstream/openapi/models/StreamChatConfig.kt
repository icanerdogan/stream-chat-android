package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatConfig(

    public val app_certificate: String,

    public val app_id: String,

    public val default_role: String? = null,

    public val role_map: Map<String, String>? = null,

) 
