package jp.misoca.stylesample

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val navHost = supportFragmentManager.findFragmentById(R.id.nav_host)!!
        navHost.childFragmentManager.addOnBackStackChangedListener {
            val currentFragment = navHost.childFragmentManager.fragments.firstOrNull()
            if (currentFragment is ThemedFragment) {
                val isLight = StyleUtil.getWindowLightStatusBar(this, currentFragment.styleRes)
                setLightStatusBar(isLight)
            }
        }
    }

    private fun setLightStatusBar(isLight: Boolean) {
        if (isLight) {
            window.decorView.systemUiVisibility =
                    window.decorView.systemUiVisibility or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        } else {
            window.decorView.systemUiVisibility =
                    window.decorView.systemUiVisibility and View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR.inv()
        }
    }
}
