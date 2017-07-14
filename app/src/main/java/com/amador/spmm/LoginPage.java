package com.amador.spmm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginPage extends AppCompatActivity {
    public static final String EXTRA_MESSAGE ="com.amador.spmm.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this,Homepage.class );
        EditText editText = (EditText) findViewById(R.id.username_input);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
