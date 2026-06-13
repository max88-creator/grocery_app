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

//Start 20:50
//Finish 21:18
@Composable
@Preview(showBackground = true)
fun Splash2_4() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .offset(x = (-3).dp, y = (-188).dp)
        ) {
            Image(
                painter = painterResource(R.drawable.element8),
                contentDescription = "element8",
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Box(
            modifier = Modifier
                .padding(top = 432.dp)
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
                painter = painterResource(R.drawable.get_discounts_on_all_products),
                contentDescription = "get_discounts_on_all_products",
                modifier = Modifier
                    .width(248.dp)
                    .height(78.dp)
            )
        }
        Box(
            modifier = Modifier
                .padding(top = 624.dp)
                .align(Alignment.TopCenter)
        ) {
            Image(
                painter = painterResource(R.drawable.paragraph8),
                contentDescription = "paragraph8",
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