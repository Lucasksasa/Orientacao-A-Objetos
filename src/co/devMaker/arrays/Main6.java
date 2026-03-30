package co.devMaker.arrays;

import co.devMaker.user.User;

import java.util.ArrayList;
import java.util.List;

public class Main6 {

    public static void main (String[] args){

        //Com o ArrayList , não precisamos especificar o tamanho no início
        List<User> users = new ArrayList<>();

        int i = 0;
        while(i<10){
            User actual = new User("Nome" + i, "Sobrenome" +i);
            users.add(actual);
            i++;
        }
        System.out.println(users.get(9).getNome());
        System.out.println(users.get(9).getSobrenome());

        User user11 = new User("Nome 11", "11");
        users.add(user11);

        System.out.println(users.get(10).getNome());
        System.out.println(users.get(10).getSobrenome());
    }
}
