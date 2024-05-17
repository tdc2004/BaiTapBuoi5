package com.chinhdev.lab3_kot104.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chinhdev.lab3_kot104.R


class Bai5 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent()
        }
    }
}

@Composable
fun MainContent() {
    Column(
        modifier = Modifier
            .background(color = Color(0xFF262121))
            .fillMaxHeight()
    ) {
        titleText()
        diaChi()
        renderItem(
            color = Color(0xFFFA8500),
            painterResource(id = R.drawable.paypal_icon),
            "Zalo Pay"
        )
        renderItem(color = Color(0xFF8219EA), painterResource(id = R.drawable.visa_icon), "Visa")
        renderItem(color = Color(0xFFEC1387), painterResource(id = R.drawable.momo_icon), "Momo")
        renderItem(
            color = Color(0xFF00C2FD),
            painterResource(id = R.drawable.zalo_icon),
            "Zalo Pay"
        )
        renderItem(
            color = Color(0xFF18EBEA),
            painterResource(id = R.drawable.tienmat_icon),
            "Tiền mặt"
        )
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFE734C)),
            modifier = Modifier
                .width(300.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Tiếp theo")
        }
    }
}

@Composable
fun diaChi() {
    Column(
        modifier = Modifier
            .padding(7.dp, top = 25.dp)
            .fillMaxWidth(),
    ) {
        Text(
            text = "Địa chỉ nhận hàng",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold, color = Color.White
        )
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "",
                modifier = Modifier.size(50.dp)
            )
            Column(
                modifier = Modifier.padding(10.dp, 0.dp)
            ) {
                Text(text = "Tống Doanh Chính - PH40493", color = Color.White)
                Text(text = "số 83 ngõ 2 Phan Bá Vành", color = Color.White)
                Text(text = "Phường Phú Diễn", color = Color.White)
                Text(text = "Bắc Từ Liêm - Hà Nội", color = Color.White)
            }
        }
        Text(
            text = "Vui lòng chọn 1 trong những phương thức sau:",
            modifier = Modifier.padding(10.dp),
            color = Color.White
        )
    }
}

@Composable
fun titleText() {
    Text(
        text = "Thanh Toán",
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        textAlign = TextAlign.Center,
        color = Color.White
    )

}

@Composable
fun renderItem(color: Color, painter: Painter, txt: String) {
    Row(
        modifier = Modifier
            .height(80.dp)
            .padding(5.dp)
            .background(color = color, shape = RoundedCornerShape(10.dp))
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painter, contentDescription = "",
            modifier = Modifier
                .padding(10.dp)
                .width(50.dp)
                .height(50.dp)
        )
        Text(text = txt, color = Color.White)
        RadioButton(selected = false, onClick = { /*TODO*/ })
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MainContent()
}