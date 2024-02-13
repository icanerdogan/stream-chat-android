package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatImagesRequest(

    public val fixed_height: StreamChatImageDataRequest? = null,

    public val fixed_height_downsampled: StreamChatImageDataRequest? = null,

    public val fixed_height_still: StreamChatImageDataRequest? = null,

    public val fixed_width: StreamChatImageDataRequest? = null,

    public val fixed_width_downsampled: StreamChatImageDataRequest? = null,

    public val fixed_width_still: StreamChatImageDataRequest? = null,

    public val original: StreamChatImageDataRequest? = null,

) 
