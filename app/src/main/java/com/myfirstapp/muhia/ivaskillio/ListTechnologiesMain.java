package com.myfirstapp.muhia.ivaskillio;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;


import java.util.ArrayList;
import java.util.List;


public class ListTechnologiesMain extends AppCompatActivity {

    RecyclerView recyclerView; // create an instance of a recycler view

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_techonologies);

        List <Technologies_model> list_technologies = new ArrayList<>();
        TechnologiesAdapter technologiesAdapter;


    }

}