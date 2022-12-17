package chap2.item5;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> dict = new HashMap<>();
        dict.put("1", "test1");
        dict.put("2", "test2");
        dict.put("3", "test3");

        Validator validator = new Validator(dict);
        System.out.println(validator.isValid("2"));
        System.out.println(validator.isValid("5"));
    }
}
