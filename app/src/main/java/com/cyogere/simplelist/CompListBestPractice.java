package com.cyogere.simplelist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CompListBestPractice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_list_best_practice);

        Person ally = new Person("NextList", "03-05-1991", "Object");
        Person leader = new Person("Leader", "27-12-1992", "female");
        Person cyprian = new Person("Cyprian", "24-08-1993", "Male");
        Person freddy = new Person("Freddy", "22-01-1987", "Male");
        Person louise = new Person("Louise", "26-01-1978", "female");
        Person ally1 = new Person("Ally", "22-08-1991", "Male");
        Person leader1 = new Person("Leader", "27-12-1992", "female");
        Person cyprian1 = new Person("Cyprian", "24-08-1993", "Male");
        Person freddy1 = new Person("Freddy", "22-01-1987", "Male");
        Person louise1 = new Person("Louise", "26-01-1978", "Male");
        Person ally2 = new Person("Ally", "22-08-1991", "Male");
        Person leader2 = new Person("Leader", "27-12-1992", "female");
        Person cyprian2 = new Person("Cyprian", "24-08-1993", "Male");
        Person freddy2 = new Person("Freddy", "22-01-1987", "Male");
        Person louise2 = new Person("Louise", "26-01-1978", "female");
        Person ally3 = new Person("Ally", "22-08-1991", "Male");
        Person leader3 = new Person("Leader", "27-12-1992", "female");
        Person cyprian3 = new Person("Cyprian", "24-08-1993", "Male");
        Person freddy3 = new Person("Freddy", "22-01-1987", "Male");
        Person louise3 = new Person("Louise", "26-01-1978", "female");
        Person ally4 = new Person("Ally", "22-08-1991", "Male");
        Person leader4 = new Person("Leader", "27-12-1992", "female");
        Person cyprian4 = new Person("Cyprian", "24-08-1993", "Male");
        Person freddy4 = new Person("Freddy", "22-01-1987", "Male");
        Person louise4 = new Person("Louise", "26-01-1978", "female");
        Person ally5 = new Person("Ally", "22-08-1991", "Male");
        Person leader5 = new Person("Leader", "27-12-1992", "female");
        Person cyprian5 = new Person("Cyprian", "24-08-1993", "Male");
        Person freddy5 = new Person("Freddy", "22-01-1987", "Male");
        Person louise5 = new Person("Louise", "26-01-1978", "female");

        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(ally); peopleList.add(leader); peopleList.add(cyprian); peopleList.add(freddy); peopleList.add(louise);
        peopleList.add(ally1); peopleList.add(leader1); peopleList.add(cyprian1); peopleList.add(freddy1); peopleList.add(louise1);
        peopleList.add(ally2); peopleList.add(leader2); peopleList.add(cyprian2); peopleList.add(freddy2); peopleList.add(louise2);
        peopleList.add(ally3); peopleList.add(leader3); peopleList.add(cyprian3); peopleList.add(freddy3); peopleList.add(louise3);
        peopleList.add(ally4); peopleList.add(leader4); peopleList.add(cyprian4); peopleList.add(freddy4); peopleList.add(louise4);
        peopleList.add(ally5); peopleList.add(leader5); peopleList.add(cyprian5); peopleList.add(freddy5); peopleList.add(louise5);

        //Create an adapter
        PersonListAdapterBestPractice adapter = new PersonListAdapterBestPractice(this, R.layout.adapter_view_best_practice_layout, peopleList);
        ListView complexListView = findViewById(R.id.bestPracticeComplexListView);
        complexListView.setAdapter(adapter);

        complexListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0)
                    Toast.makeText(getApplicationContext(), "Position: "+position+" Clicked", Toast.LENGTH_SHORT).show();
                else {
                    Intent intent = new Intent(getApplicationContext(), CompListBestPracticeWithPictures.class);
                    startActivity(intent);
                }
            }
        });
    }
}
