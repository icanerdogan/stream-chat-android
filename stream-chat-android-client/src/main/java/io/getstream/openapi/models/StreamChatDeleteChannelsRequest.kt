package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatDeleteChannelsRequest(

    public val hard_delete: Boolean? = null,

    public val cids: List<String>? = null,

) 
