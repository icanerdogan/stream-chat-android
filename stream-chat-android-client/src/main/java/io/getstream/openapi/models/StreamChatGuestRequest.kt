package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatGuestRequest(

    public val user: StreamChatUserObjectRequest,

) 
