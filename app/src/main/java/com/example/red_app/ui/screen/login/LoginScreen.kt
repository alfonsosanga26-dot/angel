package com.example.red_app.ui.screen.login
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.red_app.ui.components.PrimaryButton

@Composable
fun LoginScreen(
    onOpenMainClicked: () -> Unit,
    onOpenRegisterClicked: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){


        PrimaryButton(
            onClick = onOpenMainClicked,
            text = "Siguiente",
            isNavigationArrowVisible = true,
            modifier = Modifier
                .padding(horizontal = 24.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color.Black
            ),
            cornerRadius = 8.dp
        )
    }
}