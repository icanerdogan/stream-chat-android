package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import io.getstream.chat.android.client.parser2.adapters.RawJson


@JsonClass(generateAdapter = true)
internal data class StreamChatQueryUsersRequest(

    public val filter_conditions: RawJson,

    public val connection_id: String? = null,

    public val id_gt: String? = null,

    public val id_gte: String? = null,

    public val id_lt: String? = null,

    public val id_lte: String? = null,

    public val limit: Int? = null,

    public val offset: Int? = null,

    public val presence: Boolean? = null,

    public val user_id: String? = null,

    public val sort: List<StreamChatSortParam?>? = null,

    public val user: StreamChatUserObject? = null,

) 
