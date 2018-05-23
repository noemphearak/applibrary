package com.example.noemphearak.applibrary;

import android.app.Activity;
import android.support.annotation.IdRes;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class IconsOnlyActivity extends Activity {
    private TextView messageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icons_only);

        messageView = (TextView) findViewById(R.id.messageView);

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                messageView.setText(TabMessage.get(tabId, false));
            }
        });

        bottomBar.setOnTabReselectListener(new OnTabReselectListener() {
            @Override
            public void onTabReSelected(@IdRes int tabId) {
                Toast.makeText(getApplicationContext(), TabMessage.get(tabId, true), Toast.LENGTH_LONG).show();
            }
        });
    }
}
