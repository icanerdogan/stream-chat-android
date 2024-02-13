package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import io.getstream.chat.android.client.parser2.adapters.RawJson

import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatFlag(

    public val created_at: Date,

    public val created_by_automod: Boolean,

    public val updated_at: Date,

    public val approved_at: Date? = null,

    public val reason: String? = null,

    public val rejected_at: Date? = null,

    public val reviewed_at: Date? = null,

    public val target_message_id: String? = null,

    public val custom: RawJson? = null,

    public val details: StreamChatFlagDetails? = null,

    public val target_message: StreamChatMessage? = null,

    public val target_user: StreamChatUserObject? = null,

    public val user: StreamChatUserObject? = null,

) 
