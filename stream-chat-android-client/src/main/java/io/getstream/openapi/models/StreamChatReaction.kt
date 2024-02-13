package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import io.getstream.chat.android.client.parser2.adapters.RawJson

import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatReaction(

    public val created_at: Date,

    public val message_id: String,

    public val score: Int,

    public val type: String,

    public val updated_at: Date,

    public val custom: RawJson,

    public val user_id: String? = null,

    public val user: StreamChatUserObject? = null,

) 
