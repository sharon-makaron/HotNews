package com.example.hotnews.api.response

import com.google.gson.annotations.SerializedName

class SourceResponse(
    @SerializedName("id")
    var id: String,
    @SerializedName("name")
    var name: String? = null
)