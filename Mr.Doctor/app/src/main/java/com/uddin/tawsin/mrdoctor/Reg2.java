package com.uddin.tawsin.mrdoctor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Reg2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg2);
    }
    public void click1 (View view){
        Toast.makeText(Reg2.this, "You are registered", Toast.LENGTH_SHORT).show();
    }
}
