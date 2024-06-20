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

package io.getstream.chat.android.compose.ui.components.blocks

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.getstream.chat.android.compose.previewdata.PreviewUserData
import io.getstream.chat.android.compose.ui.components.avatar.UserAvatar
import io.getstream.chat.android.compose.ui.theme.ChatTheme
import io.getstream.chat.android.models.User

@Composable
public fun BlockedUsersListScreen(users: List<User>) {
    var isEditing by remember { mutableStateOf(false) }

    Scaffold(topBar = {
        TopAppBar(title = { Text("Blocked Users") }, navigationIcon = {
            IconButton(onClick = { /* Handle back navigation */ }) {
                Icon(Icons.Default.ArrowBack, contentDescription = "Back")
            }
        }, actions = {
            TextButton(onClick = { isEditing = !isEditing }) {
                Text("Edit")
            }
        })
    }) { padding: PaddingValues ->
        BlockedUsersList(modifier = Modifier.padding(padding), users = users, isEditing = isEditing)
    }
}

@Composable
public fun BlockedUsersList(modifier: Modifier = Modifier, users: List<User>, isEditing: Boolean, onDelete: (User) -> Unit = {}) {
    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(vertical = 8.dp),
    ) {
        items(key = { it.id }, items = users) { user ->
            UserRow(user = user, isEditing = isEditing, onDelete = onDelete)
        }
    }
}

@Composable
internal fun UserRow(user: User, isEditing: Boolean, onDelete: (User) -> Unit = {}) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp, horizontal = 16.dp),
    ) {
        if (isEditing) {
            IconButton(onClick = { onDelete(user) }) {
                Icon(Icons.Default.Delete, tint = ChatTheme.colors.errorAccent, contentDescription = "Delete")
            }
        }
        UserAvatar(modifier = Modifier.size(36.dp), user = user)
        Spacer(modifier = Modifier.width(16.dp))
        Text(user.name, fontSize = 20.sp)
    }
}

@Preview
@Composable
private fun UserRowPreview() {
    ChatTheme {
        UserRow(user = PreviewUserData.user1, isEditing = false)
    }
}

@Preview
@Composable
private fun UserRowEditingPreview() {
    ChatTheme {
        UserRow(user = PreviewUserData.user1, isEditing = true)
    }
}

@Preview
@Composable
private fun BlockedUsersListPreview() {
    ChatTheme {
        BlockedUsersList(users = PreviewUserData.users, isEditing = false)
    }
}

@Preview
@Composable
private fun BlockedUsersListEditingPreview() {
    ChatTheme {
        BlockedUsersList(users = PreviewUserData.users, isEditing = true)
    }
}
