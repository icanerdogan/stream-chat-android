package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatLabel(

    public val name: String,

    public val phrase_list_ids: List<Int>? = null,

) 
