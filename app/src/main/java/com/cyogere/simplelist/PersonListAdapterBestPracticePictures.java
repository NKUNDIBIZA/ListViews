package com.cyogere.simplelist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;

import java.util.ArrayList;

public class PersonListAdapterBestPracticePictures extends ArrayAdapter<PersonWithImage> {

    private Context mContext;
    private int mResource;
    private int lastPosition = -1;

    public PersonListAdapterBestPracticePictures(@NonNull Context context, int resource, @NonNull ArrayList<PersonWithImage> objects) {
        super(context, resource, objects);

        this.mContext = context;
        this.mResource = resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        setupImageLoader(); // Setup image loader

        final View resultView;
        ViewHolder viewHolder;

        String name = getItem(position).getName();
        String birthday = getItem(position).getBirthday();
        String gender = getItem(position).getGender();
        String imageURL = getItem(position).getImageURL();
        //PersonWithImage personWithImage = new PersonWithImage(name, birthday, gender, imageURL);


        if(convertView == null) {

            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource,parent, false);

            viewHolder = new ViewHolder();
            viewHolder.nameTextView = convertView.findViewById(R.id.imageName);
            viewHolder.birthdayTextView = convertView.findViewById(R.id.birthday);
            viewHolder.genderTextView = convertView.findViewById(R.id.gender);
            viewHolder.listImageView = convertView.findViewById(R.id.imageView);

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

        int defaultImg = mContext.getResources().getIdentifier("@drawable/ic_launcher_background",null, mContext.getOpPackageName());

        ImageLoader imageLoader = ImageLoader.getInstance();
        DisplayImageOptions options = new DisplayImageOptions.Builder().cacheInMemory(true)
                .cacheOnDisc(true).resetViewBeforeLoading(true)
                .showImageForEmptyUri(defaultImg)
                .showImageOnFail(defaultImg)
                .showImageOnLoading(defaultImg)
                .build();


        viewHolder.nameTextView.setText(name);
        viewHolder.birthdayTextView.setText(birthday);
        viewHolder.genderTextView.setText(gender);

        // Download the image
        imageLoader.displayImage(imageURL, viewHolder.listImageView, options);

        return convertView;

    }

    //##############################################################################################
       // For best practice, it's better to hold every view in a view class
    //##############################################################################################
    static class ViewHolder {

        TextView nameTextView;
        TextView birthdayTextView;
        TextView genderTextView;
        ImageView listImageView;
    }

    //##############################################################################################
        // Setting up Image Loader
    //##############################################################################################

    private void setupImageLoader(){
        // UNIVERSAL IMAGE LOADER SETUP
        DisplayImageOptions defaultOptions = new DisplayImageOptions.Builder()
                .cacheOnDisc(true).cacheInMemory(true)
                .imageScaleType(ImageScaleType.EXACTLY)
                .displayer(new FadeInBitmapDisplayer(300)).build();

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(
                mContext)
                .defaultDisplayImageOptions(defaultOptions)
                .memoryCache(new WeakMemoryCache())
                .discCacheSize(100 * 1024 * 1024).build();

        ImageLoader.getInstance().init(config);
        // END - UNIVERSAL IMAGE LOADER SET
    }
}
