package com.thuannluit.studyenglish;

public class Word {

    private String word, vnMean;

    public Word(String word, String vnMean) {
        this.word = word;
        this.vnMean = vnMean;
    }

    public String getWord() {
        return word;
    }

    public String getVnMean() {
        return vnMean;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Word){
            Word word = (Word) o;
            return this.word.equals(word.word);
        }
        return super.equals(o);
    }

    @Override
    public String toString() {
        return "\n"+ word + " : " + vnMean;
    }
}
