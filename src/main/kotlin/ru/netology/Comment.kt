package ru.netology

data class Comment(
    val id: Int = 1,
    val fromId: Int = 1,
    val date: Int = 1,
    val text: String = "Default",
    val donut: Any = 1,
    val replyToUser: Int = 1,
    val replyTo_comment: Int = 1,
    val attachment: Attachment = PhotoAttachment(attachment = Photo()),
    val parentsStack: Array<Any> = emptyArray(),
    val thread: Any = 1,
) {
}