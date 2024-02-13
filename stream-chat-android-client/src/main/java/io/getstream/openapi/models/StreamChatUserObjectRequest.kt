package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import io.getstream.chat.android.client.parser2.adapters.RawJson


@JsonClass(generateAdapter = true)
internal data class StreamChatUserObjectRequest(

    public val id: String,

    public val invisible: Boolean? = null,

    public val language: String? = null,

    public val role: String? = null,

    public val teams: List<String>? = null,

    public val custom: RawJson? = null,

    public val push_notifications: StreamChatPushNotificationSettingsRequest? = null,

) 
