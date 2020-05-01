package com.cyogere.simplelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started_NKUNDIBIZA ALLY");
        ListView listView = findViewById(R.id.listView);
        List<String> namesList = new ArrayList<>();  // or ArrayList<String> namesList = new ArrayList<>();
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
        namesList.add("Nkundibiza");
        namesList.add("Uwayezu");
        namesList.add("Nshimiyimana");
        namesList.add("Sinzabakiwra");
        namesList.add("Uwimana");
        namesList.add("Gasakure");


        // Array adapter
        ArrayAdapter listAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, namesList);
        listView.setAdapter(listAdapter);

    }
}
