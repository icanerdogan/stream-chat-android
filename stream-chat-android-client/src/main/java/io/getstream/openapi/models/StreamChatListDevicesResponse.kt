package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatListDevicesResponse(

    public val duration: String,

    public val devices: List<StreamChatDevice>,

) 
