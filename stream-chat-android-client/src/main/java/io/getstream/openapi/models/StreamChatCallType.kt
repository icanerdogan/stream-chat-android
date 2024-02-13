package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatCallType(

    public val AppPK: Int,

    public val CreatedAt: Date,

    public val Name: String,

    public val PK: Int,

    public val UpdatedAt: Date,

    public val NotificationSettings: StreamChatNotificationSettings? = null,

    public val Settings: StreamChatCallSettings? = null,

) 
