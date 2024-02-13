package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatGeofenceResponse(

    public val name: String,

    public val description: String? = null,

    public val type: String? = null,

    public val country_codes: List<String>? = null,

) 
