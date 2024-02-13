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

import io.getstream.chat.android.client.api2.model.dto.DownstreamFlagDto
import io.getstream.chat.android.models.Flag
import io.getstream.openapi.models.StreamChatFlag

internal fun DownstreamFlagDto.toDomain(): Flag {
    return Flag(
        user = user.toDomain(),
        targetUser = target_user?.toDomain(),
        targetMessageId = target_message_id,
        createdByAutomod = created_by_automod,
        createdAt = approved_at,
        updatedAt = updated_at,
        reviewedAt = reviewed_at,
        approvedAt = approved_at,
        rejectedAt = rejected_at,
    )
}

internal fun StreamChatFlag.toDomain(): Flag {
    return Flag(
        //TODO: shouldn't be null
        user = user!!.toDomain(),
        targetUser = target_user?.toDomain(),
        //TODO: shouldn't be null
        targetMessageId = target_message_id!!,
        createdByAutomod = created_by_automod,
        createdAt = approved_at,
        updatedAt = updated_at,
        reviewedAt = reviewed_at,
        approvedAt = approved_at,
        rejectedAt = rejected_at,
    )
}