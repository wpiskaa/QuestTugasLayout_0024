package com.example.composablelayout.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.composablelayout.R
import com.example.composablelayout.data.personList
import com.example.composablelayout.ui.components.FooterSection
import com.example.composablelayout.ui.components.HeaderSection
import com.example.composablelayout.ui.components.PersonCard
import com.example.composablelayout.ui.theme.ComposableLayoutTheme

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(R.color.screen_background))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = dimensionResource(R.dimen.screen_padding))
        ) {
            HeaderSection()
            Column(verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.card_spacing))) {
                personList.forEach { person ->
                    PersonCard(person = person)
                }
            }
        }
        FooterSection(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun MainScreenPreview() {
    ComposableLayoutTheme {
        MainScreen()
    }
}
