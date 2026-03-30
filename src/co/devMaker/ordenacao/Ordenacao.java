package co.devMaker.ordenacao;

import java.util.Arrays;

public class Ordenacao {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 64, 24, 68};
        //serve para ordenar números em ordem crescente, mesmo que estejam embaralhados
        Arrays.sort(numbers);

        //não aparecerá no console da forma esperada, sem o toString ou sem o while ou for
        System.out.println(numbers);

        //agora aparecerá no console, pois utilizamos o método toString.
        System.out.println(Arrays.toString(numbers));


    }
}
