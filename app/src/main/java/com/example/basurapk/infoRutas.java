package com.example.basurapk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class infoRutas extends AppCompatActivity {


    Button Return;
    Button Emerg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Return = (Button) findViewById(R.id.Btnret);
        Return.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Return = new Intent(infoRutas.this, MainActivity.class);
                startActivity(Return);

            }
        });
    }


}