package com.max_grank.groceryapp.splash_screen.splash3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.max_grank.groceryapp.R
import com.max_grank.groceryapp.utils.NavigationDot

//Start 23:10
//Finish 23:33
@Composable
@Preview(showBackground = true)
fun Splash3_1() {
    Box(
        modifier = Modifier
            .padding(top = 171.dp, start = 15.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.cuate1),
            contentDescription = "cuate1",
            modifier = Modifier
                .width(384.dp)
                .height(384.dp)
        )
    }
    Box(
        modifier = Modifier
            .padding(top = 655.dp, start = 125.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.buy_grocery),
            contentDescription = "buy_grocery",
            modifier = Modifier
                .width(165.dp)
                .height(38.dp)
        )
    }
    Box(
        modifier = Modifier
            .padding(top = 705.dp, start = 47.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.paragraph9),
            contentDescription = "buy_grocery",
            modifier = Modifier
                .width(320.dp)
                .height(46.dp)
        )
    }
    Box(
        modifier = Modifier
            .padding(top = 798.dp, start = 36.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.skip_button),
            contentDescription = "buy_grocery",
            modifier = Modifier
                .width(31.dp)
                .height(23.dp)
        )
    }
    Row(
        modifier = Modifier
            .padding(top = 805.dp, start = 190.dp)
    ) {
        NavigationDot(isSelected = true)
        Spacer(modifier = Modifier.width(5.dp))
        NavigationDot(isSelected = true)
        Spacer(modifier = Modifier.width(5.dp))
        NavigationDot(isSelected = true)
    }
    Box(
        modifier = Modifier
            .padding(top = 798.dp, start = 344.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.next_button),
            contentDescription = "buy_grocery",
            modifier = Modifier
                .width(31.dp)
                .height(23.dp)
        )
    }
}