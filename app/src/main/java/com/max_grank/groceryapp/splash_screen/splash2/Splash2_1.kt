package com.max_grank.groceryapp.splash_screen.splash2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.max_grank.groceryapp.R
import com.max_grank.groceryapp.utils.NavigationButton
import com.max_grank.groceryapp.utils.NavigationDot

//Start 16:38
//Finish 17:24
@Composable
@Preview(showBackground = true)
fun Splash2_1() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Box(
            modifier = Modifier
                .offset(x = (-3).dp, y = (-98).dp)

        ) {
            Image(
                painter = painterResource(
                    R.drawable.element5
                ),
                contentDescription = "element5",
                modifier = Modifier
                    .width(417.dp)
                    .height(619.dp)
            )
        }
        Box(
            modifier = Modifier
                .padding(top = 412.dp)
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
                .padding(top = 517.dp)
                .align(Alignment.TopCenter)
        ) {
            Image(
                painter = painterResource(R.drawable.premium_food_at_your_doorstep),
                contentDescription = "premium_food_at_your_doorstep",
                modifier = Modifier
                    .width(274.dp)
                    .height(78.dp)
            )
        }
        Box(
            modifier = Modifier
                .padding(top = 623.dp)
                .align(Alignment.TopCenter)
        ) {
            Image(
                painter = painterResource(R.drawable.paragraph5),
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
                    .padding(top = 700.dp, start = 166.dp)
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
            Spacer(modifier = Modifier.height(40.dp))
            NavigationButton()
        }
    }
}