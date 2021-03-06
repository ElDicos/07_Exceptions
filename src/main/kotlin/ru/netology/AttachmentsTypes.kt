package ru.netology

data class Photo(
    val id: Int = 1,
    val album_id: Int = 1,
    val owner_id: Int = 1,
    val user_id: Int = 1,
    val text: String = "Description Photo",
    val date: Int = 1,
    val sizes: Array<Any> = emptyArray(),
    val width: Int = 1,
    val height: Int = 1,
) {}

data class Video(
    val id: Int = 1,
    val owner_id: Int = 1,
    val title: String = "Title",
    val description: String = "Default Video",
    val duration: Int = 1,
    val image: Array<Any> = emptyArray(),
    val firstFrame: Array<Any> = emptyArray(),
    val date: Int = 1,
    val addingDate: Int = 1,
    val views: Int = 1,
    val localViews: Int = 1,
    val comments: Int = 1,
    val player: String = "Default",
    val platform: String = "Default",
    val canAdd: Boolean = true,
    val isPrivate: Boolean = true,
    val accessKey: String = "Default",
    val processing: Boolean = true,
    val isFavorite: Boolean = true,
    val canComment: Boolean = true,
    val canEdit: Boolean = true,
    val canLike: Boolean = true,
    val canRepost: Boolean = true,
    val canSubscribe: Boolean = true,
    val canAddToFaves: Boolean = true,
    val canAttachLink: Boolean = true,
    val width: Int = 1,
    val height: Int = 1,
    val userId: Int = 1,
    val converting: Boolean = true,
    val added: Boolean = true,
    val isSubscribed: Boolean = true,
    val repeat: Boolean = true,
    val type: String = "Default",
    val balance: Int = 1,
    val liveStatus: String = "upcoming",
    val live: Boolean = true,
    val upcoming: Boolean = true,
    val spectators: Int = 1,
    val likes: Any = 1,
    val reposts: Any = 1,
) {}

data class Audio(
    val id: Int = 1,
    val ownerId: Int = 1,
    val artist: String = "Default",
    val title: String = "Default",
    val duration: Int = 1,
    val url: String = "Default",
    val lyricsId: Int = 1,
    val albumId: Int = 1,
    val genreId: Int = 1,
    val date: Int = 1,
    val noSearch: Boolean = true,
    val isHq: Boolean = true,
) {}

data class Doc(
    val id: Int = 1,
    val ownerId: Int = 1,
    val title: String = "Default",
    val size: Int = 1,
    val ext: String = "Default",
    val url: String = "Default",
    val date: Int = 1,
    val type: Int = 1,
    val preview: Any = 1,
) {}

data class Link(
    val url: String = "Default",
    val title: String = "Default",
    val caption: String = "Default",
    val description: String = "Default",
    val photo: Any = 1,
    val product: Any = 1,
    val button: Any = 1,
    val previewPage: String = "Default",
    val previewUrl: String = "Default",
)
