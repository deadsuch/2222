package com.topic3.android.reddit.screens

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
@@ -35,8 +36,12 @@ class ChatActivity : AppCompatActivity() {
    finish()
}

binding.composeButton.setContent{
    MaterialTheme {
        ComposeButton {
            showToast()
        }
    }
}
}