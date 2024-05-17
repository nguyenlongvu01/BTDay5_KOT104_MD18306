package com.vunlph30245.lab3_kot_md18306

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme.shapes
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

class Bai5 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            GetLayout("Trang chu")
        }
    }

    @Preview(showBackground = true)
    @Composable
    private fun GetLayout(
        title: String = "Trang chu", innerPadding: PaddingValues =
            PaddingValues(0.dp)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)

        ) {
            GetTextTitle(title, innerPadding)
            GetRowItem(color = Color.Yellow,
                R.drawable.ic_logo_paypal,
                "Paypal")
            GetRowItem(color = Color.LightGray,
                R.drawable.ic_logo_momo,
                "Momo")
            GetRowItem(color = Color.Magenta,
                R.drawable.ic_logo_visa,
                "Visa")
            GetRowItem(color = Color.Blue,
                R.drawable.ic_logo_zalopay,
                "ZaloPay")
            GetRowItem(color = Color.Cyan,
                R.drawable.ic_logo_thanhtoan,
                "Thanh toan truc tiep")

        }
    }

    @Composable
    fun GetRowItem(color: Color, idRes: Int= R.drawable.ic_logo_paypal, title: String = "Paypal") {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color =
                    color, shape = RoundedCornerShape(12.dp)
                )
                .height(70.dp)
                .padding(5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(
                    id
                    = idRes
                ),
                contentDescription = "",
                modifier = Modifier.size(60.dp)
            )
            Text(
                text = title,
                modifier = Modifier
                    .weight(1f)
                    .padding(50.dp, 0.dp, 0.dp, 0.dp),
                color = Color.White
            )
            RadioButton(selected = false, onClick = {

            })
        }
    }

    @Composable
    private fun GetTextTitle(
        title: String = "Trang chu", innerPadding: PaddingValues =
            PaddingValues(0.dp)
    ) {
        Text(
            text = title,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            fontSize = 30.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}


