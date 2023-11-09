package com.thuannluit.studyenglish.main;

import com.thuannluit.studyenglish.Word;
import com.thuannluit.studyenglish.WordManager;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        WordManager wordManager = new WordManager("Sách");
        wordManager.addWord("Textbook", "Sách giáo khoa");
        wordManager.addWord("Novel", "Tiểu thuyết");
        wordManager.addWord("Comic", "Truyện tranh");
        wordManager.addWord("Poem", "Thơ");
        wordManager.addWord("Magazine", "Tạp chí");

        wordManager.printAllWord();

        Word[] twoWords = wordManager.getTwoWordRandom();
        System.out.println(Arrays.toString(twoWords));
        wordManager.remove("Textbook");
    }
}
