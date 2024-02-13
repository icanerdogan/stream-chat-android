package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatAutomodDetails(

    public val action: String? = null,

    public val original_message_type: String? = null,

    public val image_labels: List<String>? = null,

    public val message_details: StreamChatFlagMessageDetails? = null,

    public val result: StreamChatMessageModerationResult? = null,

) 
