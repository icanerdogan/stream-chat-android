package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatChannelConfigWithInfo(

    public val automod: String,

    public val automod_behavior: String,

    public val connect_events: Boolean,

    public val created_at: Date,

    public val custom_events: Boolean,

    public val mark_messages_pending: Boolean,

    public val max_message_length: Int,

    public val message_retention: String,

    public val mutes: Boolean,

    public val name: String,

    public val push_notifications: Boolean,

    public val quotes: Boolean,

    public val reactions: Boolean,

    public val read_events: Boolean,

    public val reminders: Boolean,

    public val replies: Boolean,

    public val search: Boolean,

    public val typing_events: Boolean,

    public val updated_at: Date,

    public val uploads: Boolean,

    public val url_enrichment: Boolean,

    public val commands: List<StreamChatCommand?>,

    public val blocklist: String? = null,

    public val blocklist_behavior: String? = null,

    public val allowed_flag_reasons: List<String>? = null,

    public val blocklists: List<StreamChatBlockListOptions>? = null,

    public val automod_thresholds: StreamChatThresholds? = null,

    public val grants: Map<String, List<String>>? = null,

) 
