package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import io.getstream.chat.android.client.parser2.adapters.RawJson

import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatOwnUser(

    public val banned: Boolean,

    public val created_at: Date,

    public val id: String,

    public val language: String,

    public val online: Boolean,

    public val role: String,

    public val total_unread_count: Int,

    public val unread_channels: Int,

    public val unread_count: Int,

    public val updated_at: Date,

    public val channel_mutes: List<StreamChatChannelMute?>,

    public val devices: List<StreamChatDevice>,

    public val mutes: List<StreamChatUserMute?>,

    public val custom: RawJson,

    public val deactivated_at: Date? = null,

    public val deleted_at: Date? = null,

    public val invisible: Boolean? = null,

    public val last_active: Date? = null,

    public val latest_hidden_channels: List<String>? = null,

    public val teams: List<String>? = null,

    public val push_notifications: StreamChatPushNotificationSettings? = null,

) 
