package com.example.elvishtranslator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Word> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View list_item = convertView;
        if (list_item == null) {
            list_item = LayoutInflater.from(getContext()).inflate(R.layout.item_list_words, parent, false);
        }
        Word currentWord = getItem(position);
        TextView spanishWord = (TextView) list_item.findViewById(R.id.spanishWord);
        spanishWord.setText(currentWord.getSpanishWord());
        TextView elvishWord = (TextView) list_item.findViewById(R.id.elvishWord);
        elvishWord.setText(currentWord.getElvishWord());
        ImageView image = (ImageView) list_item.findViewById(R.id.image);
        image.setImageResource(currentWord.getImg());
        return list_item;
    }
}
