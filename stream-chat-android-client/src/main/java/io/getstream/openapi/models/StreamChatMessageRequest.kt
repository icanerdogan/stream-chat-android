package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import io.getstream.chat.android.client.parser2.adapters.RawJson

import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatMessageRequest(

    public val attachments: List<StreamChatAttachmentRequest?>,

    public val id: String? = null,

    public val parent_id: String? = null,

    public val pin_expires: Date? = null,

    public val pinned: Boolean? = null,

    public val pinned_at: Date? = null,

    public val quoted_message_id: String? = null,

    public val show_in_channel: Boolean? = null,

    public val silent: Boolean? = null,

    public val text: String? = null,

    public val type: String? = null,

    public val mentioned_users: List<String>? = null,

    public val custom: RawJson? = null,

) 
