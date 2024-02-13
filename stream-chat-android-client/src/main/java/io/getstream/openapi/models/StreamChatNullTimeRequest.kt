package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatNullTimeRequest(

    public val HasValue: Boolean? = null,

    public val Value: Date? = null,

) 
