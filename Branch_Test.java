public class Branch_Test {
    public static void main(String[] args) {


    User p1 = new User("Alessandro", "Marinelli");
    User p2 = new User("Matteo", "De Lorenzo");
    User p3 = new User("Nicola", "Rossi");
    User p4 = new User("Andrea", "Visentin");
    UserList userList = new UserList();

    userList.addUtent(p1);
    userList.addUtent(p2);
    userList.addUtent(p3);
    userList.addUtent(p4);

    userList.getMyArrayList().forEach(user -> {
        System.out.println("User name: " +user.getName()+"\nUser surname: "+ user.getSurname());
    });
}
}
