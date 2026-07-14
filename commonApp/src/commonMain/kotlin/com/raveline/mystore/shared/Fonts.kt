package com.raveline.mystore.shared

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import mystore.commonapp.generated.resources.Res
import mystore.commonapp.generated.resources.bebas_neue_regular
import mystore.commonapp.generated.resources.roboto_condensed_medium
import org.jetbrains.compose.resources.Font

@Composable
fun BebasNeueFont() = FontFamily(
    Font(Res.font.bebas_neue_regular, weight = FontWeight.Normal),
)

@Composable
fun RobotoCondensedFont() = FontFamily(
    Font(Res.font.roboto_condensed_medium, weight = FontWeight.Bold)
)

object FontSize {
    val EXTRA_SMALL = 10.sp
    val SMALL = 12.sp
    val REGULAR = 14.sp
    val EXTRA_REGULAR = 16.sp
    val MEDIUM = 18.sp
    val EXTRA_MEDIUM = 20.sp
    val LARGE = 30.sp
    val EXTRA_LARGE = 40.sp
}