package com.amador.spmm;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Homepage extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        Intent intent = getIntent();
        String message = intent.getStringExtra(LoginPage.EXTRA_MESSAGE);
        TextView textView = (TextView) findViewById(R.id.username_display);
        textView.setText(message);
    }
}
