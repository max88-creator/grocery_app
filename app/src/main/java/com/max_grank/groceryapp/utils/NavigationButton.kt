package com.max_grank.groceryapp.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.max_grank.groceryapp.R
import com.max_grank.groceryapp.ui.theme.PrimaryDark

@Composable
fun NavigationButton() {
    Box(
        modifier = Modifier
            .width(380.dp)
            .height(60.dp)
            .clip(shape = RoundedCornerShape(5.dp))
            .background(PrimaryDark)
            .clickable {

            },
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(R.drawable.title),
            contentDescription = "title",
            modifier = Modifier
                .width(86.dp)
                .height(23.dp)
        )
    }
}