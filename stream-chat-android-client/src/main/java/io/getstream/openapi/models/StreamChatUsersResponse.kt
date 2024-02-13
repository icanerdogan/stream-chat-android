package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatUsersResponse(

    public val duration: String,

    public val users: List<StreamChatUserResponse?>,

) 
