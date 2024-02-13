package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatTruncateChannelRequest(

    public val hard_delete: Boolean? = null,

    public val skip_push: Boolean? = null,

    public val truncated_at: Date? = null,

    public val message: StreamChatMessageRequest? = null,

) 
