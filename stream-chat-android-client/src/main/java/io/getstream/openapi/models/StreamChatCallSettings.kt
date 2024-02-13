package io.getstream.openapi.models
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class StreamChatCallSettings(

    public val audio: StreamChatAudioSettings? = null,

    public val backstage: StreamChatBackstageSettings? = null,

    public val broadcasting: StreamChatBroadcastSettings? = null,

    public val geofencing: StreamChatGeofenceSettings? = null,

    public val recording: StreamChatRecordSettings? = null,

    public val ring: StreamChatRingSettings? = null,

    public val screensharing: StreamChatScreensharingSettings? = null,

    public val thumbnails: StreamChatThumbnailsSettings? = null,

    public val transcription: StreamChatTranscriptionSettings? = null,

    public val video: StreamChatVideoSettings? = null,

) 
