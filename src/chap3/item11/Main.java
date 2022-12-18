package chap3.item11;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<PhoneNumber, String> phoneNumDict = new HashMap<>();
        phoneNumDict.put(new PhoneNumber("000", "0000", "0000"), "Alice");

        // equalsを上書きする時は、hashCodeも上書きしないと、HashMapなどが正常に機能しない。
        System.out.println(phoneNumDict.get(new PhoneNumber("0000", "0000", "0000")));
    }
}
