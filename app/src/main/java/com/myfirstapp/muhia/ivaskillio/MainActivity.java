package com.myfirstapp.muhia.ivaskillio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    // categories to be shown in the spinner

    String[] options = {  "Latest Technological Stack", "Programming languages", "Web Frameworks",
            "Javascript Frameworks & Libraries"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spin = (Spinner) findViewById(R.id.spinner); // creating instance of spinner
        spin.setOnItemSelectedListener(this);


        ArrayAdapter<String> aa = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, options); // sending the array to the spinner
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);

    }

    // show Toast when item selected
    // TODO
    // call the recyclerview activity and send what its supposed to show

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), options[position] , Toast.LENGTH_LONG).show();
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}