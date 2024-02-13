package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import io.getstream.chat.android.client.parser2.adapters.RawJson


@JsonClass(generateAdapter = true)
internal data class StreamChatUpdateMessagePartialRequest(

    public val unset: List<String>,

    public val set: RawJson,

    public val skip_enrich_url: Boolean? = null,

) 
