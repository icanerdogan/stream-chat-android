package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatNotificationSettings(

    public val enabled: Boolean,

    public val call_live_started: StreamChatEventNotificationSettings,

    public val call_notification: StreamChatEventNotificationSettings,

    public val call_ring: StreamChatEventNotificationSettings,

    public val session_started: StreamChatEventNotificationSettings,

) 
