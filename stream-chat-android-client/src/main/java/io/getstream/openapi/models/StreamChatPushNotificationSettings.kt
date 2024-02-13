package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatPushNotificationSettings(

    public val disabled: Boolean? = null,

    public val disabled_until: Date? = null,

) 
