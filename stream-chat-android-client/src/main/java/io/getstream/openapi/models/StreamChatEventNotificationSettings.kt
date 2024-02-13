package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatEventNotificationSettings(

    public val enabled: Boolean,

    public val apns: StreamChatAPNS,

) 
