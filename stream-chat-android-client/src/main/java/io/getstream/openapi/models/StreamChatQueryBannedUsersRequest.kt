package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import io.getstream.chat.android.client.parser2.adapters.RawJson

import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatQueryBannedUsersRequest(

    public val filter_conditions: RawJson,

    public val created_at_after: Date? = null,

    public val created_at_after_or_equal: Date? = null,

    public val created_at_before: Date? = null,

    public val created_at_before_or_equal: Date? = null,

    public val exclude_expired_bans: Boolean? = null,

    public val limit: Int? = null,

    public val offset: Int? = null,

    public val user_id: String? = null,

    public val sort: List<StreamChatSortParam?>? = null,

    public val user: StreamChatUserObject? = null,

) 
