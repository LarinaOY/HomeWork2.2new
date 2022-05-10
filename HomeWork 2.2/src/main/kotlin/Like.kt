fun main() {
    likes(1)
    likes(11)
    likes(111)
    likes(25)
    likes(23)
    likes(28
    )
}


fun likes(like: Int) {
    val likeStr = like.toString()
    val likeCharrArr = likeStr.toCharArray()

    if (likeCharrArr.size > 1) {
        if (likeCharrArr[likeCharrArr.size - 2] == '1') {
            println("Понравилось $like людям")
            return
        }
    }
    when {
        likeCharrArr.last() == '2' || likeCharrArr.last() == '3' || likeCharrArr.last() == '4' -> println("Понравилось $like людям")
        likeCharrArr.last() == '1' -> println("Понравилось $like человеку")
        else -> println("Понравилось $like людям")
    }
}


