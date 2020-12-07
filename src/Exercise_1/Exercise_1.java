package Exercise_1;

import java.util.Scanner;

public class Exercise_1 {
    private String name;

    public Exercise_1(){

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
