AttributeDemo
====

借鉴各自定义控件实现样式的方式，处理Library中界面需要在主工程自定义。

```xml
<style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
    <!-- Customize your theme here. -->
    <item name="libTheme">@style/LibTheme</item>
</style>

<style name="LibTheme" parent="LibDefaultStyle">
    <item name="libTitleBackground">@android:color/holo_green_light</item>
</style>
```

通过在主工程中配置对应的属性实现Library界面可配置

https://eyyoung.github.io/2014/12/13/android-attr/
