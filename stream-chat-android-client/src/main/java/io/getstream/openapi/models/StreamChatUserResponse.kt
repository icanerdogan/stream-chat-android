package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import io.getstream.chat.android.client.parser2.adapters.RawJson

import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatUserResponse(

    public val banned: Boolean,

    public val id: String,

    public val online: Boolean,

    public val role: String,

    public val shadow_banned: Boolean,

    public val custom: RawJson,

    public val ban_expires: Date? = null,

    public val created_at: Date? = null,

    public val deactivated_at: Date? = null,

    public val deleted_at: Date? = null,

    public val invisible: Boolean? = null,

    public val language: String? = null,

    public val last_active: Date? = null,

    public val revoke_tokens_issued_before: Date? = null,

    public val updated_at: Date? = null,

    public val teams: List<String>? = null,

    public val push_notifications: StreamChatPushNotificationSettings? = null,

) 
