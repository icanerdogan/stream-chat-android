package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatFileUploadConfig(

    public val allowed_file_extensions: List<String>,

    public val allowed_mime_types: List<String>,

    public val blocked_file_extensions: List<String>,

    public val blocked_mime_types: List<String>,

) 
