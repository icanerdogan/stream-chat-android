package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatAudioSettings(

    public val access_request_enabled: Boolean,

    public val default_device: String,

    public val mic_default_on: Boolean,

    public val opus_dtx_enabled: Boolean,

    public val redundant_coding_enabled: Boolean,

    public val speaker_default_on: Boolean,

) 
