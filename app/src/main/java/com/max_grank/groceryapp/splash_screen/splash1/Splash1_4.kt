package com.max_grank.groceryapp.splash_screen.splash1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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

//Start 16:15
//Finish 16:33
@Composable
@Preview(showBackground = true)
fun Splash1_4() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.mask_group4),
            contentDescription = "mask_group4",
            modifier = Modifier
                .fillMaxSize()
        )
        Box(
            modifier = Modifier
                .padding(top = 96.dp)
            .align(Alignment.TopCenter)

        ) {
            Image(
                painter = painterResource(R.drawable.buy_quality_fruits),
                contentDescription = "buy_quality_fruits",
                modifier = Modifier
                    .width(248.dp)
                    .height(78.dp)
            )
        }
        Box(
            modifier = Modifier
                .padding(top = 203.dp)
                .align(Alignment.TopCenter)
        ) {
            Image(
                painter = painterResource(R.drawable.title4),
                contentDescription = "title4",
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
                Spacer(modifier = Modifier.width(4.dp))
                NavigationDot(
                    isSelected = true
                )
            }
            Spacer(modifier = Modifier.height(40.dp))
            NavigationButton()
        }
    }
}