import javafx.beans.value.WritableValue;

import java.awt.*;
import  java.util.Scanner;

public class Main {

    public String getInput(){

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        return name;

    }

    public static void main(String[] args){
        Main m = new Main();

        System.out.println("what is your name?");
        String name = m.getInput();

        System.out.println(name);

        System.out.println("Welcome to the Mushaa Region!");

        System.out.println("Who would you like to be your Starter Pokemon? \nYour choices are Izzy, McGraw, Lego,");
        String Starter = m.getInput();
        if (Starter.equals("Lego")){

            System.out.println("Bark Bark");

        } else if (Starter.equals("McGraw")){

            System.out.println("Woof Woof I love tim McGraw");

        }else if (Starter.equals("Izzy")){

            System.out.println("*jumps on you*");


        }

        Character hero = new Character(20, name);
        Character Rival = new Character(20, "Dot");

        System.out.println("Now you are entering a Battle! \n Do you want to use Attack1 or Attack2");
        String battleAttack = m.getInput();
        if(battleAttack.equals("Attack1")){
            int damagehealth = hero.attack1();
            Rival.health = Rival.health - damagehealth;
            System.out.println(Rival.health);


        }else if (battleAttack.equals("Attack2")) {

           int damagehealth = hero.attack2();
           Rival.health = Rival.health - damagehealth;
           System.out.print(Rival.health);


        }
}



}
