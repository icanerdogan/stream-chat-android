package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import io.getstream.chat.android.client.parser2.adapters.RawJson


@JsonClass(generateAdapter = true)
internal data class StreamChatUserRequest(

    public val id: String,

    public val image: String? = null,

    public val language: String? = null,

    public val name: String? = null,

    public val custom: RawJson? = null,

) 
