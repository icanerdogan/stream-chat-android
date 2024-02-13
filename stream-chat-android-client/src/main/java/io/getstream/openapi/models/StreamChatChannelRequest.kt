package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import io.getstream.chat.android.client.parser2.adapters.RawJson


@JsonClass(generateAdapter = true)
internal data class StreamChatChannelRequest(

    public val auto_translation_enabled: Boolean? = null,

    public val auto_translation_language: String? = null,

    public val disabled: Boolean? = null,

    public val frozen: Boolean? = null,

    public val team: String? = null,

    public val truncated_by_id: String? = null,

    public val members: List<StreamChatChannelMemberRequest?>? = null,

    public val config_overrides: StreamChatChannelConfigRequest? = null,

    public val Custom: RawJson? = null,

) 
