package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatMessageModerationResult(

    public val action: String,

    public val created_at: Date,

    public val message_id: String,

    public val updated_at: Date,

    public val user_bad_karma: Boolean,

    public val user_karma: Double,

    public val blocked_word: String? = null,

    public val blocklist_name: String? = null,

    public val moderated_by: String? = null,

    public val ai_moderation_response: StreamChatModerationResponse? = null,

    public val moderation_thresholds: StreamChatThresholds? = null,

) 
