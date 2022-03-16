public class Main {
    public static void main(String[] args) {
        System.out.println("Try to push this!");
        Singletone singletone = Singletone.getSingletone();
        singletone.message();
    }
}
