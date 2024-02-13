package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatPushNotificationSettingsRequest(

    public val disabled: StreamChatNullBoolRequest? = null,

    public val disabled_until: StreamChatNullTimeRequest? = null,

) 
