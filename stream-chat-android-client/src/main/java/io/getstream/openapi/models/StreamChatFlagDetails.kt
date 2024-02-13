package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import io.getstream.chat.android.client.parser2.adapters.RawJson


@JsonClass(generateAdapter = true)
internal data class StreamChatFlagDetails(

    public val original_text: String,

    public val Extra: RawJson,

    public val automod: StreamChatAutomodDetails? = null,

) 
