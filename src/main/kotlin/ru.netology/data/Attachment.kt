package ru.netology.data

sealed class Attachment (open val type: String){
    data class AudioAttachment(override val type: String = "audio", val audio: Audio) : Attachment (type)
    data class NoteAttachment(override val type: String = "note", val note: Note) : Attachment (type)
    data class PhotoAttachment(override val type: String = "photo", val photo: Photo) : Attachment (type)
    data class PostedPhotoAttachment(override val type: String = "postedPhoto", val postedPhoto: PostedPhoto) : Attachment (type)
    data class VideoAttachment(override val type: String = "video", val video: Video) : Attachment (type)
}