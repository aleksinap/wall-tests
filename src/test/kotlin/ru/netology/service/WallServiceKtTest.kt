package ru.netology.service


import org.junit.Assert.*
import org.junit.Test

import ru.netology.data.*

class WallServiceKtTest {

    @Test
    fun add_id_is_not_equal_zero() {
        val wallService = WallService()
        val post = Post(
            id = 4,
            ownerId = 12,
            fromId = 123,
            createdBy = 1234,
            date = 12345,
            text = "Привет Нетология",
            replyOwnerId = 123456,
            replyPostId = 1234567,
            friendsOnly = false,
            comments = Comment(
                count = 111,
                canPost = true,
                groupsCanPost = true,
                canClose = false,
                canOpen = false
            ),
            copyright = Copyright(
                id = 12345,
                link = "ru.netology",
                name = "Нетология",
                type = "Неизвестно",
            ),
            like = Like(
                count = 121,
                userLikes = false,
                canLike = true,
                canPublish = false,
            ),
            reposts = Repost(
                count = 1,
                userReposted = false
            ),
            views = View(count = 25),
            postType = "post",
            postSource = PostSource(
                type = "vk",
                platform = "android",
                data = "profileActivity",
                url = "https://netology.ru"
            ),
            geo = Geo(
                type = "type",
                coordinates = "coordinates",
                place = null
            ),
            signerId = 2345,
            copyHistory = null,
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = true,
            donut = Donut(
                isDonut = false,
                paidDuration = 1234567890,
                placeholder = Placeholder(),
                canPublishFreeCopy = false,
                editMode = "duration"
            ),
            postponedId = 12345
        )

        val lastPost = wallService.add(post)

        assertTrue(lastPost.id != 0)
    }

    @Test
    fun updateExisting() {
        val wallService = WallService()
        val post = Post(
            id = 2,
            ownerId = 12,
            fromId = 123,
            createdBy = 1234,
            date = 12345,
            text = "Привет Нетология",
            replyOwnerId = 123456,
            replyPostId = 1234567,
            friendsOnly = false,
            comments = Comment(
                count = 111,
                canPost = true,
                groupsCanPost = true,
                canClose = false,
                canOpen = false
            ),
            copyright = Copyright(
                id = 12345,
                link = "ru.netology",
                name = "Нетология",
                type = "Неизвестно",
            ),
            likes = Like(
                count = 121,
                userLikes = false,
                canLike = true,
                canPublish = false,
            ),
            reposts = Repost(
                count = 1,
                userReposted = false
            ),
            views = View(count = 25),
            postType = "post",
            postSource = PostSource(
                type = "vk",
                platform = "android",
                data = "profileActivity",
                url = "https://netology.ru"
            ),
            geo = Geo(
                type = "type",
                coordinates = "coordinates",
                place = null
            ),
            signerId = 2345,
            copyHistory = null,
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = true,
            donut = Donut(
                isDonut = false,
                paidDuration = 1234567890,
                placeholder = Placeholder(),
                canPublishFreeCopy = false,
                editMode = "duration"
            ),
            postponedId = 12345
        )
        wallService.add(post)
        wallService.add(post)
        wallService.add(post)
        val result = wallService.update(post)
        assertTrue(result)
    }

    @Test
    fun updateNotExisting() {
        val wallService = WallService()
        val post = Post(
            id = 0,
            ownerId = 12,
            fromId = 123,
            createdBy = 1234,
            date = 12345,
            text = "Привет Нетология",
            replyOwnerId = 123456,
            replyPostId = 1234567,
            friendsOnly = false,
            comments = Comment(
                count = 111,
                canPost = true,
                groupsCanPost = true,
                canClose = false,
                canOpen = false
            ),
            copyright = Copyright(
                id = 12345,
                link = "ru.netology",
                name = "Нетология",
                type = "Неизвестно",
            ),
            likes = Like(
                count = 121,
                userLikes = false,
                canLike = true,
                canPublish = false,
            ),
            reposts = Repost(
                count = 1,
                userReposted = false
            ),
            views = View(count = 25),
            postType = "post",
            postSource = PostSource(
                type = "vk",
                platform = "android",
                data = "profileActivity",
                url = "https://netology.ru"
            ),
            geo = Geo(
                type = "type",
                coordinates = "coordinates",
                place = null
            ),
            signerId = 2345,
            copyHistory = null,
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = true,
            donut = Donut(
                isDonut = false,
                paidDuration = 1234567890,
                placeholder = Placeholder(),
                canPublishFreeCopy = false,
                editMode = "duration"
            ),
            postponedId = 12345
        )
        wallService.add(post)
        wallService.add(post)
        wallService.add(post)
        val result = wallService.update(post)
        assertFalse(result)
    }
}