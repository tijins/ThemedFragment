package jp.misoca.stylesample

import android.content.Context
import androidx.annotation.StyleRes
import androidx.appcompat.view.ContextThemeWrapper

object StyleUtil {
    fun getWindowLightStatusBar(context: Context, @StyleRes styleRes: Int): Boolean {
        val themedContext = ContextThemeWrapper(context, styleRes)
        val typedArray = themedContext.theme.obtainStyledAttributes(
                intArrayOf(android.R.attr.windowLightStatusBar)
        )
        val isLight = typedArray.getBoolean(0, false)
        typedArray.recycle()
        return isLight
    }
}
