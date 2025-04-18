package org.shu.peanutim.service

import androidx.compose.runtime.Composable
import org.shu.peanutim.Keyboard

class PeanutImService:ComposeInputMethodService() {
    @Composable
    override fun ComposeInputView() {
        Keyboard()
    }

}