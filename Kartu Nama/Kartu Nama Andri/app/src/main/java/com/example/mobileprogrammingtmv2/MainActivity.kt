package com.example.mobileprogrammingtmv2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobileprogrammingtmv2.ui.theme.MobileProgrammingTMV2Theme
import com.example.mobileprogrammingtmv2.ui.theme.iconColor
import com.example.mobileprogrammingtmv2.ui.theme.imageBg

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobileProgrammingTMV2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CardName()
                }
            }
        }
    }
}

@Composable
fun CardName(modifier: Modifier = Modifier) {
    val androidLogo = painterResource(id = R.drawable.android_logo)
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .background(color = imageBg)
                .padding(16.dp)
        ) {
            Image(
                painter = androidLogo,
                contentDescription = "Android Logo",
                modifier = Modifier.size(74.dp),
                contentScale = ContentScale.Crop
            )
        }
        Text(
            text = "Andri Hermawan",
            modifier = modifier,
            fontSize = 34.sp,
            fontWeight = FontWeight.Light
        )
        Text(
            text = "Mercu Buana Student",
            modifier = Modifier,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = iconColor
        )
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Column(
            modifier = Modifier.padding(bottom = 54.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            ContactInformation(
                icon = Icons.Rounded.Call,
                text = "+62 8123 456 789"
            )
            ContactInformation(
                icon = Icons.Rounded.Share,
                text = "@andrihermawan"
            )
            ContactInformation(
                icon = Icons.Rounded.Email,
                text = "andrihermawann@gmail.com"
            )
        }
    }
}

@Composable
fun ContactInformation(icon: ImageVector, text: String) {
    Row {
        Icon(
            icon,
            contentDescription = "${icon.name} Icon",
            tint = iconColor
        )
        Text(
            text = text,
            modifier = Modifier.padding(start = 20.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CardNamePreview() {
    MobileProgrammingTMV2Theme {
        CardName()
    }
}