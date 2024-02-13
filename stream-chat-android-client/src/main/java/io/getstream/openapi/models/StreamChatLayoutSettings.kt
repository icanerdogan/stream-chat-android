package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import io.getstream.chat.android.client.parser2.adapters.RawJson


@JsonClass(generateAdapter = true)
internal data class StreamChatLayoutSettings(

    public val external_app_url: String,

    public val external_css_url: String,

    public val name: String,

    public val options: RawJson? = null,

) 
