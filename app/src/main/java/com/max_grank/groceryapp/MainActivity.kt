package com.max_grank.groceryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.max_grank.groceryapp.splash_screen.splash1.Splash1_4
import com.max_grank.groceryapp.splash_screen.splash2.Splash2_1
import com.max_grank.groceryapp.splash_screen.splash2.Splash2_2
import com.max_grank.groceryapp.splash_screen.splash2.Splash2_3
import com.max_grank.groceryapp.splash_screen.splash2.Splash2_4
import com.max_grank.groceryapp.splash_screen.splash3.Splash3_1
import com.max_grank.groceryapp.ui.theme.GroceryAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GroceryAppTheme {
                Splash3_1()
            }
        }
    }
}
