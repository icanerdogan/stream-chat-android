package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatFileUploadResponse(

    public val duration: String,

    public val file: String? = null,

    public val thumb_url: String? = null,

) 
