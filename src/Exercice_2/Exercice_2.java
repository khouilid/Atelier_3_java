package Exercice_2;

import java.util.Locale;
import java.util.Scanner;

public class Exercice_2 {
    private String name;
    protected Scanner input = new Scanner(System.in);

    public Exercice_2(){

        this.name = askFordogName();
        String angryDog = angreyDog();
        aboyer(angryDog);

        input.close();
    }
    private String askFordogName(){

        System.out.print("Dog name is : ");
        return input.next();
    }
    private String angreyDog(){
        System.out.print("Are the dog angry Yes/Non: ");
        return input.next().toLowerCase();
    }

    private void aboyer(String angryDog) {
        if(angryDog.equals("yes")){
            System.out.print(name + " dit:  Je suis en colère. Ghhhhhhhhhh !!! WWWWOARF !! WWWWOARF !! .");
            monge(" Je mange de la viande");
        }else{
            System.out.println(name + " Je ne suis pas du tout en colère. Iwiw !! awaw !!");
            monge(" Je mange du poisson");
        }

    }
    private void monge(String godWant){
        System.out.print(godWant);
    }
}
