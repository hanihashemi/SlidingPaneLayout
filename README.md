# SlidingPaneLayout
Supporting right to left and left to right 

![Img](https://raw.githubusercontent.com/hanihashemi/SlidingPaneLayout/master/screen_shot/sample.gif)

Usage:
```xml
<io.github.hanihashemi.slidingpanelayoutlib.SlidingPaneLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:align="right_to_left">

    <FrameLayout
        android:layout_width="240dp"
        android:layout_height="match_parent"
        android:background="@color/mainLayout"/>

    <FrameLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@color/paneLayout" />

</io.github.hanihashemi.slidingpanelayoutlib.SlidingPaneLayout>
```

