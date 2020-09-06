package com.example.Atbo5ly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class acrtivity11 extends AppCompatActivity {


    private Button button ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acrtivity11);


        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity10 ();
            }
        });
    }
    public void  openactivity10 () {
        Intent intent = new Intent(this, activity10.class);
        startActivity(intent);





    }
}
