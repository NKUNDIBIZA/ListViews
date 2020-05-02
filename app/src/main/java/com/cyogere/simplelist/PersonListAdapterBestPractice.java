package com.cyogere.simplelist;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.List;

public class PersonListAdapterBestPractice extends ArrayAdapter<Person> {

    public PersonListAdapterBestPractice(@NonNull Context context, int resource, @NonNull List<Person> objects) {
        super(context, resource, objects);
    }
}
