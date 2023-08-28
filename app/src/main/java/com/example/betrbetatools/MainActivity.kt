package com.example.betrbetatools

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.betrbetatools.ui.theme.BetrBetaToolsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting(name = "Android") //greeting is as a composable. We put hear because set content wants a composable function
        }

        testFunction(5){
            testFunctionLambda()
        }
    }

    fun testFunction(int: Int, myFunction: () -> Unit){
        myFunction.invoke()
    }

    fun testFunctionLambda(){
        println("test")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    //Column, Row, Box
    Column {
        Text(
            text = "Hello $name!",
            modifier = Modifier
                .background(color = Color.Black)
                .padding(top = 10.dp, start = 1.dp, end = 1.dp, bottom = 30.dp)
                .clickable {
                        println("hello android clicked")
                },
            color = Color.White,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Hello World!",
            modifier = modifier,
            color = Color.Magenta,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
    }


}

@Preview(showBackground = true) // Emulator shows that what is in here
@Composable
fun GreetingPreview() {
    Greeting("Android")
}