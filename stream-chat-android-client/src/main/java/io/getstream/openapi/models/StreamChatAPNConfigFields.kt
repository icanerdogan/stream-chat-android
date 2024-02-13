package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatAPNConfigFields(

    public val development: Boolean,

    public val enabled: Boolean,

    public val notification_template: String,

    public val auth_key: String? = null,

    public val auth_type: String? = null,

    public val bundle_id: String? = null,

    public val host: String? = null,

    public val key_id: String? = null,

    public val p12_cert: String? = null,

    public val team_id: String? = null,

) 
