package com.uddin.tawsin.mrdoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void click1 (View view){
        Intent i = new Intent(this, login2.class);
        startActivity(i);
    }
    public void click2 (View view){
        Intent i = new Intent(this, login3.class);
        startActivity(i);
    }
}
