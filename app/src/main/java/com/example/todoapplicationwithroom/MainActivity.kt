package com.example.todoapplicationwithroom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.todoapplicationwithroom.ui.theme.TodoApplicationWithRoomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TodoApplicationWithRoomTheme {

            }
        }
    }
}
