package com.example.composablelayout.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.composablelayout.R

@Composable
fun HeaderSection(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(
                top = dimensionResource(R.dimen.header_top_padding),
                bottom = dimensionResource(R.dimen.header_bottom_padding)
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.header_spacing))
    ) {
        Text(
            text = stringResource(R.string.header_title),
            color = colorResource(R.color.text_primary),
            fontSize = with(LocalDensity.current) {
                dimensionResource(R.dimen.text_size_title).toSp()
            },
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Text(
            text = stringResource(R.string.header_subtitle),
            color = colorResource(R.color.text_primary),
            fontSize = with(LocalDensity.current) {
                dimensionResource(R.dimen.text_size_subtitle).toSp()
            },
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun HeaderSectionPreview() {
    HeaderSection()
}
