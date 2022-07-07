package ru.netology

abstract class Attachment(open val type: String, attachment: Any) {
}

fun getAttachment(attachment: Attachment): Attachment {
    when (attachment.type) {
        "photo" -> attachment as PhotoAttachment
        "video" -> attachment as VideoAttachment
        "audio" -> attachment as AudioAttachment
        "doc" -> attachment as DocAttachment
        "link" -> attachment as LinkAttachment
    }
    return attachment
}


data class PhotoAttachment(
    override val type: String = "photo",
    val attachment: Photo,
) : Attachment(type, attachment) {
}

data class VideoAttachment(
    override val type: String = "video",
    val attachment: Video,
) : Attachment(type, attachment) {
}

data class AudioAttachment(
    override val type: String = "audio",
    val attachment: Audio,
) : Attachment(type, attachment) {
}

data class DocAttachment(
    override val type: String = "doc",
    val attachment: Doc,
) : Attachment(type, attachment) {
}

data class LinkAttachment(
    override val type: String = "link",
    val attachment: Link,
) : Attachment(type, attachment) {
}


