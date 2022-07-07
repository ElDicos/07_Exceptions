package ru.netology

import java.util.*

data class Post(
    val id: Int = 0,
    val ownerId: Int = 0,
    val fromId: Int = 0,
    val createdBy: Int = 0,
    val date: Int = 0,
    val text: String = "TestText",
    val replyOwnerId: Int = 0,
    val replyPostId: Int = 0,
    val friendsOnly: Boolean = true,
    val comments: Any = 0,
    val copyright: Any = 0,
    val likes: Any = 0,
    val reports: Any = 0,
    val views: Int = 0,
    val postType: String = "Default",
    val postSource: Any?,
    val attachments: Array<Attachment>,
    val geo: Any?,
    val singerId: Int = 0,
    val copyHistory: Array<Any>?,
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Any = 0,
    val markedAsAds: Boolean = true,
    val isFavorite: Boolean = true,
    val donut: Any = 0,
    val postponedId: Int = 0,
) {
}
