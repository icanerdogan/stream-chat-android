package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import io.getstream.chat.android.client.parser2.adapters.RawJson


@JsonClass(generateAdapter = true)
internal data class StreamChatReactionRequest(

    public val type: String,

    public val message_id: String? = null,

    public val score: Int? = null,

    public val user_id: String? = null,

    public val custom: RawJson? = null,

    public val user: StreamChatUserObjectRequest? = null,

) 
