package com.Fariz_19104035.modul10.data

import android.os.Parcelable

@Parcelize
data class Quote(
    var id: Int = 0,
    var title: String? = null,
    var description: String? = null,
    var category: String? = null,
    var date: String? = null
) : Parcelable
