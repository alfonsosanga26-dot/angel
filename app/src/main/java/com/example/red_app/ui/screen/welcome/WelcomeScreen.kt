package com.example.red_app.ui.screen.welcome

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.background
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.ui.Alignment
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import com.example.red_app.R
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import com.example.red_app.ui.components.buttons.navbar.Message
import com.example.red_app.ui.components.PrimaryButton

@Composable
fun WelcomeScreen(
    onOpenLoginCliked: () -> Unit,
    modifier: Modifier = Modifier
)
{
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .systemBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.adobo),
            contentDescription = "Red App Logo",
            modifier = Modifier
                .fillMaxSize(0.5f)
                .fillMaxHeight()
                .padding(top = 32.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Message(
            title = "Bienvenido a mi APP  ",
            subtitle = "Esta media fea"
        )

        Spacer(modifier = Modifier.weight(1f))

        PrimaryButton(
            onClick = onOpenLoginCliked,
            text = "NEXT",
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
