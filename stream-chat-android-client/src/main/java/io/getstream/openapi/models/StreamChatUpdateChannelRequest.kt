package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatUpdateChannelRequest(

    public val add_moderators: List<String>,

    public val demote_moderators: List<String>,

    public val remove_members: List<String>,

    public val accept_invite: Boolean? = null,

    public val cooldown: Int? = null,

    public val hide_history: Boolean? = null,

    public val reject_invite: Boolean? = null,

    public val skip_push: Boolean? = null,

    public val add_members: List<StreamChatChannelMemberRequest?>? = null,

    public val assign_roles: List<StreamChatChannelMemberRequest?>? = null,

    public val invites: List<StreamChatChannelMemberRequest?>? = null,

    public val data: StreamChatChannelRequest? = null,

    public val message: StreamChatMessageRequest? = null,

) 
