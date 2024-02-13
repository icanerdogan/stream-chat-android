package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import io.getstream.chat.android.client.parser2.adapters.RawJson


@JsonClass(generateAdapter = true)
internal data class StreamChatFlagRequest(

    public val reason: String? = null,

    public val target_message_id: String? = null,

    public val user_id: String? = null,

    public val custom: RawJson? = null,

    public val user: StreamChatUserObjectRequest? = null,

) 
