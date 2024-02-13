package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import io.getstream.chat.android.client.parser2.adapters.RawJson


@JsonClass(generateAdapter = true)
internal data class StreamChatSearchRequest(

    public val filter_conditions: RawJson,

    public val limit: Int? = null,

    public val next: String? = null,

    public val offset: Int? = null,

    public val query: String? = null,

    public val sort: List<StreamChatSortParam?>? = null,

    public val message_filter_conditions: RawJson? = null,

) 
