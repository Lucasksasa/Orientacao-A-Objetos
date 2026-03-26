package co.devMaker.arrays;

import co.devMaker.user.User;

public class Main5 {

    public static void main (String[] args){


        User[] user = new User[]{
          new User("Lucas", "Ferrari"),
          new User("Boto", "Rosa"),
          new User("Lobo", "Amarelo")
        };
        System.out.println(user[0].getNome());
        System.out.println(user[0].getSobrenome());
    }
}
