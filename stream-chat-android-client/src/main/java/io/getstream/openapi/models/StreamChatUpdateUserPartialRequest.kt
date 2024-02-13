package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import io.getstream.chat.android.client.parser2.adapters.RawJson


@JsonClass(generateAdapter = true)
internal data class StreamChatUpdateUserPartialRequest(

    public val id: String,

    public val unset: List<String>,

    public val set: RawJson,

) 
