package io.getstream.openapi.models

import io.getstream.chat.android.client.api2.UrlQueryPayload
import io.getstream.chat.android.client.call.RetrofitCall
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory
import io.getstream.chat.android.client.api.AuthenticatedApi
import com.squareup.moshi.Moshi
import io.getstream.chat.android.client.parser2.adapters.GenericCustomDtoAdapter
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.PUT
import okhttp3.ResponseBody
import java.util.Date

@AuthenticatedApi
internal interface DefaultApi {
    @GET("/api/v2/og")
    fun getOG (
      @Query("url") url: String?,
      
    ): RetrofitCall<StreamChatGetOGResponse>

    @POST("/api/v2/chat/channels/read")
    fun markChannelsRead (
      @Body request: StreamChatMarkChannelsReadRequest,
    ): RetrofitCall<StreamChatMarkReadResponse>

    @POST("/api/v2/chat/channels/{type}/{id}/file")
    fun uploadFile (
      @Path("type") type: String,
      @Path("id") id: String,
      @Body request: StreamChatFileUploadRequest,
    ): RetrofitCall<StreamChatFileUploadResponse>

    @DELETE("/api/v2/chat/channels/{type}/{id}/file")
    fun deleteFile (
      @Path("type") type: String,
      @Path("id") id: String,
      @Query("url") url: String?,
      
    ): RetrofitCall<StreamChatFileDeleteResponse>

    @POST("/api/v2/chat/channels/{type}/{id}/query")
    fun getOrCreateChannel (
      @Path("type") type: String,
      @Path("id") id: String,
      @Query("connection_id") connectionId: String?,
      @Body request: StreamChatChannelGetOrCreateRequest,
    ): RetrofitCall<StreamChatChannelStateResponse>

    @POST("/api/v2/chat/channels/{type}/{id}/stop-watching")
    fun stopWatchingChannel (
      @Path("type") type: String,
      @Path("id") id: String,
      @Query("connection_id") connectionId: String?,
      @Body request: StreamChatChannelStopWatchingRequest,
    ): RetrofitCall<StreamChatStopWatchingResponse>

    @GET("/api/v2/chat/members")
    fun queryMembers (
       @UrlQueryPayload @Query("payload") payload: StreamChatQueryMembersRequest?,
    ): RetrofitCall<StreamChatMembersResponse>

    @POST("/api/v2/chat/sync")
    fun sync (
      @Query("with_inaccessible_cids") withInaccessibleCids: Boolean?,
      @Query("watch") watch: Boolean?,
      @Query("connection_id") connectionId: String?,
      @Body request: StreamChatSyncRequest,
    ): RetrofitCall<StreamChatSyncResponse>

    @GET("/api/v2/connect")
    fun connect (
      @UrlQueryPayload @Query("json") json: StreamChatConnectRequest?
    ): RetrofitCall<ResponseBody>

    @POST("/api/v2/chat/messages/{id}/reaction")
    fun sendReaction (
      @Path("id") id: String,
      @Body request: StreamChatSendReactionRequest,
    ): RetrofitCall<StreamChatReactionResponse>

    @POST("/api/v2/chat/channels/{type}/{id}/image")
    fun uploadImage (
      @Path("type") type: String,
      @Path("id") id: String,
      @Body request: StreamChatImageUploadRequest,
    ): RetrofitCall<StreamChatImageUploadResponse>

    @DELETE("/api/v2/chat/channels/{type}/{id}/image")
    fun deleteImage (
      @Path("type") type: String,
      @Path("id") id: String,
      @Query("url") url: String?,
      
    ): RetrofitCall<StreamChatFileDeleteResponse>

    @POST("/api/v2/chat/channels/{type}/{id}/unread")
    fun markUnread (
      @Path("type") type: String,
      @Path("id") id: String,
      @Body request: StreamChatMarkUnreadRequest,
    ): RetrofitCall<StreamChatResponse>

    @DELETE("/api/v2/chat/messages/{id}/reaction/{type}")
    fun deleteReaction (
      @Path("id") id: String,
      @Path("type") type: String,
      @Query("user_id") userId: String?,
      
    ): RetrofitCall<StreamChatReactionRemovalResponse>

    @POST("/api/v2/chat/moderation/unmute")
    fun unmuteUser (
      @Body request: StreamChatUnmuteUserRequest,
    ): RetrofitCall<StreamChatUnmuteResponse>

    @GET("/api/v2/users")
    fun queryUsers (
       @UrlQueryPayload @Query("payload") payload: StreamChatQueryUsersRequest?,
    ): RetrofitCall<StreamChatUsersResponse>

    @POST("/api/v2/users")
    fun updateUsers (
      @Body request: StreamChatUpdateUsersRequest,
    ): RetrofitCall<StreamChatUpdateUsersResponse>

    @PATCH("/api/v2/users")
    fun updateUsersPartial (
      @Body request: StreamChatUpdateUserPartialRequest,
    ): RetrofitCall<StreamChatUpdateUsersResponse>

    @GET("/api/v2/chat/channels/{type}/{id}/messages")
    fun getManyMessages (
      @Path("type") type: String,
      @Path("id") id: String,
      @Query("ids") ids: List<String>?,
      
    ): RetrofitCall<StreamChatGetManyMessagesResponse>

    @POST("/api/v2/chat/messages/{id}/action")
    fun runMessageAction (
      @Path("id") id: String,
      @Body request: StreamChatMessageActionRequest,
    ): RetrofitCall<StreamChatMessageResponse>

    @POST("/api/v2/chat/messages/{id}/translate")
    fun translateMessage (
      @Path("id") id: String,
      @Body request: StreamChatTranslateMessageRequest,
    ): RetrofitCall<StreamChatMessageResponse>

    @GET("/api/v2/chat/messages/{parent_id}/replies")
    fun getReplies (
      @Path("parent_id") parentId: String,
      @Query("id_gte") idGte: String?,
      @Query("id_gt") idGt: String?,
      @Query("id_lte") idLte: String?,
      @Query("id_lt") idLt: String?,
      @Query("created_at_after_or_equal") createdAtAfterOrEqual: Date?,
      @Query("created_at_after") createdAtAfter: Date?,
      @Query("created_at_before_or_equal") createdAtBeforeOrEqual: Date?,
      @Query("created_at_before") createdAtBefore: Date?,
      @Query("id_around") idAround: String?,
      @Query("created_at_around") createdAtAround: Date?,
      
    ): RetrofitCall<StreamChatGetRepliesResponse>

    @POST("/api/v2/chat/moderation/mute/channel")
    fun muteChannel (
      @Body request: StreamChatMuteChannelRequest,
    ): RetrofitCall<StreamChatMuteChannelResponse>

    @POST("/api/v2/guest")
    fun createGuest (
      @Body request: StreamChatGuestRequest,
    ): RetrofitCall<StreamChatGuestResponse>

    @POST("/api/v2/chat/channels/{type}/query")
    fun getOrCreateChannel (
      @Path("type") type: String,
      @Query("connection_id") connectionId: String?,
      @Body request: StreamChatChannelGetOrCreateRequest,
    ): RetrofitCall<StreamChatChannelStateResponse>

    @POST("/api/v2/chat/channels/{type}/{id}/message")
    fun sendMessage (
      @Path("type") type: String,
      @Path("id") id: String,
      @Body request: StreamChatSendMessageRequest,
    ): RetrofitCall<StreamChatSendMessageResponse>

    @GET("/api/v2/chat/messages/{id}/reactions")
    fun getReactions (
      @Path("id") id: String,
      @Query("limit") limit: Int?,
      @Query("offset") offset: Int?,
      
    ): RetrofitCall<StreamChatGetReactionsResponse>

    @POST("/api/v2/chat/moderation/mute")
    fun muteUser (
      @Body request: StreamChatMuteUserRequest,
    ): RetrofitCall<StreamChatMuteUserResponse>

    @POST("/api/v2/chat/moderation/unmute/channel")
    fun unmuteChannel (
      @Body request: StreamChatUnmuteChannelRequest,
    ): RetrofitCall<StreamChatUnmuteResponse>

    @GET("/api/v2/chat/search")
    fun search (
       @UrlQueryPayload @Query("payload") payload: StreamChatSearchRequest?,
    ): RetrofitCall<StreamChatSearchResponse>

    @GET("/api/v2/chat/unread")
    fun unreadCounts (
      
    ): RetrofitCall<StreamChatUnreadCountsResponse>

    @GET("/api/v2/longpoll")
    fun longPoll (
      @Query("connection_id") connectionId: String?,
      @UrlQueryPayload @Query("json") json: StreamChatConnectRequest?
    ): RetrofitCall<ResponseBody>

    @POST("/api/v2/chat/channels/{type}/{id}/truncate")
    fun truncateChannel (
      @Path("type") type: String,
      @Path("id") id: String,
      @Body request: StreamChatTruncateChannelRequest,
    ): RetrofitCall<StreamChatTruncateChannelResponse>

    @GET("/api/v2/chat/moderation/flags/message")
    fun queryMessageFlags (
       @UrlQueryPayload @Query("payload") payload: StreamChatQueryMessageFlagsRequest?,
    ): RetrofitCall<StreamChatQueryMessageFlagsResponse>

    @GET("/api/v2/app")
    fun getApp (
      
    ): RetrofitCall<StreamChatGetApplicationResponse>

    @POST("/api/v2/chat/channels/delete")
    fun deleteChannels (
      @Body request: StreamChatDeleteChannelsRequest,
    ): RetrofitCall<StreamChatDeleteChannelsResponse>

    @POST("/api/v2/chat/channels/{type}/{id}/event")
    fun sendEvent (
      @Path("type") type: String,
      @Path("id") id: String,
      @Body request: StreamChatSendEventRequest,
    ): RetrofitCall<StreamChatEventResponse>

    @POST("/api/v2/chat/channels/{type}/{id}/hide")
    fun hideChannel (
      @Path("type") type: String,
      @Path("id") id: String,
      @Body request: StreamChatHideChannelRequest,
    ): RetrofitCall<StreamChatHideChannelResponse>

    @POST("/api/v2/chat/channels/{type}/{id}/show")
    fun showChannel (
      @Path("type") type: String,
      @Path("id") id: String,
      @Body request: StreamChatShowChannelRequest,
    ): RetrofitCall<StreamChatShowChannelResponse>

    @GET("/api/v2/chat/messages/{id}")
    fun getMessage (
      @Path("id") id: String,
      
    ): RetrofitCall<StreamChatMessageWithPendingMetadataResponse>

    @POST("/api/v2/chat/messages/{id}")
    fun updateMessage (
      @Path("id") id: String,
      @Body request: StreamChatUpdateMessageRequest,
    ): RetrofitCall<StreamChatUpdateMessageResponse>

    @PUT("/api/v2/chat/messages/{id}")
    fun updateMessagePartial (
      @Path("id") id: String,
      @Body request: StreamChatUpdateMessagePartialRequest,
    ): RetrofitCall<StreamChatUpdateMessagePartialResponse>

    @DELETE("/api/v2/chat/messages/{id}")
    fun deleteMessage (
      @Path("id") id: String,
      @Query("hard") hard: Boolean?,
      @Query("deleted_by") deletedBy: String?,
      
    ): RetrofitCall<StreamChatMessageResponse>

    @POST("/api/v2/chat/moderation/flag")
    fun flag (
      @Body request: StreamChatFlagRequest,
    ): RetrofitCall<StreamChatFlagResponse>

    @GET("/api/v2/devices")
    fun listDevices (
      @Query("user_id") userId: String?,
      
    ): RetrofitCall<StreamChatListDevicesResponse>

    @POST("/api/v2/devices")
    fun createDevice (
      @Body request: StreamChatCreateDeviceRequest,
    ): RetrofitCall<ResponseBody>

    @DELETE("/api/v2/devices")
    fun deleteDevice (
      @Query("id") id: String?,
      @Query("user_id") userId: String?,
      
    ): RetrofitCall<StreamChatResponse>

    @POST("/api/v2/chat/channels")
    fun queryChannels (
      @Query("connection_id") connectionId: String?,
      @Body request: StreamChatQueryChannelsRequest,
    ): RetrofitCall<StreamChatChannelsResponse>

    @POST("/api/v2/chat/channels/{type}/{id}")
    fun updateChannel (
      @Path("type") type: String,
      @Path("id") id: String,
      @Body request: StreamChatUpdateChannelRequest,
    ): RetrofitCall<StreamChatUpdateChannelResponse>

    @DELETE("/api/v2/chat/channels/{type}/{id}")
    fun deleteChannel (
      @Path("type") type: String,
      @Path("id") id: String,
      @Query("hard_delete") hardDelete: Boolean?,
      
    ): RetrofitCall<StreamChatDeleteChannelResponse>

    @PATCH("/api/v2/chat/channels/{type}/{id}")
    fun updateChannelPartial (
      @Path("type") type: String,
      @Path("id") id: String,
      @Body request: StreamChatUpdateChannelPartialRequest,
    ): RetrofitCall<StreamChatUpdateChannelPartialResponse>

    @POST("/api/v2/chat/channels/{type}/{id}/read")
    fun markRead (
      @Path("type") type: String,
      @Path("id") id: String,
      @Body request: StreamChatMarkReadRequest,
    ): RetrofitCall<StreamChatMarkReadResponse>

    @POST("/api/v2/chat/moderation/ban")
    fun ban (
      @Body request: StreamChatBanRequest,
    ): RetrofitCall<StreamChatResponse>

    @DELETE("/api/v2/chat/moderation/ban")
    fun unban (
      @Query("target_user_id") targetUserId: String?,
      @Query("type") type: String?,
      @Query("id") id: String?,
      @Query("created_by") createdBy: String?,
      
    ): RetrofitCall<StreamChatResponse>

    @GET("/api/v2/chat/query_banned_users")
    fun queryBannedUsers (
       @UrlQueryPayload @Query("payload") payload: StreamChatQueryBannedUsersRequest?,
    ): RetrofitCall<StreamChatQueryBannedUsersResponse>


}

internal object Serializer {
    @JvmStatic
    val moshiBuilder: Moshi.Builder = Moshi.Builder()
    .add(GenericCustomDtoAdapter)
    .add(PolymorphicJsonAdapterFactory.of(StreamChatWSEvent::class.java, "type")
         .withSubtype(StreamChatChannelCreatedEvent::class.java, "channel.created")
         .withSubtype(StreamChatChannelDeletedEvent::class.java, "channel.deleted")
         .withSubtype(StreamChatChannelFrozenEvent::class.java, "channel.frozen")
         .withSubtype(StreamChatChannelHiddenEvent::class.java, "channel.hidden")
         .withSubtype(StreamChatChannelKickedEvent::class.java, "channel.kicked")
         .withSubtype(StreamChatChannelTruncatedEvent::class.java, "channel.truncated")
         .withSubtype(StreamChatChannelUnFrozenEvent::class.java, "channel.unfrozen")
         .withSubtype(StreamChatChannelUpdatedEvent::class.java, "channel.updated")
         .withSubtype(StreamChatChannelVisibleEvent::class.java, "channel.visible")
         .withSubtype(StreamChatAnyEvent::class.java, "custom")
         .withSubtype(StreamChatHealthCheckEvent::class.java, "health.check")
         .withSubtype(StreamChatMemberAddedEvent::class.java, "member.added")
         .withSubtype(StreamChatMemberRemovedEvent::class.java, "member.removed")
         .withSubtype(StreamChatMemberUpdatedEvent::class.java, "member.updated")
         .withSubtype(StreamChatMessageDeletedEvent::class.java, "message.deleted")
         .withSubtype(StreamChatMessageNewEvent::class.java, "message.new")
         .withSubtype(StreamChatMessageReadEvent::class.java, "message.read")
         .withSubtype(StreamChatMessageUpdatedEvent::class.java, "message.updated")
         .withSubtype(StreamChatNotificationAddedToChannelEvent::class.java, "notification.added_to_channel")
         .withSubtype(StreamChatNotificationChannelDeletedEvent::class.java, "notification.channel_deleted")
         .withSubtype(StreamChatNotificationChannelMutesUpdatedEvent::class.java, "notification.channel_mutes_updated")
         .withSubtype(StreamChatNotificationChannelTruncatedEvent::class.java, "notification.channel_truncated")
         .withSubtype(StreamChatNotificationInviteAcceptedEvent::class.java, "notification.invite_accepted")
         .withSubtype(StreamChatNotificationInviteRejectedEvent::class.java, "notification.invite_rejected")
         .withSubtype(StreamChatNotificationInvitedEvent::class.java, "notification.invited")
         .withSubtype(StreamChatNotificationMarkReadEvent::class.java, "notification.mark_read")
         .withSubtype(StreamChatNotificationMarkUnreadEvent::class.java, "notification.mark_unread")
         .withSubtype(StreamChatNotificationNewMessageEvent::class.java, "notification.message_new")
         .withSubtype(StreamChatNotificationMutesUpdatedEvent::class.java, "notification.mutes_updated")
         .withSubtype(StreamChatNotificationRemovedFromChannelEvent::class.java, "notification.removed_from_channel")
         .withSubtype(StreamChatReactionDeletedEvent::class.java, "reaction.deleted")
         .withSubtype(StreamChatReactionNewEvent::class.java, "reaction.new")
         .withSubtype(StreamChatReactionUpdatedEvent::class.java, "reaction.updated")
         .withSubtype(StreamChatTypingStartEvent::class.java, "typing.start")
         .withSubtype(StreamChatTypingStopEvent::class.java, "typing.stop")
         .withSubtype(StreamChatUserBannedEvent::class.java, "user.banned")
         .withSubtype(StreamChatUserDeactivatedEvent::class.java, "user.deactivated")
         .withSubtype(StreamChatUserDeletedEvent::class.java, "user.deleted")
         .withSubtype(StreamChatUserMutedEvent::class.java, "user.muted")
         .withSubtype(StreamChatUserPresenceChangedEvent::class.java, "user.presence.changed")
         .withSubtype(StreamChatUserReactivatedEvent::class.java, "user.reactivated")
         .withSubtype(StreamChatUserUnbannedEvent::class.java, "user.unbanned")
         .withSubtype(StreamChatUserUpdatedEvent::class.java, "user.updated")
         .withSubtype(StreamChatUserWatchingStartEvent::class.java, "user.watching.start")
         .withSubtype(StreamChatUserWatchingStopEvent::class.java, "user.watching.stop")
        )

    @JvmStatic
    val moshi: Moshi by lazy {
        moshiBuilder.build()
    }
}

