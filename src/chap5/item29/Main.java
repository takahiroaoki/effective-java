package chap5.item29;

class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("test");
        System.out.println(stack.pop().toUpperCase());
    }
}
