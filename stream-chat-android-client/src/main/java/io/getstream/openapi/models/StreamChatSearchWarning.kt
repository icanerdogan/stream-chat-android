package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatSearchWarning(

    public val warning_code: Int,

    public val warning_description: String,

    public val channel_search_count: Int? = null,

    public val channel_search_cids: List<String>? = null,

) 
