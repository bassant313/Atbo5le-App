package com.example.Atbo5ly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class Contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    public void browser1(View view){

        Intent browserintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Otbo5ly-101404144974503"));
        startActivity(browserintent);



    }


    public void browser3(View view){

        Intent browser3intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/Otbo5lyApp"));
        startActivity(browser3intent);
    }



}
