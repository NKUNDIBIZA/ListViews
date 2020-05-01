package com.cyogere.simplelist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

class PersonListAdapter extends ArrayAdapter<Person> {

    private static final String TAG = "PersonListAdapter";
    Context mContext;
    int mResource;

    public PersonListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Person> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ///LayoutInflater layoutInflater = new LayoutInflater().from(mContext);
        LayoutInflater inflater =  LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false); //this is not a good practice

        String name = getItem(position).getName();
        String birthday = getItem(position).getBirthday();
        String gender = getItem(position).getGender();
        Person person = new Person(name, birthday, gender);

        TextView nameText = convertView.findViewById(R.id.nameText);
        TextView birthdayText = convertView.findViewById(R.id.birthdayText);
        TextView genderText = convertView.findViewById(R.id.genderText);

        nameText.setText(name);
        birthdayText.setText(birthday);
        genderText.setText(gender);

        return convertView;
    }
}
