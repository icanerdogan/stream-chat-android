package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatFlagMessageDetails(

    public val pin_changed: Boolean? = null,

    public val should_enrich: Boolean? = null,

    public val skip_push: Boolean? = null,

    public val updated_by_id: String? = null,

) 
