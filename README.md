# SlidingPaneLayout
Supporting right to left

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

# Installing

Step 1:Add the JitPack repository to your build file
```gradle
allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
```

Step 2:Add the dependency
```gradle
dependencies {
	        compile 'com.github.hanihashemi:SlidingPaneLayout:1.0'
	}
```
