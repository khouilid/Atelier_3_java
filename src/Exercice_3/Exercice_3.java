package Exercice_3;

import java.util.ArrayList;
import java.util.HashMap;

public class Exercice_3 extends Console{

     private Users users = new Users(0.07);

    public void screen(){

       int userChoice = mainOrder();

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
        HashMap<String, Double> data = getMoneyOrder();

        for (String i : data.keySet()) {
            System.out.println(users.retirer(data.get(i) , i));
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
        String name = getNameToFind();

        HashMap<String,String> result =  users.searchForUser(name);
        System.out.println(result.get("Name") + " | " + result.get("Adrress")
                + " | " + result.get("Sold")+ " | " + result.get("Interest"));
    }

    private void addUser(){
        users.addUser(userInfo());
        System.out.println("Done!");
    }

}
