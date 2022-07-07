package ru.netology

import ru.netology.exceptions.PostNotFoundException

object WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        var newId = 1
        for (postId in posts)
            if (postId.id >= newId) {
                newId = postId.id + 1
            }
        val newPost = post.copy(id = newId)
        posts += newPost
        return newPost
    }

    fun update(post: Post): Boolean {
        for ((index, postId) in posts.withIndex())
            if (post.id == postId.id) {
                val (
                    id, _, fromId, createdBy, _, text, replyOwnerId,
                    replyPostId, friendsOnly, comments, copyright, likes,
                    reports, views, postType, postSource, attachments, geo, singerId,
                    copyHistory, canPin, canDelete, canEdit, isPinned,
                    markedAsAds, isFavorite, donut, postponedId,
                ) = post
                posts[index].copy(
                    id = id,
                    fromId = fromId,
                    createdBy = createdBy,
                    text = text,
                    replyOwnerId = replyOwnerId,
                    replyPostId = replyPostId,
                    friendsOnly = friendsOnly,
                    comments = comments,
                    copyright = copyright,
                    likes = likes,
                    reports = reports,
                    views = views,
                    postType = postType,
                    postSource = postSource,
                    attachments = attachments,
                    geo = geo,
                    singerId = singerId,
                    copyHistory = copyHistory,
                    canPin = canPin,
                    canDelete = canDelete,
                    canEdit = canEdit,
                    isPinned = isPinned,
                    markedAsAds = markedAsAds,
                    isFavorite = isFavorite,
                    donut = donut,
                    postponedId = postponedId
                )
                return true
            }
        return false
    }

    fun createComment(postId: Int, comment: Comment): Comment {
        if (findById(postId)) {
            comments += comment
            return comment
        } else throw PostNotFoundException("Post with given id not found")
    }

    fun findById(postId: Int): Boolean {
        for (searchedId in posts) {
            if (searchedId.id == postId) return true
        }
        return false
    }

    fun clearPostsForTest() {
        posts = emptyArray()
    }
}