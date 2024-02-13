package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatSyncResponse(

    public val duration: String,

    public val events: List<StreamChatWSEvent>,

    public val inaccessible_cids: List<String>? = null,

) 
