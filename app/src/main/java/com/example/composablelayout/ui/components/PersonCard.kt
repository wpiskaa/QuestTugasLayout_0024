package com.example.composablelayout.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.platform.LocalDensity
import com.example.composablelayout.R
import com.example.composablelayout.data.personList
import com.example.composablelayout.model.Person

/**
 * Satu-satunya komponen Card yang dipakai ulang oleh seluruh item.
 */
@Composable
fun PersonCard(person: Person, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(dimensionResource(R.dimen.card_corner_radius)))
            .background(colorResource(person.cardColorRes))
            .padding(dimensionResource(R.dimen.card_padding)),
        verticalAlignment = Alignment.CenterVertically
    ) {
        LogoImage()
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = dimensionResource(R.dimen.card_text_horizontal_padding)),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.card_text_spacing))
        ) {
            val isCursive = person.nameFontFamily != null
            Text(
                text = stringResource(person.nameRes),
                color = colorResource(R.color.text_name),
                fontSize = sizeResource(
                    if (isCursive) R.dimen.text_size_name_cursive else R.dimen.text_size_name
                ),
                fontWeight = if (isCursive) FontWeight.Normal else FontWeight.Bold,
                fontFamily = person.nameFontFamily,
                fontStyle = person.nameFontStyle
            )
            person.phoneRes?.let {
                Text(
                    text = stringResource(it),
                    color = colorResource(person.phoneColorRes),
                    fontSize = sizeResource(R.dimen.text_size_detail)
                )
            }
            Text(
                text = stringResource(person.addressRes),
                color = colorResource(person.addressColorRes),
                fontSize = sizeResource(R.dimen.text_size_detail)
            )
        }
        LogoImage()
    }
}

@Composable
private fun LogoImage() {
    Box(
        modifier = Modifier
            .size(dimensionResource(R.dimen.logo_size))
            .clip(CircleShape)
    ) {
        Image(
            painter = painterResource(R.drawable.logo_umy),
            contentDescription = stringResource(R.string.cd_logo),
            modifier = Modifier
                .fillMaxSize()
                .scale(integerResource(R.integer.logo_scale_percent) / 100f),
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
private fun sizeResource(id: Int): TextUnit {
    val density = LocalDensity.current
    return with(density) { dimensionResource(id).toSp() }
}

@Preview(showBackground = true)
@Composable
private fun PersonCardPreview() {
    PersonCard(personList[1])
}
