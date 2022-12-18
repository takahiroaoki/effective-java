package chap3.item14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneNumber pn1 = new PhoneNumber("000", "0000", "0001");
        PhoneNumber pn2 = new PhoneNumber("000", "0000", "0002");
        PhoneNumber pn3 = new PhoneNumber("000", "0000", "0003");
        List<PhoneNumber> list = new ArrayList<>();
        list.add(pn1);
        list.add(pn3);
        list.add(pn2);
        list.sort(null);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
