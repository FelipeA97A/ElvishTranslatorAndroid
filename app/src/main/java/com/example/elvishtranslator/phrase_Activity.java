package com.example.elvishtranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class phrase_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrase_);
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
}