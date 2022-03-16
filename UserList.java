import java.util.ArrayList;

public class UserList {
    private static ArrayList<User> myArrayList = new ArrayList<>();
    public void addUtent(User user){
        myArrayList.add(user);
    }
    public ArrayList<User> getMyArrayList() {
        return myArrayList;
    }

    public void setMyArrayList(ArrayList<User> myArrayList) {
        this.myArrayList = myArrayList;
    }
}
