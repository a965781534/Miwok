package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Context context, int colorResourceId, ArrayList<Word> arrayList) {
        super(context, 0, arrayList);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        final Word currentWord = getItem(position);

        TextView defaultWordView = (TextView) listItemView.findViewById(R.id.default_word);
        defaultWordView.setText(currentWord.getDefaultTranslation());

        TextView miwokWordView = (TextView) listItemView.findViewById(R.id.miwok_word);
        miwokWordView.setText(currentWord.getMiwokTranslation());

        ImageView imageResourceView = (ImageView) listItemView.findViewById(R.id.image_resource);
        if (currentWord.hasImage()){
            imageResourceView.setImageResource(currentWord.getImageResurceId());
            imageResourceView.setVisibility(View.VISIBLE);
        } else {
            imageResourceView.setVisibility(View.GONE);
        }

        LinearLayout layout = (LinearLayout) listItemView.findViewById(R.id.text_resource);
        layout.setBackgroundResource(mColorResourceId);

        return listItemView;
    }
}
