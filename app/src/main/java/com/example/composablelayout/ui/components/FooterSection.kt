package com.example.composablelayout.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.composablelayout.R

@Composable
fun FooterSection(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(R.string.footer_copyright),
        modifier = modifier
            .fillMaxWidth()
            .padding(bottom = dimensionResource(R.dimen.footer_bottom_padding)),
        color = colorResource(R.color.text_primary),
        fontSize = with(LocalDensity.current) {
            dimensionResource(R.dimen.text_size_footer).toSp()
        },
        textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true)
@Composable
private fun FooterSectionPreview() {
    FooterSection()
}
