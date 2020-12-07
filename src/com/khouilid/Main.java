package com.khouilid;

import Exercice_2.Exercice_2;
import Exercice_3.Exercice_3;
import Exercise_1.Exercise_1;

import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            //display choices
            String[] exercises = {"1 -> Exercice 1", "2 -> Exercice 2", "3 -> Exercice 3 & 4 & 5 & 5"};
            for (String exercise : exercises){
                System.out.println(exercise);
            }
            //get input value
            Scanner list_input = new Scanner(System.in);
            System.out.print("Please choose a number : ");
            int exe_number = list_input.nextInt();


            System.out.println("You choose exercise : " + exe_number);
            //check the user choice and display result
            if(exe_number == 1){
                new Exercise_1();


            }else if(exe_number == 2){
                new Exercice_2();


            }else if(exe_number == 3){
                Exercice_3 users = new Exercice_3();
                users.screen();


            }else if(exe_number == 4){
                System.out.println("you choose functions");



            }
            else if(exe_number == 5){
                System.out.println("you choose problimatic");



            }
    }
}
