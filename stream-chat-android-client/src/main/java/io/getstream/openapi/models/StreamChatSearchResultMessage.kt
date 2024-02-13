package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import io.getstream.chat.android.client.parser2.adapters.RawJson

import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatSearchResultMessage(

    public val cid: String,

    public val created_at: Date,

    public val deleted_reply_count: Int,

    public val html: String,

    public val id: String,

    public val pinned: Boolean,

    public val reply_count: Int,

    public val shadowed: Boolean,

    public val silent: Boolean,

    public val text: String,

    public val type: String,

    public val updated_at: Date,

    public val attachments: List<StreamChatAttachment?>,

    public val latest_reactions: List<StreamChatReaction?>,

    public val mentioned_users: List<StreamChatUserObject>,

    public val own_reactions: List<StreamChatReaction?>,

    public val custom: RawJson,

    public val reaction_counts: Map<String, Int>,

    public val reaction_scores: Map<String, Int>,

    public val before_message_send_failed: Boolean? = null,

    public val command: String? = null,

    public val deleted_at: Date? = null,

    public val mml: String? = null,

    public val parent_id: String? = null,

    public val pin_expires: Date? = null,

    public val pinned_at: Date? = null,

    public val quoted_message_id: String? = null,

    public val show_in_channel: Boolean? = null,

    public val thread_participants: List<StreamChatUserObject>? = null,

    public val channel: StreamChatChannelResponse? = null,

    public val i18n: Map<String, String>? = null,

    public val image_labels: Map<String, List<String>>? = null,

    public val pinned_by: StreamChatUserObject? = null,

    public val quoted_message: StreamChatMessage? = null,

    public val user: StreamChatUserObject? = null,

) 
