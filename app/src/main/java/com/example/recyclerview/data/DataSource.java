package com.example.recyclerview.data;

import com.example.recyclerview.model.Word;

import java.util.LinkedList;

public class DataSource {

    public DataSource(){}

    public LinkedList<Word> loadWords(){
        // Mettre les données initiales dans la liste de mots.
        LinkedList<Word> wordList = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            wordList.addLast(new Word("Word " + i));
        }
        return wordList;
    }
}