package com.example.Atbo5ly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button button = (Button) findViewById(R.id.button);
    Button button1 = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent int1 = new Intent(MainActivity.this, activity10.class);
            startActivity(int1);
        }
    });
        button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent int2 = new Intent(MainActivity.this, activity2.class);
            startActivity(int2);
        }
    });


}
}
