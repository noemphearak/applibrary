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
    }
}
