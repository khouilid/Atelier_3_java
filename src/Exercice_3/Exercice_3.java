package Exercice_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exercice_3 {
     Scanner input = new Scanner(System.in);
     private Users users = new Users(0.07);

    public void screen(){

        String[] exercices = {"1 -> Add user", "2 -> Search for user", "3 -> Display all users" , "4 -> Retirer money"};
        for (String exercice : exercices){
            System.out.println(exercice);
        }

        System.out.print("Your order : ");
        int userChoice = input.nextInt();

        if (userChoice == 1){
            addUser();
        }else if(userChoice == 2){
            searchForUser();
        }else if(userChoice == 3){
            displayAll();
        }else if(userChoice == 4){
            reterMoney();
        }
        screen();

    }

    private void reterMoney() {
        System.out.print("User name : ");
        String name = input.next();

        System.out.print("How much money you want : ");
        double amount = input.nextDouble();

        if (!name.trim().equals("") && amount > 0){
            System.out.println(users.retirer(amount , name));
        }
    }

    private void displayAll() {
        ArrayList<HashMap<String, String>> result =  users.allUsers();
        for (var user:result) {
                System.out.println(user.get("Name") + " | " + user.get("Adrress")
                        + " | " + user.get("Sold")+ " | " + user.get("Interest"));
        }
    }

    private void searchForUser(){
        System.out.print("User name : ");
        String name = input.next();
        HashMap<String,String> result =  users.searchForUser(name);
        System.out.println(result.get("Name") + " | " + result.get("Adrress")
                + " | " + result.get("Sold")+ " | " + result.get("Interest"));
    }

    private void addUser() {
        System.out.print("User name : ");
        String name = input.next();

        System.out.print("User Adress : ");
        String adress = input.next();

        System.out.print("User sold : ");
        String sold = input.next();

        if (!name.trim().equals("") && !adress.trim().equals("") && !sold.trim().equals("")){
            users.addUser(name, adress, sold);
            System.out.println("Done!");

        }else{
            System.out.println("You should fill all the info");
        }




    }


}
