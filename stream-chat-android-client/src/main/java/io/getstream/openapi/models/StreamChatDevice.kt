package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatDevice(

    public val created_at: Date,

    public val id: String,

    public val push_provider: String,

    public val disabled: Boolean? = null,

    public val disabled_reason: String? = null,

    public val push_provider_name: String? = null,

    public val voip: Boolean? = null,

) 
