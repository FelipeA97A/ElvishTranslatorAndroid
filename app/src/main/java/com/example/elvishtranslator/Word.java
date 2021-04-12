package com.example.elvishtranslator;

public class Word {
    private String spanishWord;
    private String elvishWord;
    private int img;

    public Word() {

    }

    public Word(String spanishWord, String elvishWord, int img) {
        this.spanishWord = spanishWord;
        this.elvishWord = elvishWord;
        this.img = img;
    }

    public String getSpanishWord() {
        return spanishWord;
    }

    public String getElvishWord() {
        return elvishWord;
    }

    public int getImg() { return img; }
}
