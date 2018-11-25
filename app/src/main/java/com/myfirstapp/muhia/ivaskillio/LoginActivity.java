package com.myfirstapp.muhia.ivaskillio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
     Button signupBtn,loginBtn;

     private EditText username, passwd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signupBtn = findViewById(R.id.signupbutton);
        loginBtn = findViewById(R.id.buttonLogin);
        username = findViewById(R.id.textUsername);
        passwd = findViewById(R.id.textPass);

        /*
            TODO

            1. Add recycler and link with this activity.
            2.

         */


        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Signup.class);
                startActivity(i);

            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }
        });





    }


}

