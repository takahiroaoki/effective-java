package chap2.item9;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        // クローズしなければならない資源を使うときは、いつでもtry-finallyよりtry-with-resourcesを使う。
        try (BufferedReader br = new BufferedReader(new FileReader("/src/chap2/item9/data.txt"))) {
            System.out.println(br.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
