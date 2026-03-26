package co.devMaker.gettersetters;

public class Main3 {

    public  static void main(String[] args){
        User1 userA = new User1();
        userA.setFirstName("lucas ferrari");

        System.out.println(userA.getFirstName());

        User1 userB = new User1();

        userB.setFirstName("Joao carlos");

        System.out.println(userB.getFirstName());
    }
}
