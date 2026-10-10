package com.example.composablelayout.model

import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle

data class Person(
    @StringRes val nameRes: Int,
    @StringRes val phoneRes: Int? = null,
    @StringRes val addressRes: Int,
    @ColorRes val cardColorRes: Int,
    @ColorRes val phoneColorRes: Int,
    @ColorRes val addressColorRes: Int,
    val nameFontFamily: FontFamily? = null,
    val nameFontStyle: FontStyle? = null
)
