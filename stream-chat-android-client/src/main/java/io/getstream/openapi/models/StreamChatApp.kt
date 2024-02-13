package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatApp(

    public val async_url_enrich_enabled: Boolean,

    public val campaign_enabled: Boolean = false,

    public val cdn_expiration_seconds: Int,

    public val custom_action_handler_url: String,

    public val disable_auth_checks: Boolean,

    public val disable_permissions_checks: Boolean,

    public val enforce_unique_usernames: String,

    public val image_moderation_enabled: Boolean,

    public val multi_tenant_enabled: Boolean,

    public val name: String,

    public val organization: String,

    public val permission_version: String,

    public val reminders_interval: Int,

    public val sns_key: String,

    public val sns_secret: String,

    public val sns_topic_arn: String,

    public val sqs_key: String,

    public val sqs_secret: String,

    public val sqs_url: String,

    public val suspended: Boolean,

    public val suspended_explanation: String,

    public val video_provider: String,

    public val webhook_url: String,

    public val user_search_disallowed_roles: List<String>,

    public val webhook_events: List<String>,

    public val call_types: Map<String, StreamChatCallType?>,

    public val channel_configs: Map<String, StreamChatChannelConfig?>,

    public val file_upload_config: StreamChatFileUploadConfig,

    public val grants: Map<String, List<String>>,

    public val image_upload_config: StreamChatFileUploadConfig,

    public val policies: Map<String, List<StreamChatPolicy>>,

    public val push_notifications: StreamChatPushNotificationFields,

    public val auto_translation_enabled: Boolean? = null,

    public val before_message_send_hook_url: String? = null,

    public val revoke_tokens_issued_before: Date? = null,

    public val allowed_flag_reasons: List<String>? = null,

    public val geofences: List<StreamChatGeofenceResponse?>? = null,

    public val image_moderation_labels: List<String>? = null,

    public val agora_options: StreamChatConfig? = null,

    public val datadog_info: StreamChatDataDogInfo? = null,

    public val hms_options: StreamChatConfig? = null,

) 
