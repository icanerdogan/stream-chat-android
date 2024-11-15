/*
 * Copyright (c) 2014-2024 Stream.io Inc. All rights reserved.
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

package io.getstream.chat.android.compose.robots

import io.getstream.chat.android.compose.pages.MessageListPage.MessageList.Message
import io.getstream.chat.android.compose.uiautomator.exists
import io.getstream.chat.android.compose.uiautomator.waitToAppear
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertTrue

fun UserRobot.assertMessage(text: String): UserRobot {
    assertEquals(text, Message.text.waitToAppear().text)
    assertTrue(Message.timestamp.exists())
    return this
}

fun UserRobot.assertMessageAuthor(isCurrentUser: Boolean): UserRobot {
    assertNotEquals(isCurrentUser, Message.authorName.exists())
    assertNotEquals(isCurrentUser, Message.avatar.exists())
    return this
}