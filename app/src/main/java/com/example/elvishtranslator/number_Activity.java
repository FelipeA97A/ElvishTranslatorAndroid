
package com.example.elvishtranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class number_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_);

       /* ArrayList<String> numbers = new ArrayList<String>();
        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");
        numbers.add("Four");
        numbers.add("Five");
        numbers.add("Six");
        numbers.add("Seven");
        numbers.add("Eight");
        numbers.add("Nine");
        numbers.add("Ten");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numbers);
        ListView numberList = (ListView) findViewById(R.id.mainContainer);
        numberList.setAdapter(adapter);*/

        ArrayList<Word> numbers = setWords();

        ListView numberList = (ListView) findViewById(R.id.numberContainer);
        WordAdapter wordAdapter = new WordAdapter(this, 0, numbers);
        numberList.setAdapter(wordAdapter);
    }

    public ArrayList<Word> setWords() {
        ArrayList<Word> numbers = new ArrayList<Word>();
        numbers.add(new Word("Uno", "Mîn", R.drawable.num1));
        numbers.add(new Word("Dos", "Tâd", R.drawable.num2));
        numbers.add(new Word("Tres", "Nêl", R.drawable.num3));
        numbers.add(new Word("Cuatro", "Canad", R.drawable.num4));
        numbers.add(new Word("Cinco", "Leben", R.drawable.num5));
        numbers.add(new Word("Seis", "Eneg", R.drawable.num6));
        numbers.add(new Word("Siete", "Odog", R.drawable.num7));
        numbers.add(new Word("Ocho", "Tolodh", R.drawable.num8));
        numbers.add(new Word("Nueve", "Neder", R.drawable.num9));
        numbers.add(new Word("Diez", "Pae", R.drawable.num10));
        return numbers;
    }

}