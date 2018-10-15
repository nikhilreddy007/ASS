package com.example.nikhilreddy.ass;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ArticleAdapter extends ArrayAdapter<Link> {
    private int colorId;

    public ArticleAdapter(Context context, ArrayList<Link> arrayList, int colorId){
        super(context,0,arrayList);
        this.colorId = colorId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_view,parent,false);
        }

        Link currentLink = getItem(position);

        TextView numberView = (TextView) listItemView.findViewById(R.id.number_text);
        numberView.setText(String.valueOf(currentLink.getNumber()));

        GradientDrawable magnitudeCircle = (GradientDrawable) numberView.getBackground();
        int magnitudeColor = getMagnitudeColor(currentLink.getNumber());
        magnitudeCircle.setColor(magnitudeColor);

        TextView chapterView = (TextView) listItemView.findViewById(R.id.chapter_text);
        chapterView.setText(currentLink.getChapter());

        LinearLayout linearLayout = (LinearLayout)listItemView.findViewById(R.id.list_for_item);
        int color = ContextCompat.getColor(getContext(),colorId);
        linearLayout.setBackgroundColor(color);

        return listItemView;
    }

    private int getMagnitudeColor(int magnitude) {
        int magnitudeColorResourceId;
        int magnitudeFloor = magnitude%5;
        switch (magnitudeFloor) {
            case 0:
                magnitudeColorResourceId = R.color.yellow;
                break;
            case 1:
                magnitudeColorResourceId = R.color.bg_screen1;
                break;
            case 2:
                magnitudeColorResourceId = R.color.bg_screen2;
                break;
            case 3:
                magnitudeColorResourceId = R.color.bg_screen3;
                break;
            case 4:
                magnitudeColorResourceId = R.color.bg_screen4;
                break;
            default:
                magnitudeColorResourceId = R.color.bg_screen1;
                break;
        }
        return ContextCompat.getColor(getContext(), magnitudeColorResourceId);
    }
}
