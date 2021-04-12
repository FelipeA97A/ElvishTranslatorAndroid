package com.example.elvishtranslator;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import android.os.Bundle;
import android.widget.ListView;

public class family_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_);

        ArrayList<Word> wordList = setWords();
        ListView familyList = (ListView) findViewById(R.id.familyContainer);
        WordAdapter wordAdapter = new WordAdapter(this, 0, wordList);
        familyList.setAdapter(wordAdapter);

    }
    public ArrayList<Word> setWords() {
        ArrayList<Word> family = new ArrayList<Word>();
        family.add(new Word("Madre", "Naneth", R.drawable.num1));
        family.add(new Word("Padre" , "Adanadar", R.drawable.num1));
        family.add(new Word("Hijo", "Ionn", R.drawable.num1));
        family.add(new Word("Hija", "Sell", R.drawable.num1));
        family.add(new Word("Hermano", "Muindor", R.drawable.num1));
        family.add(new Word("Hermana", "Muinthel", R.drawable.num1));
        return family;
    }

}