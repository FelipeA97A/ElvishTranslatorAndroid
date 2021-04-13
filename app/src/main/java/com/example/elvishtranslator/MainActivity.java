package com.example.elvishtranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Timer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView number, family, color, phrase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = findViewById(R.id.txtVwNumeros);
        family = findViewById(R.id.txtVwFamilia);
        color = findViewById(R.id.txtVwColores);
        phrase = findViewById(R.id.txtVwFrases);
        number.setOnClickListener(this);
        family.setOnClickListener(this);
        color.setOnClickListener(this);
        phrase.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.txtVwNumeros:
                openNumberActivity();
                break;
            case R.id.txtVwFamilia:
                openFamilyActivity();
                break;
            case R.id.txtVwColores:
                openColorsActivity();
                break;
            case R.id.txtVwFrases:
                openPhraseActivity();
                break;
        }
    }

    public void openNumberActivity() {
        Intent number = new Intent(this, number_Activity.class);
        startActivity(number);
    }

    public void openFamilyActivity() {
        Intent family = new Intent(this, family_Activity.class);
        startActivity(family);
    }

    public void openColorsActivity() {
        Intent colors = new Intent(this, color_Activity.class);
        startActivity(colors);
    }

    public void openPhraseActivity() {
        Intent phrase = new Intent(this, phrase_Activity.class);
        startActivity(phrase);
    }

    /*public void timerTest() {
        Timer temporizador = new Timer();
    }*/
}