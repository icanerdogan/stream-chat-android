package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatPaginationParamsRequest(

    public val id_gt: Int? = null,

    public val id_gte: Int? = null,

    public val id_lt: Int? = null,

    public val id_lte: Int? = null,

    public val limit: Int? = null,

    public val offset: Int? = null,

) 
