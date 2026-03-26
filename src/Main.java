import co.devMaker.user.User;

public class Main {
    public static void main(String[] args) {

        User user = new User();

        user.nome= "Lucas";
        user.sobrenome= "Ferrari";
        String fullName = user.getFullName();


        System.out.println(fullName);
    }
}