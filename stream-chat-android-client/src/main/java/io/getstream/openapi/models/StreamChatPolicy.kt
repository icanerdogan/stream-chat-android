package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatPolicy(

    public val action: Int,

    public val created_at: Date,

    public val name: String,

    public val owner: Boolean,

    public val priority: Int,

    public val updated_at: Date,

    public val resources: List<String>,

    public val roles: List<String>,

) 
