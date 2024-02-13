package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatImageUploadRequest(

    public val file: String? = null,

    public val upload_sizes: List<StreamChatImageSizeRequest>? = null,

    public val user: StreamChatOnlyUserIDRequest? = null,

) 
