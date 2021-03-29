package ru.netology.service

import ru.netology.data.Post
import kotlin.random.Random

class  WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        var unicId: Int = post.id
        fun isUnic() : Boolean{
            for(post in posts){
                if(post.id == unicId) return false
            }
            return true
        }
        while (!isUnic()) {
            unicId = Random.nextInt(1, 5)
        }
        posts += post.copy(id = unicId)
        return posts.last()
    }

    fun update(post: Post) : Boolean {
        for(i in posts.indices){
            if(posts[i].id == post.id){
                posts[i] = post.copy(id = posts[i].id, ownerId = posts[i].ownerId)
                return true
            }
        }
        return false
    }
}
