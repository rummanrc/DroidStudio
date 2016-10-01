package com.uddin.tawsin.mrdoctor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class reg4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg4);
    }
    public void click1 (View view){
        Toast.makeText(reg4.this, "You are registered" , Toast.LENGTH_SHORT).show();
    }
}
