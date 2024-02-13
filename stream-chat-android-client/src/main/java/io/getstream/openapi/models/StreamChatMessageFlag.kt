package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import io.getstream.chat.android.client.parser2.adapters.RawJson

import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatMessageFlag(

    public val created_at: Date,

    public val created_by_automod: Boolean,

    public val updated_at: Date,

    public val approved_at: Date? = null,

    public val reason: String? = null,

    public val rejected_at: Date? = null,

    public val reviewed_at: Date? = null,

    public val custom: RawJson? = null,

    public val details: StreamChatFlagDetails? = null,

    public val message: StreamChatMessage? = null,

    public val moderation_feedback: StreamChatFlagFeedback? = null,

    public val moderation_result: StreamChatMessageModerationResult? = null,

    public val reviewed_by: StreamChatUserObject? = null,

    public val user: StreamChatUserObject? = null,

) 
