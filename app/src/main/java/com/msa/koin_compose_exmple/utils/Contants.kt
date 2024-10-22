package com.msa.koin_compose_exmple.utils

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.ui.unit.Dp


const val BASE_URL = "https://newsapi.org/v2/"
const val DB_Name = "myNewsDB"
const val SOCKET_TIMEOUT  = 60_000
const val REQUEST_TIMEOUT  = 60_000
const val DEBUG  = true

const val dataStoreFileName = "setting.preferences_pb"


enum class Type {
    Mobile, Desktop
}

data class Size(
    val width: Dp,
    val height : Dp
)


// تعریف انیمیشن FadeIn که شامل دو بخش است: fadeIn و scaleIn
val FadeIn = fadeIn(
    animationSpec = tween(
        durationMillis = 220, // زمان انیمیشن 220 میلی‌ثانیه
        delayMillis = 90 // تأخیر 90 میلی‌ثانیه قبل از شروع انیمیشن
    )
) + scaleIn(
    initialScale = 0.92f, // مقیاس اولیه (اندازه) قبل از شروع انیمیشن
    animationSpec = tween(
        durationMillis = 220, // زمان انیمیشن 220 میلی‌ثانیه
        delayMillis = 90 // تأخیر 90 میلی‌ثانیه قبل از شروع انیمیشن
    )
)

// تعریف انیمیشن FadeOut که فقط شامل fadeOut است
val FadeOut = fadeOut(
    animationSpec = tween(
        durationMillis = 90 // زمان انیمیشن 90 میلی‌ثانیه
    )
)
