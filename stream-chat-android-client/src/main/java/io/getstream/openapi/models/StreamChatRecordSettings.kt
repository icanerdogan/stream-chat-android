package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatRecordSettings(

    public val audio_only: Boolean,

    public val mode: String,

    public val quality: String,

    public val layout: StreamChatLayoutSettings? = null,

) 
