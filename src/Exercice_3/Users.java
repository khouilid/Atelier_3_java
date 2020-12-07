package Exercice_3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class Users {

    private ArrayList<HashMap<String, String>> users  = new ArrayList<>();
    final double tauxInteret;

    public Users(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public void addUser(String name, String adrress, String sold){
        HashMap<String , String> user = new HashMap<>();

        user.put("Name" , name.toUpperCase());
        user.put("Adrress" , adrress);
        user.put("Sold" , sold);

        DecimalFormat interests = new DecimalFormat("#.##");
        String interest =  interests.format(Integer.parseInt(sold) * this.tauxInteret);

        user.put("Interest" , interest);


        users.add(user);

    }

    public HashMap<String, String> searchForUser(String name){

        for (var user:users) {
            if (user.get("Name").toUpperCase().equals(name)){
                return user;
            }
        }
        return null;
    }

    public ArrayList<HashMap<String, String>> allUsers(){
        return users;
    }

    public String retirer(double amount, String name){
        String message ;

        if(searchForUser(name) != null){
            HashMap<String, String> user = searchForUser(name);
            int index = users.indexOf(user);
            double sold = Double.parseDouble(user.get("Sold"));

            if (sold < amount){

                message = "Sorry! this user don't have this amount.";

            }else{

                sold = sold - amount;
                user.put("Sold", Double.toString(sold));
                message = "You get " + amount + "The new sold for " + user.get("Name") + " is " + sold;
                users.set(index, user);

            }

        }else{
            message = "Sorry! this user doesn't exist in our Database.";
        }


        return  message;


    }

}