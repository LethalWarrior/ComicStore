package com.dicoding.comicstore

import android.os.Parcel
import android.os.Parcelable

data class Comic(
    var title: String? = "",
    var description: String? = "",
    var genre: String? = "",
    var author: String? = "",
    var publisher: String? = "",
    var isbn: String? = "",
    var pages: Int = 0,
    var cover: Int = 0,
    var publicationDate: String? = "",
    var price: String? = ""
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(description)
        parcel.writeString(genre)
        parcel.writeString(author)
        parcel.writeString(publisher)
        parcel.writeString(isbn)
        parcel.writeInt(pages)
        parcel.writeInt(cover)
        parcel.writeString(publicationDate)
        parcel.writeString(price)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Comic> {
        override fun createFromParcel(parcel: Parcel): Comic {
            return Comic(parcel)
        }

        override fun newArray(size: Int): Array<Comic?> {
            return arrayOfNulls(size)
        }
    }
}
