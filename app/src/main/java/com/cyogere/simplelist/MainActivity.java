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

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started_NKUNDIBIZA ALLY");
        final ListView listView = findViewById(R.id.listView);
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
        ArrayAdapter listAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, namesList);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String i = (String) listView.getItemAtPosition(position);

                if(i.equals("NextList")) {

                    Toast.makeText(getApplicationContext(), "Started a new activity", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(getApplicationContext(), SimpleListLayout.class);
                    startActivity(intent);
                } else {

                    Toast.makeText(getApplicationContext(), i, Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
