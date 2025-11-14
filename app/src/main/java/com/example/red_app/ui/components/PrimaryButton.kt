package com.example.red_app.ui.components

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Button
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.ui.draw.shadow
import androidx.compose.material3.Text
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
@Composable
fun PrimaryButton(
    onClick: () -> Unit,
    text: String,
    isNavigationArrowVisible: Boolean,
    modifier: Modifier = Modifier,
    colors: ButtonColors = ButtonDefaults.buttonColors(),
    shadowColor: Color = Color.Gray,
    navigationIcon: ImageVector? = null,
    cornerRadius: Dp = 4.dp // Añadido parámetro para el radio de las esquinas
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .height(62.dp)
            .shadow(
                elevation = 4.dp,
                spotColor = shadowColor
            ),
        colors = colors,
        shape = RoundedCornerShape(cornerRadius) // Aplicar el redondeado personalizado
    ) {
        if (isNavigationArrowVisible && navigationIcon != null) {
            Icon(
                imageVector = navigationIcon,
                contentDescription = "Navigation Arrow",
                tint = MaterialTheme.colorScheme.onPrimary
            )
        }
        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview(showBackground = true, widthDp = 360, heightDp = 120)
@Composable
fun PrimaryButtonPreview() {
    PrimaryButton(
        onClick = {},
        text = "Next",
        isNavigationArrowVisible = false,
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.White,
            containerColor = Color.DarkGray
        ),
        shadowColor = Color.Gray,
        cornerRadius = 8.dp // Ajustar el valor del radio de las esquinas en la vista previa
    )
}
