package com.example.betrbetatools

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
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
    Text(
            text = "Hello $name!",
            modifier = modifier,
            color = Color.Magenta,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
    )
}

@Preview(showBackground = true) // Emulator shows that what is in here
@Composable
fun GreetingPreview() {
    Greeting("Android")
}