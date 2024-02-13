package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import io.getstream.chat.android.client.parser2.adapters.RawJson


@JsonClass(generateAdapter = true)
internal data class StreamChatAttachment(

    public val custom: RawJson,

    public val asset_url: String? = null,

    public val author_icon: String? = null,

    public val author_link: String? = null,

    public val author_name: String? = null,

    public val color: String? = null,

    public val fallback: String? = null,

    public val footer: String? = null,

    public val footer_icon: String? = null,

    public val image_url: String? = null,

    public val og_scrape_url: String? = null,

    public val original_height: Int? = null,

    public val original_width: Int? = null,

    public val pretext: String? = null,

    public val text: String? = null,

    public val thumb_url: String? = null,

    public val title: String? = null,

    public val title_link: String? = null,

    public val type: String? = null,

    public val actions: List<StreamChatAction?>? = null,

    public val fields: List<StreamChatField?>? = null,

    public val giphy: StreamChatImages? = null,

) 
