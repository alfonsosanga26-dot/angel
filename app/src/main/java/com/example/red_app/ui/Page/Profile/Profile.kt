package com.example.red_app.ui.Page.Profile

import android.provider.ContactsContract
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Surface
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import com.example.red_app.R
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.layout.size
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.border
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.items
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.rememberCameraPositionState
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Languages(language : String){
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = Color.Black.copy(alpha = 0.5f),
        //shadowElevation = 4.dp
    ){
        Text(
            text = language,
            fontSize = 20.sp,
            color = Color.White,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}
@Composable
@Preview
fun Profile(modifier: Modifier = Modifier) {
    val ubicacion = LatLng(20.0976935, -98.7192755)
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(ubicacion, 13f)
    }
    val languages = listOf(
        "C++", "Java", "Python", "JavaScript"
    )
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFffffff))
    ) {
        Text(
            text = "Alfonso Oropeza Sangabriel",
            fontSize = 25.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Black,
            modifier = Modifier.padding(top = 230.dp).padding(horizontal = 16.dp)
        )
        Text(
            text = "alfonsosanga16@gmail.com",
            fontSize = 15.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Gray,
            modifier = Modifier.padding(top = 260.dp).padding(horizontal = 16.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.baner),
            contentDescription = "Banner",
            modifier = Modifier
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        Image(
            painter = painterResource(id = R.drawable.perfil),
            contentDescription = "Imagen de perfil",
            modifier = Modifier
                .padding(top = 60.dp)
                .padding(horizontal = 30.dp)
                .size(160.dp)
                .clip(CircleShape)
                .border(5.dp, Color.Black, CircleShape),
            contentScale = ContentScale.Crop
        )
        GoogleMap(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp)
                .padding(top = 490.dp)
                .height(240.dp)
                .clip(RoundedCornerShape(12.dp)),

            cameraPositionState = cameraPositionState
        )
        Surface(
            shape = RoundedCornerShape(16.dp),
            color = Color.Black.copy(alpha = 0.4f),
            modifier = Modifier.padding(top = 350.dp).padding(horizontal = 16.dp)
        ) {
            Text(
                text = "Soy estudiante de la UPP, me gusta pasar tiempo con mi novia y los fines de semana trabajo como mesero en un bar llamado LOS LITROS ",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = Color.White,
                modifier = Modifier.padding(horizontal = 30.dp, vertical = 5.dp)
            )
        }
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 290.dp),
                horizontalArrangement = Arrangement.spacedBy(20.dp),
                contentPadding = PaddingValues(horizontal = 16.dp)
            ) {
                items(languages) { language ->
                    Languages(language = language)
                }
            }
    }
}