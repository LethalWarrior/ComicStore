package com.dicoding.comicstore

data class Comic(
    var title: String = "",
    var description: String = "",
    var genre: String = "",
    var author: String = "",
    var publisher: String = "",
    var isbn: String = "",
    var pages: Int = 0,
    var cover: Int = 0,
    var publicationDate: String = ""

)
