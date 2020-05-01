package com.cyogere.simplelist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SimpleListLayout extends AppCompatActivity {

    private static final String TAG = "SimpleListLayout";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list_layout);  //simple_list_custom_layout created by me

        Log.d(TAG, "onCreate: Started_NKUNDIBIZA ALLY");
        final ListView CustomList = findViewById(R.id.customListView);
        List<String> namesList = new ArrayList<>();  // or ArrayList<String> namesList = new ArrayList<>();
        namesList.add("NextList");
        namesList.add("Uwayezu");
        namesList.add("Nshimiyimana");
        namesList.add("Sinzabakiwra");
        namesList.add("Uwimana");
        namesList.add("Gasakure");
        namesList.add("Nkundibiza");
        namesList.add("Uwayezu");
        namesList.add("Nshimiyimana");
        namesList.add("Sinzabakiwra");
        namesList.add("Uwimana");
        namesList.add("Gasakure");
        namesList.add("Nkundibiza");
        namesList.add("Uwayezu");
        namesList.add("Nshimiyimana");
        namesList.add("Sinzabakiwra");
        namesList.add("Uwimana");
        namesList.add("Gasakure");
        namesList.add("Nkundibiza");
        namesList.add("Uwayezu");
        namesList.add("Nshimiyimana");
        namesList.add("Sinzabakiwra");
        namesList.add("Uwimana");
        namesList.add("Gasakure");
        namesList.add("Nkundibiza");
        namesList.add("Uwayezu");
        namesList.add("Nshimiyimana");
        namesList.add("Sinzabakiwra");
        namesList.add("Uwimana");
        namesList.add("Gasakure");
        namesList.add("Nkundibiza");
        namesList.add("Uwayezu");
        namesList.add("Nshimiyimana");
        namesList.add("Sinzabakiwra");
        namesList.add("Uwimana");
        namesList.add("Gasakure");

        // Array adapter
        ArrayAdapter listAdapter = new ArrayAdapter(getApplicationContext(), R.layout.simple_list_custom_layout, namesList);
        CustomList.setAdapter(listAdapter);

        //On first item click, go to the next activity
        CustomList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String i = (String) CustomList.getItemAtPosition(position);
                    Toast.makeText(getApplicationContext(), i, Toast.LENGTH_LONG).show();
            }
        });
    }
}
