package chap2.item5;

import java.util.HashMap;

public class Validator {
    private HashMap<String, String> dictionary;

    public Validator(HashMap<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    public boolean isValid(String word) {
        return this.dictionary.get(word) != null ? true : false;
    }
}
