package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import io.getstream.chat.android.client.parser2.adapters.RawJson


@JsonClass(generateAdapter = true)
internal data class StreamChatEventRequest(

    public val type: String,

    public val parent_id: String? = null,

    public val custom: RawJson? = null,

) 
