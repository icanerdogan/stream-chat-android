package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatGuestResponse(

    public val access_token: String,

    public val duration: String,

    public val user: StreamChatUserObject? = null,

) 
