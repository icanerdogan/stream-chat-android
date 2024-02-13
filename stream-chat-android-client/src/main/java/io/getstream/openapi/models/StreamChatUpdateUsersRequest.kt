package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatUpdateUsersRequest(

    public val users: Map<String, StreamChatUserObjectRequest?>,

) 
