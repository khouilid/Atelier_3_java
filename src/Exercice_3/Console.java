package Exercice_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

abstract class Console {
    Scanner input = new Scanner(System.in);

    public int mainOrder(){
        String[] exercices = {"1 -> Add user", "2 -> Search for user",
                "3 -> Display all users" , "4 -> Retirer money"};

        for (String exercice : exercices){
            System.out.println(exercice);
        }

        System.out.print("Your order : ");

        int userChoice = input.nextInt();

        return userChoice;
    }

    protected HashMap<String,Double> getMoneyOrder(){
        HashMap<String, Double> data = new HashMap<>();
        System.out.print("User name : ");
        String name = input.next();

        System.out.print("How much money you want : ");
        double amount = input.nextDouble();
        data.put(name, amount);
        return data;
    }

    protected String getnameToFind(){
        System.out.print("User name : ");
        String name = input.next();
        return name;
    }

    protected ArrayList<String> userInfo(){
        ArrayList<String> user_info = new ArrayList<>();
        System.out.print("User name : ");
        String name = input.next();

        System.out.print("User Adress : ");
        String adress = input.next();

        System.out.print("User sold : ");
        String sold = input.next();

        if (!name.trim().equals("") && !adress.trim().equals("") && !sold.trim().equals("")){
            user_info.add(name);
            user_info.add(adress);
            user_info.add(sold);
        }else{
            System.out.println("You should fill all the info");
        }

        return user_info;
    }

}