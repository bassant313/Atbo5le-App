package com.example.Atbo5ly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class check extends AppCompatActivity {

    Button إرسال;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);


        إرسال = (Button)findViewById(R.id.button1);
        إرسال.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "تم إرسال طلبك." , Toast.LENGTH_LONG) .show();
            }
        });
    }
}
