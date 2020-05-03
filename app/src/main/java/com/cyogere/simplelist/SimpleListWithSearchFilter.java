package com.cyogere.simplelist;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class SimpleListWithSearchFilter extends AppCompatActivity {

    private ArrayAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list_with_search_filter);

        final ListView listView = findViewById(R.id.searchFilterListView);
        EditText searchEditText =  findViewById(R.id.searchEditText);
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
        listAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, namesList);
        listView.setAdapter(listAdapter);

        //On first item click, go to the next activity
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

        searchEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                (SimpleListWithSearchFilter.this).listAdapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
}
