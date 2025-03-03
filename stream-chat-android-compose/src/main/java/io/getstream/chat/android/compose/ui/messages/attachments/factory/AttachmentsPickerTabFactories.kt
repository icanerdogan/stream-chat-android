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

package io.getstream.chat.android.compose.ui.messages.attachments.factory

/**
 * Provides different attachment picker tab factories that build tab icons and tab contents for
 * the attachment picker.
 */
public object AttachmentsPickerTabFactories {

    @Deprecated(
        message = "Use defaultFactoriesWithoutStoragePermissions(filesAllowed: Boolean, mediaAllowed: Boolean = true," +
            " captureImageAllowed: Boolean, captureVideoAllowed: Boolean, pollAllowed: Boolean = true) instead.",
        replaceWith = ReplaceWith(
            expression = "defaultFactoriesWithoutStoragePermissions(filesAllowed, mediaAllowed, captureImageAllowed," +
                " captureVideoAllowed, pollAllowed)",
        ),
        level = DeprecationLevel.WARNING,
    )
    public fun defaultFactoriesWithoutStoragePermissions(): List<AttachmentsPickerTabFactory> {
        val otherFactories = defaultFactories(
            imagesTabEnabled = false,
            filesTabEnabled = false,
            takeImageEnabled = true,
            recordVideoEnabled = true,
            pollEnabled = true,
        )
        return listOf(AttachmentsPickerSystemTabFactory(otherFactories))
    }

    /**
     * Builds the default list of attachment picker tab factories (without requesting storage permission).
     *
     * @param filesAllowed If the option to pick files is included in the attachments picker.
     * @param mediaAllowed If the option to pick media (images/videos) is included in the attachments picker.
     * @param captureImageAllowed If the option to capture an image is included in the attachments picker.
     * @param captureVideoAllowed If the option to capture a video is included in the attachments picker.
     * @param pollAllowed If the option to create a poll is included in the attachments picker.
     */
    public fun defaultFactoriesWithoutStoragePermissions(
        filesAllowed: Boolean = true,
        mediaAllowed: Boolean = true,
        captureImageAllowed: Boolean = true,
        captureVideoAllowed: Boolean = true,
        pollAllowed: Boolean = true,
    ): List<AttachmentsPickerTabFactory> {
        val factory = AttachmentsPickerSystemTabFactory(
            filesAllowed = filesAllowed,
            mediaAllowed = mediaAllowed,
            captureImageAllowed = captureImageAllowed,
            captureVideoAllowed = captureVideoAllowed,
            pollAllowed = pollAllowed,
        )
        return listOf(factory)
    }

    /**
     * Builds the default list of attachment picker tab factories.
     *
     * @param imagesTabEnabled If the factory that allows users to pick images is included in the resulting list.
     * @param filesTabEnabled If the factory that allows users to pick files is included in the resulting list.
     * @param takeImageEnabled If the factory that allows users to start image capture is included in the resulting list.
     * @param recordVideoEnabled If the factory that allows users to start video capture is included in the resulting list.
     * @param pollEnabled If the factory that allows users to create a poll.
     * @return The default list of attachment picker tab factories.
     */
    public fun defaultFactories(
        imagesTabEnabled: Boolean = true,
        filesTabEnabled: Boolean = true,
        takeImageEnabled: Boolean = true,
        recordVideoEnabled: Boolean = true,
        pollEnabled: Boolean = true,
    ): List<AttachmentsPickerTabFactory> {
        return listOfNotNull(
            if (imagesTabEnabled) AttachmentsPickerImagesTabFactory() else null,
            if (filesTabEnabled) AttachmentsPickerFilesTabFactory() else null,
            when {
                takeImageEnabled && recordVideoEnabled ->
                    AttachmentsPickerMediaCaptureTabFactory(
                        AttachmentsPickerMediaCaptureTabFactory.PickerMediaMode.PHOTO_AND_VIDEO,
                    )

                takeImageEnabled ->
                    AttachmentsPickerMediaCaptureTabFactory(
                        AttachmentsPickerMediaCaptureTabFactory.PickerMediaMode.PHOTO,
                    )

                recordVideoEnabled ->
                    AttachmentsPickerMediaCaptureTabFactory(
                        AttachmentsPickerMediaCaptureTabFactory.PickerMediaMode.VIDEO,
                    )

                else -> null
            },
            if (pollEnabled) AttachmentsPickerPollTabFactory() else null,
        )
    }
}
