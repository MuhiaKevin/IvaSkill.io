package com.myfirstapp.muhia.ivaskillio;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     Button loginBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.buttonLogin);

        loginBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                // create a toast
//
//                Toast toast=Toast.makeText(getApplicationContext(),"Button Pressed by Osundwa",Toast.LENGTH_SHORT);
//                toast.show();



               // create a new activity
//
//                Intent i = new Intent(getApplicationContext(),Signup.class);
//                startActivity(i);

                Uri webpage;
                webpage = Uri.parse("https://github.com/MuhiaKevin");

                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);


            }


        });


    }


}

