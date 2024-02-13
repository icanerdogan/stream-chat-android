package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import io.getstream.chat.android.client.parser2.adapters.RawJson


@JsonClass(generateAdapter = true)
internal data class StreamChatQueryMessageFlagsRequest(

    public val limit: Int? = null,

    public val offset: Int? = null,

    public val show_deleted_messages: Boolean? = null,

    public val user_id: String? = null,

    public val sort: List<StreamChatSortParam?>? = null,

    public val filter_conditions: RawJson? = null,

    public val user: StreamChatUserObject? = null,

) 
