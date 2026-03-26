package co.devMaker.collections;

import co.devMaker.user.User;

public class Main4 {

    public  static void main(String[] args){

        //O Array convencional precisamos colocar a quantidade no inicio
        User[] users = new User[10];
        // como se fosse uma caixa com 10 espaços para colocar usuarios por exemplo
        // | x | x | x | x | x | x | x | x | x | x |

        for (int i = 0; i < users.length; i++){
            User actual = new User();
            actual.setNome("Nome" + i);
            actual.setSobrenome("Sobrenome" + i);
            users[i] = actual;
        }

        System.out.println(users[2].getNome());
        System.out.println(users[2].getSobrenome());
    }
}
