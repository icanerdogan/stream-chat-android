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

package io.getstream.chat.android.client.api2.mapping

import io.getstream.chat.android.client.api2.model.dto.AttachmentDto
import io.getstream.chat.android.client.api2.model.dto.DownstreamMessageDto
import io.getstream.chat.android.client.api2.model.dto.DownstreamReactionDto
import io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto
import io.getstream.chat.android.client.api2.model.dto.UpstreamMessageDto
import io.getstream.chat.android.models.Attachment
import io.getstream.chat.android.models.Message
import io.getstream.chat.android.models.User
import io.getstream.openapi.models.StreamChatAttachment
import io.getstream.openapi.models.StreamChatMessage
import io.getstream.openapi.models.StreamChatMessageRequest
import io.getstream.openapi.models.StreamChatUserObject

internal fun Message.toDtoOld(): UpstreamMessageDto =
    UpstreamMessageDto(
        attachments = attachments.map(Attachment::toDtoOld),
        cid = cid,
        command = command,
        html = html,
        id = id,
        mentioned_users = mentionedUsersIds,
        parent_id = parentId,
        pin_expires = pinExpires,
        pinned = pinned,
        pinned_at = pinnedAt,
        pinned_by = pinnedBy?.toDtoOld(),
        quoted_message_id = replyMessageId,
        shadowed = shadowed,
        show_in_channel = showInChannel,
        silent = silent,
        text = text,
        thread_participants = threadParticipants.map(User::toDtoOld),
        extraData = extraData,
    )

internal fun Message.toDto(): StreamChatMessageRequest =
    StreamChatMessageRequest(
        attachments = attachments.map(Attachment::toDto),
        id = id,
        mentioned_users = mentionedUsersIds,
        parent_id = parentId,
        pin_expires = pinExpires,
        pinned = pinned,
        pinned_at = pinnedAt,
        quoted_message_id = replyMessageId,
        show_in_channel = showInChannel,
        silent = silent,
        text = text,
    )

internal fun DownstreamMessageDto.toDomain(): Message =
    Message(
        attachments = attachments.mapTo(mutableListOf(), AttachmentDto::toDomain),
        channelInfo = channel?.toDomain(),
        cid = cid,
        command = command,
        createdAt = created_at,
        deletedAt = deleted_at,
        html = html,
        i18n = i18n,
        id = id,
        latestReactions = latest_reactions.mapTo(mutableListOf(), DownstreamReactionDto::toDomain),
        mentionedUsers = mentioned_users.mapTo(mutableListOf(), DownstreamUserDto::toDomain),
        ownReactions = own_reactions.mapTo(mutableListOf(), DownstreamReactionDto::toDomain),
        parentId = parent_id,
        pinExpires = pin_expires,
        pinned = pinned,
        pinnedAt = pinned_at,
        pinnedBy = pinned_by?.toDomain(),
        reactionCounts = reaction_counts.orEmpty().toMutableMap(),
        reactionScores = reaction_scores.orEmpty().toMutableMap(),
        replyCount = reply_count,
        deletedReplyCount = deleted_reply_count,
        replyMessageId = quoted_message_id,
        replyTo = quoted_message?.toDomain(),
        shadowed = shadowed,
        showInChannel = show_in_channel,
        silent = silent,
        text = text,
        threadParticipants = thread_participants.map(DownstreamUserDto::toDomain),
        type = type,
        updatedAt = updated_at,
        user = user.toDomain(),
        moderationDetails = moderation_details?.toDomain(),
        extraData = extraData.toMutableMap(),
    )


internal fun StreamChatMessage.toDomain(): Message =
    Message(
        attachments = attachments.mapTo(mutableListOf(), { it -> it!!.toDomain()}),
        //TODO: this is missing in the spec
        //channelInfo = channel?.toDomain(),
        channelInfo = null,
        cid = cid,
        command = command,
        createdAt = created_at,
        deletedAt = deleted_at,
        html = html,
        i18n = i18n.orEmpty(),
        id = id,
        //TODO: list shouldn't contain nullable items
        latestReactions = latest_reactions.mapTo(mutableListOf(), { it -> it!!.toDomain()}),
        //TODO: list shouldn't contain nullable items
        mentionedUsers = mentioned_users.mapTo(mutableListOf(), { it -> it.toDomain()}),
        //TODO: list shouldn't contain nullable items
        ownReactions = own_reactions.mapTo(mutableListOf(), { it -> it!!.toDomain()}),
        parentId = parent_id,
        pinExpires = pin_expires,
        pinned = pinned,
        pinnedAt = pinned_at,
        pinnedBy = pinned_by?.toDomain(),
        reactionCounts = reaction_counts.orEmpty().toMutableMap(),
        reactionScores = reaction_scores.orEmpty().toMutableMap(),
        replyCount = reply_count,
        deletedReplyCount = deleted_reply_count,
        replyMessageId = quoted_message_id,
        replyTo = quoted_message?.toDomain(),
        shadowed = shadowed,
        showInChannel = show_in_channel ?: false,
        silent = silent,
        text = text,
        threadParticipants = thread_participants.orEmpty().map(StreamChatUserObject::toDomain),
        type = type,
        updatedAt = updated_at,
        //TODO: user is not expected to be nullable
        user = user!!.toDomain(),
        //TODO: missing in spec
        //moderationDetails = moderation_details?.toDomain(),
        extraData = custom.toMutableMap(),
    )