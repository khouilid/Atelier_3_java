package Exercise_1;

import java.util.Scanner;

public class Chien {
    private String name;

    public Chien(){

        this.name = askFordogName();
        aboyer();
        monge();
    }
    private String askFordogName(){
        Scanner input = new Scanner(System.in);
        System.out.print("Dog name is : ");
        return input.next();
    }

    private void aboyer(){
        System.out.print(name + " dit wwaaaarf.");
    }
    private void monge(){
        System.out.print("  Je mange de la viande");
    }

}
