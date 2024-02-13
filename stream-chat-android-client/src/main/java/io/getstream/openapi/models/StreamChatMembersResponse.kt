package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatMembersResponse(

    public val duration: String,

    public val members: List<StreamChatChannelMember?>,

) 
