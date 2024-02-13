package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatRingSettings(

    public val auto_cancel_timeout_ms: Int,

    public val incoming_call_timeout_ms: Int,

) 
