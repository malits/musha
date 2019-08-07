import javafx.beans.value.WritableValue;
import java.util.Random;
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

        Character Hero = new Character(20, name);
        Character Rival = new Character(20, "Dot");
        System.out.println("Now you are entering a Battle!");

        Random r = new Random(1);

        while(Hero.healthcheck() && Rival.healthcheck() ) {

            System.out.println("Do you want to use Attack1 or Attack2");
            String battleAttack = m.getInput();

            if (battleAttack.equals("Attack1")) {
                int damagehealth = Hero.attack1();
                Rival.health = Rival.health - damagehealth;


            } else if (battleAttack.equals("Attack2")) {

                int damagehealth = Hero.attack2();
                Rival.health = Rival.health - damagehealth;
                System.out.println(Rival.health);

            }
            int Attack = r.nextInt(2);
            int damagehealth =0;
            if(Attack == 1){

                damagehealth = Rival.attack1();

            }else if(Attack == 0){
                damagehealth = Rival.attack2();


            }

            System.out.println("Rival Attacks");
            Hero.health = Hero.health - damagehealth;
            System.out.println("Hero health is " + Hero.health);
            System.out.println("Rival Health is " + Rival.health);

            if(Rival.health <=0){

                System.out.println("Rival has died");

            }
            else if (Hero.health <=0){

                System.out.println("Hero had died");
                System.exit(90-31849-1-905851);
            }
        }



    }



}
