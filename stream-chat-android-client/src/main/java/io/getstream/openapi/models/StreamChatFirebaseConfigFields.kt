package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatFirebaseConfigFields(

    public val apn_template: String,

    public val data_template: String,

    public val enabled: Boolean,

    public val notification_template: String,

    public val credentials_json: String? = null,

    public val server_key: String? = null,

) 
