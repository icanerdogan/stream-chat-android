package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatSyncRequest(

    public val last_sync_at: Date,

    public val connection_id: String? = null,

    public val user_id: String? = null,

    public val watch: Boolean? = null,

    public val with_inaccessible_cids: Boolean? = null,

    public val channel_cids: List<String>? = null,

    public val user: StreamChatUserObjectRequest? = null,

) 
