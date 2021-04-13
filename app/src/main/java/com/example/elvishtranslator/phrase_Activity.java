package com.example.elvishtranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class phrase_Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ArrayList<Word> phrases = new ArrayList<Word>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrase_);

          phrases = setPhrases();
          ListView phraseList = (ListView) findViewById(R.id.phraseContainer);
          WordAdapter wordAdapter = new WordAdapter(this, 0, phrases);
          phraseList.setAdapter(wordAdapter);
          phraseList.setOnItemClickListener(this);
    }

      public ArrayList<Word> setPhrases() {
          ArrayList<Word> sentences = new ArrayList<Word>();
          sentences.add(new Word("Buenos días", "Alassea Ree", R.drawable.num1));
          sentences.add(new Word("¿Quién eres?", "Man nalye?", R.drawable.num1));
          sentences.add(new Word("¿Cómo te llamas?", "Man naa esselya?", R.drawable.num1));
          sentences.add(new Word("Ven y siéntate con nosotros", "Tula ar o elme haara", R.drawable.num1));
          sentences.add(new Word("Buena suerte", "Annali len", R.drawable.num1));
          sentences.add(new Word("Hasta pronto", "Tenna rato", R.drawable.num1));
          sentences.add(new Word("Nos vemos", "Enomentuvalve", R.drawable.num1));
          sentences.add(new Word("Felices sueños", "Alassie oloori", R.drawable.num1));
          sentences.add(new Word("¡Vuelve pronto!", "Entula rato!", R.drawable.num1));
          return sentences;
      }

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
            Toast info = Toast.makeText(this, "Haciendo click en: " + phrases.get(i).getSpanishWord() + ".", Toast.LENGTH_SHORT);
            info.show();
        }
}