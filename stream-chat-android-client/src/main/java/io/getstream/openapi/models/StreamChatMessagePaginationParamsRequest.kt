package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatMessagePaginationParamsRequest(

    public val created_at_after: Date? = null,

    public val created_at_after_or_equal: Date? = null,

    public val created_at_around: Date? = null,

    public val created_at_before: Date? = null,

    public val created_at_before_or_equal: Date? = null,

    public val id_around: String? = null,

    public val id_gt: String? = null,

    public val id_gte: String? = null,

    public val id_lt: String? = null,

    public val id_lte: String? = null,

    public val limit: Int? = null,

    public val offset: Int? = null,

) 
