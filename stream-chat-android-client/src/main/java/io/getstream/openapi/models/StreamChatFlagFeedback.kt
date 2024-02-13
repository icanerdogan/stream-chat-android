package io.getstream.openapi.models
import com.squareup.moshi.JsonClass
import java.util.Date


@JsonClass(generateAdapter = true)
internal data class StreamChatFlagFeedback(

    public val created_at: Date,

    public val message_id: String,

    public val labels: List<StreamChatLabel>,

) 
