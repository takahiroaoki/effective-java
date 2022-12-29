class Main {
    public static void main(String[] args) {
        Thing[] things = DataHolder.getThingsArray();
        for (int i = 0; i < things.length; i++) {
            System.out.println(things[i].getProperty());
        }
    }
}
