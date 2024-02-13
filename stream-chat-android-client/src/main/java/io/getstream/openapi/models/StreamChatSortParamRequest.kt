package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatSortParamRequest(

    public val direction: Int? = null,

    public val field: String? = null,

) 
