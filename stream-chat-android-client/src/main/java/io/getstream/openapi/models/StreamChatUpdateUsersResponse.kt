package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatUpdateUsersResponse(

    public val duration: String,

    public val users: Map<String, StreamChatUserObject>,

) 
