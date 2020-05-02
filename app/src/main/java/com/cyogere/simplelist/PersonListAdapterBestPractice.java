package com.cyogere.simplelist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class PersonListAdapterBestPractice extends ArrayAdapter<Person> {

    private Context mContext;
    private int mResource;
    private int lastPosition = -1;

    public PersonListAdapterBestPractice(@NonNull Context context, int resource, @NonNull List<Person> objects) {
        super(context, resource, objects);

        this.mContext = context;
        this.mResource = resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        final View resultView;
        ViewHolder viewHolder;

        String name = getItem(position).getName();
        String birthday = getItem(position).getBirthday();
        String gender = getItem(position).getGender();
        Person person = new Person(name, birthday, gender);


        if(convertView == null) {

            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource,parent, false);

            viewHolder = new ViewHolder();
            viewHolder.nameTextView = convertView.findViewById(R.id.bestPracticeNameText);
            viewHolder.birthdayTextView = convertView.findViewById(R.id.bestPracticeBirthdayText);
            viewHolder.genderTextView = convertView.findViewById(R.id.bestPracticeGenderText);

            // ListView animation
             resultView = convertView;
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag(); // Tag is a way to store a view in memory
            resultView = convertView;
        }


        Animation animation = AnimationUtils.loadAnimation(mContext,
                (position > lastPosition)?R.anim.loading_down : R.anim.loading_up);
        resultView.startAnimation(animation);
        lastPosition = position;

        viewHolder.nameTextView.setText(name);
        viewHolder.birthdayTextView.setText(birthday);
        viewHolder.genderTextView.setText(gender);

        return convertView;

    }

    //##############################################################################################
       // For best practice, it's better to hold every view in a view class
    //##############################################################################################
    static class ViewHolder {

        TextView nameTextView;
        TextView birthdayTextView;
        TextView genderTextView;
    }
}
