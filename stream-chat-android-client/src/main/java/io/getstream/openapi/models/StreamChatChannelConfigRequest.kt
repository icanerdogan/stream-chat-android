package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatChannelConfigRequest(

    public val blocklist: String? = null,

    public val blocklist_behavior: String? = null,

    public val max_message_length: Int? = null,

    public val quotes: Boolean? = null,

    public val reactions: Boolean? = null,

    public val replies: Boolean? = null,

    public val typing_events: Boolean? = null,

    public val uploads: Boolean? = null,

    public val url_enrichment: Boolean? = null,

    public val commands: List<String>? = null,

    public val grants: Map<String, List<String>>? = null,

) 
