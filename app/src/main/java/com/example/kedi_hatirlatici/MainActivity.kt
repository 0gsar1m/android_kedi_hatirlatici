package com.example.kedi_hatirlatici

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kedi_hatirlatici.ui.theme.Kedi_hatirlaticiTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Kedi_hatirlaticiTheme {
                showCatIcon()
            }
        }
    }
}

@Composable
fun showCatIcon(){
    Image(
        painter = painterResource(id = R.drawable.background),
        contentDescription = "Cat Icon",
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize()
    )
}
