package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatConnectRequest(

    public val user_details: StreamChatUserObject,

    public val device: StreamChatDeviceFields? = null,

) 
