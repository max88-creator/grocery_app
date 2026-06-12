package com.max_grank.groceryapp.splash_screen.splash2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.room.util.TableInfo
import com.max_grank.groceryapp.R
import com.max_grank.groceryapp.utils.NavigationButton
import com.max_grank.groceryapp.utils.NavigationDot

//Start 18:23
//Finish 18:53
@Composable
@Preview(showBackground = true)
fun Splash2_3() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .offset(x = (-4).dp, y = (-23).dp)
        ) {
            Image(
                painter = painterResource(R.drawable.element7),
                contentDescription = "element7",
                modifier = Modifier
                    .width(417.dp)
                    .height(619.dp)
            )
        }
        Box(
            modifier = Modifier
                .padding(top = 471.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.vector5),
                contentDescription = "vector5",
                modifier = Modifier
                    .width(414.dp)
                    .height(425.dp)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 536.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.buy_dairy_products),
                contentDescription = "buy_dairy_products",
                modifier = Modifier
                    .width(240.dp)
                    .height(78.dp)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 643.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.paragraph7),
                contentDescription = "paragraph7",
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