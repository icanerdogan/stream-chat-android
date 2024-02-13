package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatPushNotificationFields(

    public val offline_only: Boolean,

    public val version: String,

    public val apn: StreamChatAPNConfigFields,

    public val firebase: StreamChatFirebaseConfigFields,

    public val huawei: StreamChatHuaweiConfigFields,

    public val xiaomi: StreamChatXiaomiConfigFields,

    public val providers: List<StreamChatPushProvider?>? = null,

) 
