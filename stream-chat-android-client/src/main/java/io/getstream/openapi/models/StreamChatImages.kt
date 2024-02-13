package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatImages(

    public val fixed_height: StreamChatImageData,

    public val fixed_height_downsampled: StreamChatImageData,

    public val fixed_height_still: StreamChatImageData,

    public val fixed_width: StreamChatImageData,

    public val fixed_width_downsampled: StreamChatImageData,

    public val fixed_width_still: StreamChatImageData,

    public val original: StreamChatImageData,

) 
