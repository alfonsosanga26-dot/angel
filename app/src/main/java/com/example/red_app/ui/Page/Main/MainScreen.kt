package com.example.red_app.ui.Page.Main
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.red_app.ui.Page.Home.HomePage
import com.example.red_app.ui.Page.Notification.NotificationPage
import com.example.red_app.ui.Page.Profile.Profile
import com.example.red_app.ui.Page.Settings.SettingsPage

import com.example.red_app.ui.components.buttons.navbar.Navltem
import kotlin.collections.forEachIndexed

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val navItemList = listOf(
        Navltem(label = "Home", icon = Icons.Default.Home, badgeCount = 5),
        Navltem(label = "Noti", icon = Icons.Default.Notifications, badgeCount = 5),
        Navltem(label = "Settings", icon = Icons.Default.Settings, badgeCount = 5),
        Navltem(label = "Profile", icon = Icons.Default.Person, badgeCount = 5)
    )
    var selectedIndex by remember {
        mutableIntStateOf(value = 0)
    }
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                navItemList.forEachIndexed { index, navItem ->
                    NavigationBarItem(
                        selected = selectedIndex == index,
                        onClick = {
                            selectedIndex = index
                        },
                        icon = {
                            BadgedBox(badge = {
                                Badge() {
                                    Text(text = "5")
                                }
                            }) {
                                Icon(
                                    imageVector = navItem.icon,
                                    contentDescription = navItem.label
                                )
                            }
                        },
                        label = {
                            Text(text = navItem.label)
                        }
                    )
                }
            }
        }
    ) { innerPadding ->
        ContentScreen(modifier = Modifier.padding(innerPadding), selectedIndex)
    }
}
@Composable
fun ContentScreen(modifier: Modifier = Modifier, selectedIndex: Int) {
    when (selectedIndex) {
        0 -> HomePage(modifier = modifier)
        1 -> NotificationPage(modifier = modifier)
        2 -> SettingsPage(modifier = modifier)
        3 -> Profile(modifier = modifier)
    }
}