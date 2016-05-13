package io.github.hanihashemi.slidingpanelayoutexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.github.hanihashemi.slidingpanelayoutlib.SlidingPaneLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) findViewById(R.id.layout_sliding);
        slidingPaneLayout.setEnable(false);
    }
}
