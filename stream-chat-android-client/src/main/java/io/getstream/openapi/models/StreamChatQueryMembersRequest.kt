package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import io.getstream.chat.android.client.parser2.adapters.RawJson

import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatQueryMembersRequest(

    public val type: String,

    public val filter_conditions: RawJson,

    public val created_at_after: Date? = null,

    public val created_at_after_or_equal: Date? = null,

    public val created_at_before: Date? = null,

    public val created_at_before_or_equal: Date? = null,

    public val id: String? = null,

    public val limit: Int? = null,

    public val offset: Int? = null,

    public val user_id: String? = null,

    public val user_id_gt: String? = null,

    public val user_id_gte: String? = null,

    public val user_id_lt: String? = null,

    public val user_id_lte: String? = null,

    public val members: List<StreamChatChannelMember?>? = null,

    public val sort: List<StreamChatSortParam?>? = null,

    public val user: StreamChatUserObject? = null,

) 
