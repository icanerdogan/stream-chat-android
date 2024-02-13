package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatChannelGetOrCreateRequest(

    public val connection_id: String? = null,

    public val hide_for_creator: Boolean? = null,

    public val presence: Boolean? = null,

    public val state: Boolean? = null,

    public val watch: Boolean? = null,

    public val data: StreamChatChannelRequest? = null,

    public val members: StreamChatPaginationParamsRequest? = null,

    public val messages: StreamChatMessagePaginationParamsRequest? = null,

    public val watchers: StreamChatPaginationParamsRequest? = null,

) 
