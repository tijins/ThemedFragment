package jp.misoca.stylesample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.annotation.StyleRes
import androidx.appcompat.view.ContextThemeWrapper
import androidx.fragment.app.Fragment

abstract class ThemedFragment(@LayoutRes val layoutRes: Int, @StyleRes val styleRes: Int) : Fragment(layoutRes) {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val themedContext = ContextThemeWrapper(context, styleRes)
        val themedInflater = inflater.cloneInContext(themedContext)
        return super.onCreateView(themedInflater, container, savedInstanceState)
    }
}
