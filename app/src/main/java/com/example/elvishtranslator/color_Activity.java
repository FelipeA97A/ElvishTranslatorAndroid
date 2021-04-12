package com.example.elvishtranslator;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import android.os.Bundle;
import android.widget.ListView;

public class color_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_);

        ArrayList<Word> colors = setColors();
        ListView colorList = (ListView) findViewById(R.id.colorContainer);
        WordAdapter wordAdapter = new WordAdapter(this, 0, colors);
        colorList.setAdapter(wordAdapter);
    }

    public ArrayList<Word> setColors() {
        ArrayList<Word> colors = new ArrayList<Word>();
        colors.add(new Word("Rojo", "Caran", R.drawable.num1));
        colors.add(new Word("Carmín", "Carnin", R.drawable.num1));
        colors.add(new Word("Azul Marino", "Luin", R.drawable.num1));
        colors.add(new Word("Azul", "Elu", R.drawable.num1));
        colors.add(new Word("Amarillo", "Malen", R.drawable.num1));
        colors.add(new Word("Verde", "Calen", R.drawable.num1));
        colors.add(new Word("Negro", "Morn", R.drawable.num1));
        colors.add(new Word("Marrón oscuro", "Baran", R.drawable.num1));
        colors.add(new Word("Marrón", "Rhosg", R.drawable.num1));
        colors.add(new Word("Blanco", "Faen", R.drawable.num1));
        colors.add(new Word("Pálido", "Nimp", R.drawable.num1));
        colors.add(new Word("Gris", "Mith", R.drawable.num1));
        colors.add(new Word("Naranja", "Cull", R.drawable.num1));
        colors.add(new Word("Rosa", "Crinth", R.drawable.num1));
        colors.add(new Word("Violeta", "Ling", R.drawable.num1));
        return colors;
    }
}