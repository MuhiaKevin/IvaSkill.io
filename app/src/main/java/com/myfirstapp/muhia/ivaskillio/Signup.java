package com.myfirstapp.muhia.ivaskillio;


import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity  {

    public static final String DATABASE_NAME = "ivaskilldb"; // set name for db

    SQLiteDatabase myDatabase; // create database
    EditText lastName,firstName, emailText, passwordText;
    Button sign;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        myDatabase = openOrCreateDatabase(DATABASE_NAME, MODE_PRIVATE,null);
       //createTable(); // call method to create the database

        firstName = (EditText) findViewById(R.id.editTextFirstName);
        lastName = (EditText) findViewById(R.id.editTextLastName);
        emailText = (EditText) findViewById(R.id.editTextEmail);
        passwordText = (EditText) findViewById(R.id.editTextPass);

        sign = findViewById(R.id.buttonSignup);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addUser();
            }
        });

    }


    // method to add users to database

    private void addUser(){

        String firstname = firstName.getText().toString().trim();
        String lastname = lastName.getText().toString().trim();
        String email = emailText.getText().toString().trim();
        String password = passwordText.getText().toString().trim();

        if (firstname.isEmpty()) {
            firstName.setError("First name cannot be found!");
            firstName.requestFocus();
            return;
        }
        if (lastname.isEmpty()) {
            lastName.setError("Last name cannot be found!");
            lastName.requestFocus();
            return;
        }
        if (email.isEmpty()) {
            emailText.setError("Email cannot be found!");
            emailText.requestFocus();
            return;
        }
        if (password.isEmpty()) {
            passwordText.setError("Password cannot be found!");
            passwordText.requestFocus();
            return;
        }

        String sqlInsert = "INSERT INTO users (firstname, lastname, email, password )" +
                "VALUES (?, ?, ?, ?)";

        myDatabase.execSQL(sqlInsert,new String[]{ firstname,lastname, email, password });
        Toast.makeText(this,"User added", Toast.LENGTH_SHORT).show();

        // go back to login activity

        Intent i = new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(i);

    }


    // method to create users table

    private void createTable(){

        String sql = "CREATE TABLE users(" +
                "id INTEGER NOT NULL CONSTRAINT users_id PRIMARY KEY AUTOINCREMENT," +
                "firstname varchar(200) NOT NULL," +
                "lastname varchar(200) NOT NULL," +
                "email varchar(200) NOT NULL," +
                "password varchar(100) NOT NULL" +
                ");";

        myDatabase.execSQL(sql);
    }


}

