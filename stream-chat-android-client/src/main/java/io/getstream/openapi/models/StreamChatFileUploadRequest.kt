package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatFileUploadRequest(

    public val file: String? = null,

    public val user: StreamChatOnlyUserIDRequest? = null,

) 
