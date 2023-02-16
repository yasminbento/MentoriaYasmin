package br.com.petshopdoTousen;

import br.com.petshopdoTousen.entity.Pet;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

            List<String> listaPet = Arrays.asList("Não sei", "Eu sei", "Mais que lasanha", "E isso", "pow pow pow");

        int aqui = 0;
        int i = 0;
        for(String p : listaPet) {
            for(i = 0; i <= listaPet.size (); i++) {
                aqui = listaPet.size() - i;
                System.out.println(p.toString() + " mais " + aqui);
            }
        }

    }

}
