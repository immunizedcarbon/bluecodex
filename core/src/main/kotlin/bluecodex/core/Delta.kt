package bluecodex.core

data class Post(
    val uri: String,
    val cid: String,
)

sealed interface Delta {
    data class New(val post: Post) : Delta
    data class Edit(val post: Post, val oldCid: String) : Delta
}

class DeltaDetector {
    fun detect(previousCid: String?, post: Post): Delta =
        if (previousCid == null) Delta.New(post)
        else Delta.Edit(post, previousCid)
}
