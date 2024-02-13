package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatAPIError(

    public val code: Int,

    public val duration: String,

    public val message: String,

    public val more_info: String,

    public val StatusCode: Int,

    public val details: List<Int>,

    public val exception_fields: Map<String, String>? = null,

) 
