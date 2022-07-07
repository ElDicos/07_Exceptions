package ru.netology

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {

    @Before
    fun clearPosts() {
        WallService.clearPostsForTest()
    }

    @Test
    fun add_shouldIdNotEqualsZero() {
        var array = emptyArray<Attachment>()
        array.plus(PhotoAttachment("photo", Photo()))
        val post = Post()
        val testPost = WallService.add(post)
        WallService.add(post)

        val expectedResult = 0

        assertNotEquals(expectedResult, testPost.id)
    }

    @Test
    fun update_shouldTrueCorrect() {
        var array = emptyArray<Attachment>()
        array.plus(VideoAttachment("Video", Video()))
        val post = Post()
        val postUpdate = Post(id = 1)

        WallService.add(post)
        WallService.add(post)
        WallService.add(post)

        WallService.update(postUpdate)

        val result = WallService.update(postUpdate)

        assertTrue(result)
    }

    @Test
    fun update_shouldFalseCorrect() {
        var array = emptyArray<Attachment>()
        array.plus(PhotoAttachment("photo", Photo()))
        val post = Post()
        val postUpdate = Post(id = 100)

        WallService.add(post)
        WallService.add(post)
        WallService.add(post)

        WallService.update(postUpdate)

        val result = WallService.update(postUpdate)

        assertFalse(result)
    }

    @Test
    fun findById_shouldTrueCorrect() {
        WallService.add(Post())

        val expectedResultTrue = WallService.findById(1)

        assertTrue(expectedResultTrue)
    }

    @Test
    fun findById_shouldFalseCorrect() {
        WallService.add(Post())

        val expectedResultTrue = WallService.findById(2)

        assertFalse(expectedResultTrue)
    }
}



