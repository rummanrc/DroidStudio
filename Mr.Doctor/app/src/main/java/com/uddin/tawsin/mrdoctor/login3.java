package com.uddin.tawsin.mrdoctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class login3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login3);
    }
    public void click1 (View view){
        Toast.makeText(login3.this, "You are logged in", Toast.LENGTH_SHORT).show();
    }
    public void click2 (View view){
        startActivity(new Intent(this, MainActivity.class));
    }
}
