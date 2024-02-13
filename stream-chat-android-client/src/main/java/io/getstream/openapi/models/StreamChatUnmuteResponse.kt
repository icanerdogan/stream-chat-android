package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatUnmuteResponse(

    public val duration: String,

    public val non_existing_users: List<String>? = null,

) 
