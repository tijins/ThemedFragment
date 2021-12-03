# Fragment別のThemeと、ステータスバー文字色の制御サンプル

## Navigation
FragmentにToolbarまで実装した単一Activityのアプリケーションになっています。
画面遷移はJetpack Navigationで行っています。

## ThemedFragment
Fragment毎に異なるThemeを指定できるFragmentです

## ステータスバー文字色
ステータスバー文字色はThemeのwindowLightStatusBarで制御できますが、Fragmentに指定するだけでは反映されません。
フラグメントが遷移したときに、動的に変更してます。

```kotlin:MainActivity.kt
navHost.childFragmentManager.addOnBackStackChangedListener {
    // ステータスバーの文字色を反映
}
```
