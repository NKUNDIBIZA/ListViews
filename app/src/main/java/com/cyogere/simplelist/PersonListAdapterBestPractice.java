package com.cyogere.simplelist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class PersonListAdapterBestPractice extends ArrayAdapter<Person> {

    Context mContext;
    int mResource;

    public PersonListAdapterBestPractice(@NonNull Context context, int resource, @NonNull List<Person> objects) {
        super(context, resource, objects);

        this.mContext = context;
        this.mResource = resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        inflater.inflate(mResource,parent, false);
        TextView nameTextView = convertView.findViewById(R.id.)
        return super.getView(position, convertView, parent);

    }
}
