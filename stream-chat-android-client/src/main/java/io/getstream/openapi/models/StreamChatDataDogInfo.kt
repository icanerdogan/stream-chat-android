package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatDataDogInfo(

    public val api_key: String,

    public val site: String,

) 
