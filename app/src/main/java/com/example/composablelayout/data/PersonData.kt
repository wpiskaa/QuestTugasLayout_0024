package com.example.composablelayout.data

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import com.example.composablelayout.R
import com.example.composablelayout.model.Person

val personList = listOf(
    Person(
        nameRes = R.string.person1_name,
        addressRes = R.string.person1_address,
        cardColorRes = R.color.card_gray,
        phoneColorRes = R.color.text_cyan,
        addressColorRes = R.color.text_yellow,
        nameFontFamily = FontFamily.Cursive,
        nameFontStyle = FontStyle.Italic
    ),
    Person(
        nameRes = R.string.person2_name,
        phoneRes = R.string.person2_phone,
        addressRes = R.string.person2_address,
        cardColorRes = R.color.card_purple,
        phoneColorRes = R.color.text_cyan,
        addressColorRes = R.color.text_yellow
    ),
    Person(
        nameRes = R.string.person3_name,
        phoneRes = R.string.person3_phone,
        addressRes = R.string.person3_address,
        cardColorRes = R.color.card_blue,
        phoneColorRes = R.color.text_cyan,
        addressColorRes = R.color.text_white
    ),
    Person(
        nameRes = R.string.person4_name,
        phoneRes = R.string.person4_phone,
        addressRes = R.string.person4_address,
        cardColorRes = R.color.card_green,
        phoneColorRes = R.color.text_cyan,
        addressColorRes = R.color.text_white
    )
)
