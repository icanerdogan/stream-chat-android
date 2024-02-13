package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatTranscriptionSettings(

    public val closed_caption_mode: String,

    public val mode: String,

) 
