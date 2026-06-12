package com.max_grank.groceryapp.splash_screen.splash2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.max_grank.groceryapp.R
import com.max_grank.groceryapp.utils.NavigationButton
import com.max_grank.groceryapp.utils.NavigationDot

//Start 17:26
//Finish 17:48
@Composable
@Preview(showBackground = true)
fun Splash2_2() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .offset(x = (-4).dp, y = (-23).dp)
        )
        Image(
            painter = painterResource(R.drawable.element6),
            contentDescription = "element6",
            modifier = Modifier
                .width(417.dp)
                .height(619.dp)
        )
        Box(
            modifier = Modifier
                .padding(top = 478.dp)
                .offset(x = (-0.1).dp)
        ) {
            Image(
                painter = painterResource(R.drawable.vector5),
                contentDescription = "vector5",
                modifier = Modifier
                    .width(414.dp)
                    .height(425.dp)
            )
        }
        Box(
            modifier = Modifier
                .padding(top = 536.dp)
                .align(Alignment.TopCenter)
        ) {
            Image(
                painter = painterResource(R.drawable.buy_premium),
                contentDescription = "buy premium",
                modifier = Modifier
                    .width(225.dp)
                    .height(78.dp)
            )
        }
        Box(
            modifier = Modifier
                .padding(top = 643.dp)
                .align(Alignment.TopCenter)
        ) {
            Image(
                painter = painterResource(R.drawable.paragraph6),
                contentDescription = "paragraph5",
                modifier = Modifier
                    .width(320.dp)
                    .height(46.dp)
            )
        }
        Column(
            modifier = Modifier
                .padding(horizontal = 17.dp)
        ) {
            Row(
                modifier = Modifier
                    .padding(top = 720.dp, start = 166.dp)
            ) {
                NavigationDot(
                    isSelected = true
                )
                Spacer(modifier = Modifier.width(4.dp))
                NavigationDot(
                    isSelected = false
                )
                Spacer(modifier = Modifier.width(4.dp))
                NavigationDot(
                    isSelected = false
                )
                Spacer(modifier = Modifier.width(4.dp))
                NavigationDot(
                    isSelected = false
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            NavigationButton()
        }
    }
}