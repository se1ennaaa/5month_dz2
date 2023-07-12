package com.example.a5month_dz2

import com.google.gson.annotations.SerializedName

class LoveModel (
    // @SerializedName нужен для того чтобы переименовать переменную чтоб мы сами понимали
    @SerializedName("fname")
    val firstName: String,
    @SerializedName("sname")
    val secondName: String,
    val percentage: String,
    val result: String
)