package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import io.getstream.chat.android.client.parser2.adapters.RawJson

import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatUserObject(

    public val id: String,

    public val ban_expires: Date? = null,

    public val banned: Boolean? = null,

    public val created_at: Date? = null,

    public val deactivated_at: Date? = null,

    public val deleted_at: Date? = null,

    public val invisible: Boolean? = null,

    public val language: String? = null,

    public val last_active: Date? = null,

    public val online: Boolean? = null,

    public val revoke_tokens_issued_before: Date? = null,

    public val role: String? = null,

    public val updated_at: Date? = null,

    public val teams: List<String>? = null,

    public val custom: RawJson? = null,

    public val push_notifications: StreamChatPushNotificationSettings? = null,

) 
