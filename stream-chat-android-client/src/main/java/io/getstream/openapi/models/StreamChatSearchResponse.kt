package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatSearchResponse(

    public val duration: String,

    public val results: List<StreamChatSearchResult?>,

    public val next: String? = null,

    public val previous: String? = null,

    public val results_warning: StreamChatSearchWarning? = null,

) 
