package com.example.nikhilreddy.ass;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * This is used for the slider in the main activity
 */

public class MyAdapter extends PagerAdapter{
    private ArrayList<Integer> images;
    private LayoutInflater inflater;
    private Context context;

    /**
     * Constructor for MyAdapter class
     * @param context1
     * @param images
     */
    public MyAdapter(Context context1, ArrayList<Integer> images) {
        this.context = context1;
        this.images=images;
        inflater = LayoutInflater.from(context);
    }

    /**
     *
     * @param container
     * @param position
     * @param object
     */
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    /**
     * it returns the number of images in the ArrayList
     * @return
     */
    @Override
    public int getCount() {
        return images.size();
    }

    /**
     *
     * @param view
     * @param position
     * @return
     */
    @Override
    public Object instantiateItem(ViewGroup view, int position) {
        View myImageLayout = inflater.inflate(R.layout.slide, view, false);
        ImageView myImage = (ImageView) myImageLayout.findViewById(R.id.image);
        myImage.setImageResource(images.get(position));
        view.addView(myImageLayout, 0);
        return myImageLayout;
    }

    /**
     *
     * @param view
     * @param object
     * @return
     */
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }
}
