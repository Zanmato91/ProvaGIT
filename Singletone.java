public class Singletone {
    private Singletone(){}
    private static Singletone singletone = new Singletone();

    public static Singletone getSingletone() {
        return singletone;
    }

    public void message(){
        System.out.println("Hi, I'm using a singleton class!");
    }
}
