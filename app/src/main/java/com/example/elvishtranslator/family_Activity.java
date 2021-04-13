package com.example.elvishtranslator;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class family_Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ArrayList<Word> family = new ArrayList<Word>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_);

        family = setWords();
        ListView familyList = (ListView) findViewById(R.id.familyContainer);
        WordAdapter wordAdapter = new WordAdapter(this, 0, family);
        familyList.setAdapter(wordAdapter);
        familyList.setOnItemClickListener(this);

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

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        Toast info = Toast.makeText(this, "Haciendo click en: " + family.get(i).getSpanishWord() + ".", Toast.LENGTH_SHORT);
        info.show();
    }
}