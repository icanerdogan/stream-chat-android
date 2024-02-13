package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatPushProvider(

    public val created_at: Date,

    public val name: String,

    public val type: Int,

    public val updated_at: Date,

    public val apn_auth_key: String? = null,

    public val apn_auth_type: String? = null,

    public val apn_development: Boolean? = null,

    public val apn_host: String? = null,

    public val apn_key_id: String? = null,

    public val apn_notification_template: String? = null,

    public val apn_p12_cert: String? = null,

    public val apn_team_id: String? = null,

    public val apn_topic: String? = null,

    public val description: String? = null,

    public val disabled_at: Date? = null,

    public val disabled_reason: String? = null,

    public val firebase_apn_template: String? = null,

    public val firebase_credentials: String? = null,

    public val firebase_data_template: String? = null,

    public val firebase_host: String? = null,

    public val firebase_notification_template: String? = null,

    public val firebase_server_key: String? = null,

    public val huawei_app_id: String? = null,

    public val huawei_app_secret: String? = null,

    public val xiaomi_app_secret: String? = null,

    public val xiaomi_package_name: String? = null,

) 
