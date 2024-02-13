package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatMuteUserResponse(

    public val duration: String,

    public val mutes: List<StreamChatUserMute?>? = null,

    public val non_existing_users: List<String>? = null,

    public val mute: StreamChatUserMute? = null,

    public val own_user: StreamChatOwnUser? = null,

) 
