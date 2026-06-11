package com.max_grank.groceryapp.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.max_grank.groceryapp.ui.theme.LightGray
import com.max_grank.groceryapp.ui.theme.PrimaryDark

@Composable
fun NavigationDot(
    isSelected: Boolean
) {
    Box(
        modifier = Modifier
            .size(8.dp)
            .clip(shape = CircleShape)
            .background(
                color = if (isSelected) {
                    PrimaryDark
                } else {
                    LightGray
                }
            )

    )
}