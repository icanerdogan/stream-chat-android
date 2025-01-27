/*
 * Copyright (c) 2014-2022 Stream.io Inc. All rights reserved.
 *
 * Licensed under the Stream License;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://github.com/GetStream/stream-chat-android/blob/main/LICENSE
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("TooManyFunctions")

package io.getstream.chat.android.client.api2.mapping

import io.getstream.chat.android.client.api2.model.dto.AIIndicatorClearEventDto
import io.getstream.chat.android.client.api2.model.dto.AIIndicatorStopEventDto
import io.getstream.chat.android.client.api2.model.dto.AIIndicatorUpdatedEventDto
import io.getstream.chat.android.client.api2.model.dto.AnswerCastedEventDto
import io.getstream.chat.android.client.api2.model.dto.ChannelDeletedEventDto
import io.getstream.chat.android.client.api2.model.dto.ChannelHiddenEventDto
import io.getstream.chat.android.client.api2.model.dto.ChannelTruncatedEventDto
import io.getstream.chat.android.client.api2.model.dto.ChannelUpdatedByUserEventDto
import io.getstream.chat.android.client.api2.model.dto.ChannelUpdatedEventDto
import io.getstream.chat.android.client.api2.model.dto.ChannelUserBannedEventDto
import io.getstream.chat.android.client.api2.model.dto.ChannelUserUnbannedEventDto
import io.getstream.chat.android.client.api2.model.dto.ChannelVisibleEventDto
import io.getstream.chat.android.client.api2.model.dto.ChatEventDto
import io.getstream.chat.android.client.api2.model.dto.ConnectedEventDto
import io.getstream.chat.android.client.api2.model.dto.ConnectingEventDto
import io.getstream.chat.android.client.api2.model.dto.ConnectionErrorEventDto
import io.getstream.chat.android.client.api2.model.dto.DisconnectedEventDto
import io.getstream.chat.android.client.api2.model.dto.ErrorEventDto
import io.getstream.chat.android.client.api2.model.dto.GlobalUserBannedEventDto
import io.getstream.chat.android.client.api2.model.dto.GlobalUserUnbannedEventDto
import io.getstream.chat.android.client.api2.model.dto.HealthEventDto
import io.getstream.chat.android.client.api2.model.dto.MarkAllReadEventDto
import io.getstream.chat.android.client.api2.model.dto.MemberAddedEventDto
import io.getstream.chat.android.client.api2.model.dto.MemberRemovedEventDto
import io.getstream.chat.android.client.api2.model.dto.MemberUpdatedEventDto
import io.getstream.chat.android.client.api2.model.dto.MessageDeletedEventDto
import io.getstream.chat.android.client.api2.model.dto.MessageReadEventDto
import io.getstream.chat.android.client.api2.model.dto.MessageUpdatedEventDto
import io.getstream.chat.android.client.api2.model.dto.NewMessageEventDto
import io.getstream.chat.android.client.api2.model.dto.NotificationAddedToChannelEventDto
import io.getstream.chat.android.client.api2.model.dto.NotificationChannelDeletedEventDto
import io.getstream.chat.android.client.api2.model.dto.NotificationChannelMutesUpdatedEventDto
import io.getstream.chat.android.client.api2.model.dto.NotificationChannelTruncatedEventDto
import io.getstream.chat.android.client.api2.model.dto.NotificationInviteAcceptedEventDto
import io.getstream.chat.android.client.api2.model.dto.NotificationInviteRejectedEventDto
import io.getstream.chat.android.client.api2.model.dto.NotificationInvitedEventDto
import io.getstream.chat.android.client.api2.model.dto.NotificationMarkReadEventDto
import io.getstream.chat.android.client.api2.model.dto.NotificationMarkUnreadEventDto
import io.getstream.chat.android.client.api2.model.dto.NotificationMessageNewEventDto
import io.getstream.chat.android.client.api2.model.dto.NotificationMutesUpdatedEventDto
import io.getstream.chat.android.client.api2.model.dto.NotificationRemovedFromChannelEventDto
import io.getstream.chat.android.client.api2.model.dto.NotificationThreadMessageNewEventDto
import io.getstream.chat.android.client.api2.model.dto.PollClosedEventDto
import io.getstream.chat.android.client.api2.model.dto.PollDeletedEventDto
import io.getstream.chat.android.client.api2.model.dto.PollUpdatedEventDto
import io.getstream.chat.android.client.api2.model.dto.ReactionDeletedEventDto
import io.getstream.chat.android.client.api2.model.dto.ReactionNewEventDto
import io.getstream.chat.android.client.api2.model.dto.ReactionUpdateEventDto
import io.getstream.chat.android.client.api2.model.dto.TypingStartEventDto
import io.getstream.chat.android.client.api2.model.dto.TypingStopEventDto
import io.getstream.chat.android.client.api2.model.dto.UnknownEventDto
import io.getstream.chat.android.client.api2.model.dto.UpstreamConnectedEventDto
import io.getstream.chat.android.client.api2.model.dto.UserDeletedEventDto
import io.getstream.chat.android.client.api2.model.dto.UserPresenceChangedEventDto
import io.getstream.chat.android.client.api2.model.dto.UserStartWatchingEventDto
import io.getstream.chat.android.client.api2.model.dto.UserStopWatchingEventDto
import io.getstream.chat.android.client.api2.model.dto.UserUpdatedEventDto
import io.getstream.chat.android.client.api2.model.dto.VoteCastedEventDto
import io.getstream.chat.android.client.api2.model.dto.VoteChangedEventDto
import io.getstream.chat.android.client.api2.model.dto.VoteRemovedEventDto
import io.getstream.chat.android.client.events.AIIndicatorClearEvent
import io.getstream.chat.android.client.events.AIIndicatorStopEvent
import io.getstream.chat.android.client.events.AIIndicatorUpdatedEvent
import io.getstream.chat.android.client.events.AnswerCastedEvent
import io.getstream.chat.android.client.events.ChannelDeletedEvent
import io.getstream.chat.android.client.events.ChannelHiddenEvent
import io.getstream.chat.android.client.events.ChannelTruncatedEvent
import io.getstream.chat.android.client.events.ChannelUpdatedByUserEvent
import io.getstream.chat.android.client.events.ChannelUpdatedEvent
import io.getstream.chat.android.client.events.ChannelUserBannedEvent
import io.getstream.chat.android.client.events.ChannelUserUnbannedEvent
import io.getstream.chat.android.client.events.ChannelVisibleEvent
import io.getstream.chat.android.client.events.ChatEvent
import io.getstream.chat.android.client.events.ConnectedEvent
import io.getstream.chat.android.client.events.ConnectingEvent
import io.getstream.chat.android.client.events.ConnectionErrorEvent
import io.getstream.chat.android.client.events.DisconnectedEvent
import io.getstream.chat.android.client.events.ErrorEvent
import io.getstream.chat.android.client.events.GlobalUserBannedEvent
import io.getstream.chat.android.client.events.GlobalUserUnbannedEvent
import io.getstream.chat.android.client.events.HealthEvent
import io.getstream.chat.android.client.events.MarkAllReadEvent
import io.getstream.chat.android.client.events.MemberAddedEvent
import io.getstream.chat.android.client.events.MemberRemovedEvent
import io.getstream.chat.android.client.events.MemberUpdatedEvent
import io.getstream.chat.android.client.events.MessageDeletedEvent
import io.getstream.chat.android.client.events.MessageReadEvent
import io.getstream.chat.android.client.events.MessageUpdatedEvent
import io.getstream.chat.android.client.events.NewMessageEvent
import io.getstream.chat.android.client.events.NotificationAddedToChannelEvent
import io.getstream.chat.android.client.events.NotificationChannelDeletedEvent
import io.getstream.chat.android.client.events.NotificationChannelMutesUpdatedEvent
import io.getstream.chat.android.client.events.NotificationChannelTruncatedEvent
import io.getstream.chat.android.client.events.NotificationInviteAcceptedEvent
import io.getstream.chat.android.client.events.NotificationInviteRejectedEvent
import io.getstream.chat.android.client.events.NotificationInvitedEvent
import io.getstream.chat.android.client.events.NotificationMarkReadEvent
import io.getstream.chat.android.client.events.NotificationMarkUnreadEvent
import io.getstream.chat.android.client.events.NotificationMessageNewEvent
import io.getstream.chat.android.client.events.NotificationMutesUpdatedEvent
import io.getstream.chat.android.client.events.NotificationRemovedFromChannelEvent
import io.getstream.chat.android.client.events.NotificationThreadMessageNewEvent
import io.getstream.chat.android.client.events.PollClosedEvent
import io.getstream.chat.android.client.events.PollDeletedEvent
import io.getstream.chat.android.client.events.PollUpdatedEvent
import io.getstream.chat.android.client.events.ReactionDeletedEvent
import io.getstream.chat.android.client.events.ReactionNewEvent
import io.getstream.chat.android.client.events.ReactionUpdateEvent
import io.getstream.chat.android.client.events.TypingStartEvent
import io.getstream.chat.android.client.events.TypingStopEvent
import io.getstream.chat.android.client.events.UnknownEvent
import io.getstream.chat.android.client.events.UserDeletedEvent
import io.getstream.chat.android.client.events.UserPresenceChangedEvent
import io.getstream.chat.android.client.events.UserStartWatchingEvent
import io.getstream.chat.android.client.events.UserStopWatchingEvent
import io.getstream.chat.android.client.events.UserUpdatedEvent
import io.getstream.chat.android.client.events.VoteCastedEvent
import io.getstream.chat.android.client.events.VoteChangedEvent
import io.getstream.chat.android.client.events.VoteRemovedEvent
import io.getstream.chat.android.client.extensions.cidToTypeAndId
import io.getstream.chat.android.models.UserId

internal fun ConnectedEvent.toDto(): UpstreamConnectedEventDto {
    return UpstreamConnectedEventDto(
        type = this.type,
        created_at = createdAt,
        me = me.toDto(),
        connection_id = connectionId,
    )
}

@Suppress("ComplexMethod")
internal fun ChatEventDto.toDomain(currentUserId: UserId?): ChatEvent {
    return when (this) {
        is NewMessageEventDto -> toDomain(currentUserId)
        is ChannelDeletedEventDto -> toDomain(currentUserId)
        is ChannelHiddenEventDto -> toDomain(currentUserId)
        is ChannelTruncatedEventDto -> toDomain(currentUserId)
        is ChannelUpdatedByUserEventDto -> toDomain(currentUserId)
        is ChannelUpdatedEventDto -> toDomain(currentUserId)
        is ChannelUserBannedEventDto -> toDomain(currentUserId)
        is ChannelUserUnbannedEventDto -> toDomain(currentUserId)
        is ChannelVisibleEventDto -> toDomain(currentUserId)
        is ConnectedEventDto -> toDomain(currentUserId)
        is ConnectionErrorEventDto -> toDomain()
        is ConnectingEventDto -> toDomain()
        is DisconnectedEventDto -> toDomain()
        is ErrorEventDto -> toDomain()
        is GlobalUserBannedEventDto -> toDomain(currentUserId)
        is GlobalUserUnbannedEventDto -> toDomain(currentUserId)
        is HealthEventDto -> toDomain()
        is MarkAllReadEventDto -> toDomain(currentUserId)
        is MemberAddedEventDto -> toDomain(currentUserId)
        is MemberRemovedEventDto -> toDomain(currentUserId)
        is MemberUpdatedEventDto -> toDomain(currentUserId)
        is MessageDeletedEventDto -> toDomain(currentUserId)
        is MessageReadEventDto -> toDomain(currentUserId)
        is MessageUpdatedEventDto -> toDomain(currentUserId)
        is NotificationAddedToChannelEventDto -> toDomain(currentUserId)
        is NotificationChannelDeletedEventDto -> toDomain(currentUserId)
        is NotificationChannelMutesUpdatedEventDto -> toDomain(currentUserId)
        is NotificationChannelTruncatedEventDto -> toDomain(currentUserId)
        is NotificationInviteAcceptedEventDto -> toDomain(currentUserId)
        is NotificationInviteRejectedEventDto -> toDomain(currentUserId)
        is NotificationInvitedEventDto -> toDomain(currentUserId)
        is NotificationMarkReadEventDto -> toDomain(currentUserId)
        is NotificationMarkUnreadEventDto -> toDomain(currentUserId)
        is NotificationMessageNewEventDto -> toDomain(currentUserId)
        is NotificationThreadMessageNewEventDto -> toDomain(currentUserId)
        is NotificationMutesUpdatedEventDto -> toDomain(currentUserId)
        is NotificationRemovedFromChannelEventDto -> toDomain(currentUserId)
        is ReactionDeletedEventDto -> toDomain(currentUserId)
        is ReactionNewEventDto -> toDomain(currentUserId)
        is ReactionUpdateEventDto -> toDomain(currentUserId)
        is TypingStartEventDto -> toDomain(currentUserId)
        is TypingStopEventDto -> toDomain(currentUserId)
        is UnknownEventDto -> toDomain(currentUserId)
        is UserDeletedEventDto -> toDomain(currentUserId)
        is UserPresenceChangedEventDto -> toDomain(currentUserId)
        is UserStartWatchingEventDto -> toDomain(currentUserId)
        is UserStopWatchingEventDto -> toDomain(currentUserId)
        is UserUpdatedEventDto -> toDomain(currentUserId)
        is PollClosedEventDto -> toDomain(currentUserId)
        is PollDeletedEventDto -> toDomain(currentUserId)
        is PollUpdatedEventDto -> toDomain(currentUserId)
        is VoteCastedEventDto -> toDomain(currentUserId)
        is VoteChangedEventDto -> toDomain(currentUserId)
        is AnswerCastedEventDto -> toDomain(currentUserId)
        is VoteRemovedEventDto -> toDomain(currentUserId)
        is AIIndicatorUpdatedEventDto -> toDomain(currentUserId)
        is AIIndicatorClearEventDto -> toDomain(currentUserId)
        is AIIndicatorStopEventDto -> toDomain(currentUserId)
    }
}

private fun ChannelDeletedEventDto.toDomain(currentUserId: UserId?): ChannelDeletedEvent {
    return ChannelDeletedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        channel = channel.toDomain(currentUserId, channel_last_message_at),
        user = user?.toDomain(currentUserId),
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun ChannelHiddenEventDto.toDomain(currentUserId: UserId?): ChannelHiddenEvent {
    return ChannelHiddenEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        user = user.toDomain(currentUserId),
        clearHistory = clear_history,
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun ChannelTruncatedEventDto.toDomain(currentUserId: UserId?): ChannelTruncatedEvent {
    return ChannelTruncatedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        user = user?.toDomain(currentUserId),
        message = message?.toDomain(currentUserId),
        channel = channel.toDomain(currentUserId, channel_last_message_at),
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun ChannelUpdatedEventDto.toDomain(currentUserId: UserId?): ChannelUpdatedEvent {
    return ChannelUpdatedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        message = message?.toDomain(currentUserId),
        channel = channel.toDomain(currentUserId, channel_last_message_at),
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun ChannelUpdatedByUserEventDto.toDomain(currentUserId: UserId?): ChannelUpdatedByUserEvent {
    return ChannelUpdatedByUserEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        user = user.toDomain(currentUserId),
        message = message?.toDomain(currentUserId),
        channel = channel.toDomain(currentUserId, channel_last_message_at),
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun ChannelVisibleEventDto.toDomain(currentUserId: UserId?): ChannelVisibleEvent {
    return ChannelVisibleEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        user = user.toDomain(currentUserId),
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun HealthEventDto.toDomain(): HealthEvent {
    return HealthEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        connectionId = connection_id,
    )
}

private fun MemberAddedEventDto.toDomain(currentUserId: UserId?): MemberAddedEvent {
    return MemberAddedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        user = user.toDomain(currentUserId),
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        member = member.toDomain(currentUserId),
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun MemberRemovedEventDto.toDomain(currentUserId: UserId?): MemberRemovedEvent {
    return MemberRemovedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        user = user.toDomain(currentUserId),
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        member = member.toDomain(currentUserId),
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun MemberUpdatedEventDto.toDomain(currentUserId: UserId?): MemberUpdatedEvent {
    return MemberUpdatedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        user = user.toDomain(currentUserId),
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        member = member.toDomain(currentUserId),
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun MessageDeletedEventDto.toDomain(currentUserId: UserId?): MessageDeletedEvent {
    // TODO review createdAt and deletedAt fields here
    return MessageDeletedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        user = user?.toDomain(currentUserId),
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        message = message.toDomain(currentUserId),
        hardDelete = hard_delete ?: false,
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun MessageReadEventDto.toDomain(currentUserId: UserId?): MessageReadEvent {
    return MessageReadEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        user = user.toDomain(currentUserId),
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        thread = thread?.toDomain(currentUserId),
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun MessageUpdatedEventDto.toDomain(currentUserId: UserId?): MessageUpdatedEvent {
    return MessageUpdatedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        user = user.toDomain(currentUserId),
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        message = message.toDomain(currentUserId),
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun NewMessageEventDto.toDomain(currentUserId: UserId?): NewMessageEvent {
    return NewMessageEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        user = user.toDomain(currentUserId),
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        message = message.toDomain(currentUserId),
        watcherCount = watcher_count,
        totalUnreadCount = total_unread_count,
        unreadChannels = unread_channels,
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun NotificationAddedToChannelEventDto.toDomain(currentUserId: UserId?): NotificationAddedToChannelEvent {
    return NotificationAddedToChannelEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        channel = channel.toDomain(currentUserId, channel_last_message_at),
        member = member.toDomain(currentUserId),
        totalUnreadCount = total_unread_count,
        unreadChannels = unread_channels,
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun NotificationChannelDeletedEventDto.toDomain(currentUserId: UserId?): NotificationChannelDeletedEvent {
    return NotificationChannelDeletedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        channel = channel.toDomain(currentUserId, channel_last_message_at),
        totalUnreadCount = total_unread_count,
        unreadChannels = unread_channels,
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun NotificationChannelMutesUpdatedEventDto.toDomain(
    currentUserId: UserId?,
): NotificationChannelMutesUpdatedEvent {
    return NotificationChannelMutesUpdatedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        me = me.toDomain(currentUserId),
    )
}

private fun NotificationChannelTruncatedEventDto.toDomain(currentUserId: UserId?): NotificationChannelTruncatedEvent {
    return NotificationChannelTruncatedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        channel = channel.toDomain(currentUserId, channel_last_message_at),
        totalUnreadCount = total_unread_count,
        unreadChannels = unread_channels,
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun NotificationInviteAcceptedEventDto.toDomain(currentUserId: UserId?): NotificationInviteAcceptedEvent {
    return NotificationInviteAcceptedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        user = user.toDomain(currentUserId),
        member = member.toDomain(currentUserId),
        channel = channel.toDomain(currentUserId, channel_last_message_at),
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun NotificationInviteRejectedEventDto.toDomain(currentUserId: UserId?): NotificationInviteRejectedEvent {
    return NotificationInviteRejectedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        user = user.toDomain(currentUserId),
        member = member.toDomain(currentUserId),
        channel = channel.toDomain(currentUserId, channel_last_message_at),
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun NotificationInvitedEventDto.toDomain(currentUserId: UserId?): NotificationInvitedEvent {
    return NotificationInvitedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        user = user.toDomain(currentUserId),
        member = member.toDomain(currentUserId),
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun NotificationMarkReadEventDto.toDomain(currentUserId: UserId?): NotificationMarkReadEvent {
    return NotificationMarkReadEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        user = user.toDomain(currentUserId),
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        totalUnreadCount = total_unread_count,
        unreadChannels = unread_channels,
        threadId = thread_id,
        thread = thread?.toDomain(currentUserId),
        unreadThreads = unread_threads,
        unreadThreadMessages = unread_thread_messages,
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun NotificationMarkUnreadEventDto.toDomain(currentUserId: UserId?): NotificationMarkUnreadEvent {
    return NotificationMarkUnreadEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        user = user.toDomain(currentUserId),
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        totalUnreadCount = total_unread_count,
        unreadChannels = unread_channels,
        firstUnreadMessageId = first_unread_message_id,
        lastReadMessageId = last_read_message_id,
        lastReadMessageAt = last_read_at.date,
        unreadMessages = unread_messages,
        threadId = thread_id,
        unreadThreads = unread_threads,
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun MarkAllReadEventDto.toDomain(currentUserId: UserId?): MarkAllReadEvent {
    return MarkAllReadEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        user = user.toDomain(currentUserId),
        totalUnreadCount = total_unread_count,
        unreadChannels = unread_channels,
    )
}

private fun NotificationMessageNewEventDto.toDomain(currentUserId: UserId?): NotificationMessageNewEvent {
    return NotificationMessageNewEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        channel = channel.toDomain(currentUserId, channel_last_message_at),
        message = message.toDomain(currentUserId),
        totalUnreadCount = total_unread_count,
        unreadChannels = unread_channels,
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun NotificationThreadMessageNewEventDto.toDomain(currentUserId: UserId?): NotificationThreadMessageNewEvent {
    return NotificationThreadMessageNewEvent(
        type = type,
        cid = cid,
        channelId = channel_id,
        channelType = channel_type,
        message = message.toDomain(currentUserId),
        channel = channel.toDomain(currentUserId, channel_last_message_at),
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        unreadThreads = unread_threads,
        unreadThreadMessages = unread_thread_messages,
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun NotificationMutesUpdatedEventDto.toDomain(currentUserId: UserId?): NotificationMutesUpdatedEvent {
    return NotificationMutesUpdatedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        me = me.toDomain(currentUserId),
    )
}

private fun NotificationRemovedFromChannelEventDto.toDomain(
    currentUserId: UserId?,
): NotificationRemovedFromChannelEvent {
    return NotificationRemovedFromChannelEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        user = user?.toDomain(currentUserId),
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        channel = channel.toDomain(currentUserId, channel_last_message_at),
        member = member.toDomain(currentUserId),
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun ReactionDeletedEventDto.toDomain(currentUserId: UserId?): ReactionDeletedEvent {
    return ReactionDeletedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        user = user.toDomain(currentUserId),
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        message = message.toDomain(currentUserId),
        reaction = reaction.toDomain(currentUserId),
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun ReactionNewEventDto.toDomain(currentUserId: UserId?): ReactionNewEvent {
    return ReactionNewEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        user = user.toDomain(currentUserId),
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        message = message.toDomain(currentUserId),
        reaction = reaction.toDomain(currentUserId),
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun ReactionUpdateEventDto.toDomain(currentUserId: UserId?): ReactionUpdateEvent {
    return ReactionUpdateEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        user = user.toDomain(currentUserId),
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        message = message.toDomain(currentUserId),
        reaction = reaction.toDomain(currentUserId),
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun TypingStartEventDto.toDomain(currentUserId: UserId?): TypingStartEvent {
    return TypingStartEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        user = user.toDomain(currentUserId),
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        parentId = parent_id,
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun TypingStopEventDto.toDomain(currentUserId: UserId?): TypingStopEvent {
    return TypingStopEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        user = user.toDomain(currentUserId),
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        parentId = parent_id,
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun ChannelUserBannedEventDto.toDomain(currentUserId: UserId?): ChannelUserBannedEvent {
    return ChannelUserBannedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        user = user.toDomain(currentUserId),
        expiration = expiration,
        shadow = shadow ?: false,
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun GlobalUserBannedEventDto.toDomain(currentUserId: UserId?): GlobalUserBannedEvent {
    return GlobalUserBannedEvent(
        type = type,
        user = user.toDomain(currentUserId),
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
    )
}

private fun UserDeletedEventDto.toDomain(currentUserId: UserId?): UserDeletedEvent {
    return UserDeletedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        user = user.toDomain(currentUserId),
    )
}

private fun UserPresenceChangedEventDto.toDomain(currentUserId: UserId?): UserPresenceChangedEvent {
    return UserPresenceChangedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        user = user.toDomain(currentUserId),
    )
}

private fun UserStartWatchingEventDto.toDomain(currentUserId: UserId?): UserStartWatchingEvent {
    return UserStartWatchingEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        cid = cid,
        watcherCount = watcher_count,
        channelType = channel_type,
        channelId = channel_id,
        user = user.toDomain(currentUserId),
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun UserStopWatchingEventDto.toDomain(currentUserId: UserId?): UserStopWatchingEvent {
    return UserStopWatchingEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        cid = cid,
        watcherCount = watcher_count,
        channelType = channel_type,
        channelId = channel_id,
        user = user.toDomain(currentUserId),
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun ChannelUserUnbannedEventDto.toDomain(currentUserId: UserId?): ChannelUserUnbannedEvent {
    return ChannelUserUnbannedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        user = user.toDomain(currentUserId),
        cid = cid,
        channelType = channel_type,
        channelId = channel_id,
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun GlobalUserUnbannedEventDto.toDomain(currentUserId: UserId?): GlobalUserUnbannedEvent {
    return GlobalUserUnbannedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        user = user.toDomain(currentUserId),
    )
}

private fun UserUpdatedEventDto.toDomain(currentUserId: UserId?): UserUpdatedEvent {
    return UserUpdatedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        user = user.toDomain(currentUserId),
    )
}

private fun PollClosedEventDto.toDomain(currentUserId: UserId?): PollClosedEvent {
    val newPoll = poll.toDomain(currentUserId)
    val (channelType, channelId) = cid.cidToTypeAndId()
    return PollClosedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        cid = cid,
        channelType = channelType,
        channelId = channelId,
        poll = newPoll,
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun PollDeletedEventDto.toDomain(currentUserId: UserId?): PollDeletedEvent {
    val newPoll = poll.toDomain(currentUserId)
    val (channelType, channelId) = cid.cidToTypeAndId()
    return PollDeletedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        cid = cid,
        channelType = channelType,
        channelId = channelId,
        poll = newPoll,
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun PollUpdatedEventDto.toDomain(currentUserId: UserId?): PollUpdatedEvent {
    val newPoll = poll.toDomain(currentUserId)
    val (channelType, channelId) = cid.cidToTypeAndId()
    return PollUpdatedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        cid = cid,
        channelType = channelType,
        channelId = channelId,
        poll = newPoll,
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun VoteCastedEventDto.toDomain(currentUserId: UserId?): VoteCastedEvent {
    val pollVote = poll_vote.toDomain(currentUserId)
    val (channelType, channelId) = cid.cidToTypeAndId()
    val newPoll = poll.toDomain(currentUserId)
        .let { poll ->
            pollVote.takeIf { it.user?.id == currentUserId }
                ?.let {
                    poll.copy(
                        votes = (poll.votes.associateBy { it.id } + (it.id to it)).values.toList(),
                        ownVotes = (poll.ownVotes.associateBy { it.id } + (it.id to it)).values.toList(),
                    )
                } ?: poll
        }
    return VoteCastedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        cid = cid,
        channelType = channelType,
        channelId = channelId,
        poll = newPoll,
        newVote = pollVote,
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun AnswerCastedEventDto.toDomain(currentUserId: UserId?): AnswerCastedEvent {
    val newAnswer = poll_vote.toAnswerDomain(currentUserId)
    val (channelType, channelId) = cid.cidToTypeAndId()
    return AnswerCastedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        cid = cid,
        channelType = channelType,
        channelId = channelId,
        poll = poll.toDomain(currentUserId),
        newAnswer = newAnswer,
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun VoteChangedEventDto.toDomain(currentUserId: UserId?): VoteChangedEvent {
    val pollVote = poll_vote.toDomain(currentUserId)
    val (channelType, channelId) = cid.cidToTypeAndId()
    val newPoll = poll.toDomain(currentUserId)
        .let { poll ->
            pollVote.takeIf { it.user?.id == currentUserId }
                ?.let {
                    poll.copy(
                        votes = (poll.votes.associateBy { it.id } + (it.id to it)).values.toList(),
                        ownVotes = (poll.ownVotes.associateBy { it.id } + (it.id to it)).values.toList(),
                    )
                } ?: poll
        }
    return VoteChangedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        cid = cid,
        channelType = channelType,
        channelId = channelId,
        poll = newPoll,
        newVote = pollVote,
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun VoteRemovedEventDto.toDomain(currentUserId: UserId?): VoteRemovedEvent {
    val removedVote = poll_vote.toDomain(currentUserId)
    val (channelType, channelId) = cid.cidToTypeAndId()
    val newPoll = poll.toDomain(currentUserId)
    return VoteRemovedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        cid = cid,
        channelType = channelType,
        channelId = channelId,
        poll = newPoll,
        removedVote = removedVote,
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun AIIndicatorUpdatedEventDto.toDomain(currentUserId: UserId?): AIIndicatorUpdatedEvent {
    val (channelType, channelId) = cid.cidToTypeAndId()
    return AIIndicatorUpdatedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        cid = cid,
        user = user.toDomain(currentUserId),
        channelType = channelType,
        channelId = channelId,
        channelLastMessageAt = channel_last_message_at,
        aiState = ai_state,
        messageId = message_id,
    )
}

private fun AIIndicatorClearEventDto.toDomain(currentUserId: UserId?): AIIndicatorClearEvent {
    val (channelType, channelId) = cid.cidToTypeAndId()
    return AIIndicatorClearEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        user = user.toDomain(currentUserId),
        cid = cid,
        channelType = channelType,
        channelId = channelId,
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun AIIndicatorStopEventDto.toDomain(currentUserId: UserId?): AIIndicatorStopEvent {
    val (channelType, channelId) = cid.cidToTypeAndId()
    return AIIndicatorStopEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        cid = cid,
        user = user.toDomain(currentUserId),
        channelType = channelType,
        channelId = channelId,
        channelLastMessageAt = channel_last_message_at,
    )
}

private fun ConnectedEventDto.toDomain(currentUserId: UserId?): ConnectedEvent {
    return ConnectedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        me = me.toDomain(currentUserId),
        connectionId = connection_id,
    )
}

private fun ConnectionErrorEventDto.toDomain(): ConnectionErrorEvent {
    return ConnectionErrorEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        connectionId = connection_id,
        error = error.toDomain(),
    )
}

private fun ConnectingEventDto.toDomain(): ConnectingEvent {
    return ConnectingEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
    )
}

private fun DisconnectedEventDto.toDomain(): DisconnectedEvent {
    return DisconnectedEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
    )
}

private fun ErrorEventDto.toDomain(): ErrorEvent {
    return ErrorEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        error = error,
    )
}

private fun UnknownEventDto.toDomain(currentUserId: UserId?): UnknownEvent {
    return UnknownEvent(
        type = type,
        createdAt = created_at.date,
        rawCreatedAt = created_at.rawDate,
        user = user?.toDomain(currentUserId),
        rawData = rawData,
    )
}
