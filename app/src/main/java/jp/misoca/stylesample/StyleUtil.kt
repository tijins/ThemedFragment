package jp.misoca.stylesample

import android.content.Context
import androidx.annotation.StyleRes
import androidx.appcompat.view.ContextThemeWrapper

object StyleUtil {
    fun getWindowLightStatusBar(context: Context, @StyleRes styleRes: Int): Boolean {
        val themedContext = ContextThemeWrapper(context, styleRes)
        val windowLightStatusBar = themedContext.theme.obtainStyledAttributes(
                intArrayOf(android.R.attr.windowLightStatusBar)
        ).use {
            it.getBoolean(0, false)
        }
        return windowLightStatusBar
    }
}
