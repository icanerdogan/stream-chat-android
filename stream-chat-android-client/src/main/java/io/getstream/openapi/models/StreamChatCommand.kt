package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatCommand(

    public val args: String,

    public val description: String,

    public val name: String,

    public val set: String,

    public val created_at: Date? = null,

    public val updated_at: Date? = null,

) 
