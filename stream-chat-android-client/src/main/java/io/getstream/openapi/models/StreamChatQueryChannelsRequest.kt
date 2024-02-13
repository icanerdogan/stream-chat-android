package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import io.getstream.chat.android.client.parser2.adapters.RawJson


@JsonClass(generateAdapter = true)
internal data class StreamChatQueryChannelsRequest(

    public val connection_id: String? = null,

    public val limit: Int? = null,

    public val member_limit: Int? = null,

    public val message_limit: Int? = null,

    public val offset: Int? = null,

    public val presence: Boolean? = null,

    public val state: Boolean? = null,

    public val user_id: String? = null,

    public val watch: Boolean? = null,

    public val sort: List<StreamChatSortParamRequest?>? = null,

    public val filter_conditions: RawJson? = null,

    public val user: StreamChatUserObjectRequest? = null,

) 
