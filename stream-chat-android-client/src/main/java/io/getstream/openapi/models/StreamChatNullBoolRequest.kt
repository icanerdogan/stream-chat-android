package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatNullBoolRequest(

    public val HasValue: Boolean? = null,

    public val Value: Boolean? = null,

) 
