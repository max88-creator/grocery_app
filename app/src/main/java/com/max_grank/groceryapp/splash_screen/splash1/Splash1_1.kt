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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.max_grank.groceryapp.R
import com.max_grank.groceryapp.utils.NavigationButton
import com.max_grank.groceryapp.utils.NavigationDot

//Start 21:22
//End 22:42
@Composable
@Preview(showBackground = true)
fun Splash1_1() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box()
         {
            Image(
                painter = painterResource(
                    R.drawable.maskgroup
                ),
                contentDescription = "mask group",
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Box(
            modifier = Modifier
                .padding(top = 96.dp)
                .align(Alignment.TopCenter)
        ) {
            Text(
                text = "Welcome to",
                fontSize = 30.sp,
                fontWeight = FontWeight(700),
                lineHeight = 1.3.em,
                letterSpacing = 0.03.em,
            )
        }
        Box(
            modifier = Modifier
                .padding(top = 136.dp)
        ) {
            Image(
                painter = painterResource(
                    R.drawable.big_cart
                ),
                contentDescription = "big_cart",
                modifier = Modifier
                    .width(127.dp)
                    .height(50.dp)
            )
        }
        Box(
            modifier = Modifier
                .padding(top = 203.dp, start = 47.dp)
        ) {
            Image(
                painter = painterResource(
                    R.drawable.paragraph1
                ),
                contentDescription = "paragraph1",
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