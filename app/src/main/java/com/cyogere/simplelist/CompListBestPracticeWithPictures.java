package com.cyogere.simplelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CompListBestPracticeWithPictures extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_list_best_practice_with_pictures);

        PersonWithImage ally = new PersonWithImage("Ally", "22-08-1991", "Male","https://cdn.pixabay.com/photo/2017/04/03/03/58/african-2197414_1280.jpg");
        PersonWithImage leader = new PersonWithImage("Leader", "27-12-1992", "female","https://cdn.pixabay.com/photo/2014/10/30/17/32/boy-509488_1280.jpg");
        PersonWithImage cyprian = new PersonWithImage("Cyprian", "24-08-1993", "Male","https://cdn.pixabay.com/photo/2014/10/30/17/32/boy-509488_1280.jpg");
        PersonWithImage freddy = new PersonWithImage("Freddy", "22-01-1987", "Male","https://cdn.pixabay.com/photo/2014/10/30/17/32/boy-509488_1280.jpg");
        PersonWithImage louise = new PersonWithImage("Louise", "26-01-1978", "female","https://cdn.pixabay.com/photo/2012/11/06/15/40/tree-64310_1280.jpg");
        PersonWithImage ally1 = new PersonWithImage("Ally", "22-08-1991", "Male","https://cdn.pixabay.com/photo/2014/10/30/17/32/boy-509488_1280.jpg");
        PersonWithImage leader1 = new PersonWithImage("Leader", "27-12-1992", "female","https://cdn.pixabay.com/photo/2017/04/11/21/34/giraffe-2222908_1280.jpg");
        PersonWithImage cyprian1 = new PersonWithImage("Cyprian", "24-08-1993", "Male","https://cdn.pixabay.com/photo/2017/04/11/21/34/giraffe-2222908_1280.jpg");
        PersonWithImage freddy1 = new PersonWithImage("Freddy", "22-01-1987", "Male","https://cdn.pixabay.com/photo/2017/04/11/21/34/giraffe-2222908_1280.jpg");
        PersonWithImage louise1 = new PersonWithImage("Louise", "26-01-1978", "Male","https://cdn.pixabay.com/photo/2012/11/06/15/40/tree-64310_1280.jpg");
        PersonWithImage ally2 = new PersonWithImage("Ally", "22-08-1991", "Male","https://cdn.pixabay.com/photo/2012/10/10/10/28/africa-60570_1280.jpg");
        PersonWithImage leader2 = new PersonWithImage("Leader", "27-12-1992", "female","https://cdn.pixabay.com/photo/2017/01/20/13/01/africa-1994846_1280.jpg");
        PersonWithImage cyprian2 = new PersonWithImage("Cyprian", "24-08-1993", "Male","https://cdn.pixabay.com/photo/2020/04/23/19/15/face-5083690_960_720.jpg");
        PersonWithImage freddy2 = new PersonWithImage("Freddy", "22-01-1987", "Male","https://cdn.pixabay.com/photo/2018/04/01/22/00/cosmos-3282262_1280.jpg");
        PersonWithImage louise2 = new PersonWithImage("Louise", "26-01-1978", "female","https://cdn.pixabay.com/photo/2012/11/06/15/40/tree-64310_1280.jpg");
        PersonWithImage ally3 = new PersonWithImage("Ally", "22-08-1991", "Male","https://cdn.pixabay.com/photo/2018/04/01/22/00/cosmos-3282262_1280.jpg");
        PersonWithImage leader3 = new PersonWithImage("Leader", "27-12-1992", "female","https://cdn.pixabay.com/photo/2018/04/01/22/00/cosmos-3282262_1280.jpg");
        PersonWithImage cyprian3 = new PersonWithImage("Cyprian", "24-08-1993", "Male","https://cdn.pixabay.com/photo/2017/01/20/13/01/africa-1994846_1280.jpg");
        PersonWithImage freddy3 = new PersonWithImage("Freddy", "22-01-1987", "Male","https://cdn.pixabay.com/photo/2012/10/10/10/28/africa-60570_1280.jpg");
        PersonWithImage louise3 = new PersonWithImage("Louise", "26-01-1978", "female","https://cdn.pixabay.com/photo/2017/04/11/21/34/giraffe-2222908_1280.jpg");
        PersonWithImage ally4 = new PersonWithImage("Ally", "22-08-1991", "Male","https://cdn.pixabay.com/photo/2018/04/01/22/00/cosmos-3282262_1280.jpg");
        PersonWithImage leader4 = new PersonWithImage("Leader", "27-12-1992", "female","https://cdn.pixabay.com/photo/2012/10/10/10/28/africa-60570_1280.jpg");
        PersonWithImage cyprian4 = new PersonWithImage("Cyprian", "24-08-1993", "Male", "https://cdn.pixabay.com/photo/2020/04/23/19/15/face-5083690_960_720.jpg");
        PersonWithImage freddy4 = new PersonWithImage("Freddy", "22-01-1987", "Male","https://cdn.pixabay.com/photo/2020/04/23/19/15/face-5083690_960_720.jpg");
        PersonWithImage louise4 = new PersonWithImage("Louise", "26-01-1978", "female","https://cdn.pixabay.com/photo/2017/04/11/21/34/giraffe-2222908_1280.jpg");
        PersonWithImage ally5 = new PersonWithImage("Ally", "22-08-1991", "Male","https://cdn.pixabay.com/photo/2017/01/20/13/01/africa-1994846_1280.jpg");
        PersonWithImage leader5 = new PersonWithImage("Leader", "27-12-1992", "female","https://cdn.pixabay.com/photo/2012/11/06/15/40/tree-64310_1280.jpg");
        PersonWithImage cyprian5 = new PersonWithImage("Cyprian", "24-08-1993", "Male","https://cdn.pixabay.com/photo/2018/04/01/22/00/cosmos-3282262_1280.jpg");
        PersonWithImage freddy5 = new PersonWithImage("Freddy", "22-01-1987", "Male","https://cdn.pixabay.com/photo/2012/11/06/15/40/tree-64310_1280.jpg");
        PersonWithImage louise5 = new PersonWithImage("Louise", "26-01-1978", "female","https://cdn.pixabay.com/photo/2016/01/13/22/46/orphan-1139042_1280.jpg");

        ArrayList<PersonWithImage> peopleList = new ArrayList<>();
        peopleList.add(ally); peopleList.add(leader); peopleList.add(cyprian); peopleList.add(freddy); peopleList.add(louise);
        peopleList.add(ally1); peopleList.add(leader1); peopleList.add(cyprian1); peopleList.add(freddy1); peopleList.add(louise1);
        peopleList.add(ally2); peopleList.add(leader2); peopleList.add(cyprian2); peopleList.add(freddy2); peopleList.add(louise2);
        peopleList.add(ally3); peopleList.add(leader3); peopleList.add(cyprian3); peopleList.add(freddy3); peopleList.add(louise3);
        peopleList.add(ally4); peopleList.add(leader4); peopleList.add(cyprian4); peopleList.add(freddy4); peopleList.add(louise4);
        peopleList.add(ally5); peopleList.add(leader5); peopleList.add(cyprian5); peopleList.add(freddy5); peopleList.add(louise5);

        //Create an adapter
        PersonListAdapterBestPracticePictures adapter = new PersonListAdapterBestPracticePictures(this, R.layout.adapter_view_best_practice_with_pictures_layout, peopleList);
        ListView complexListView = findViewById(R.id.pictureComplexListView);
        complexListView.setAdapter(adapter);
    }
}
