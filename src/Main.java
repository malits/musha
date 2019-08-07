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

        System.out.println("what is your name: Father Steel or Dot?");
        String name = m.getInput();

        System.out.println("Hello "+ name);

        System.out.println("Welcome to the Mushaa Region!");

        System.out.println("Who would you like to be your Starter Pokemon? \nYour choices are Izzy, McGraw, Lego,");
        String Starter = m.getInput();
        Dog lego = new Dog(20, "Lego");
        Dog Izzy = new Dog(15, "Izzy");
        Dog McGraw = new Dog(10, "McGraw");

        Dog player = new Dog(0,"placeholder");


        if (Starter.equals("Lego")){

            player = lego;

            System.out.println("Bark Bark");

        } else if (Starter.equals("McGraw")){

            player = McGraw;
            System.out.println("Woof Woof I love tim McGraw");

        }else if (Starter.equals("Izzy")){

            player = Izzy;

            System.out.println("*jumps on you*");


        }

        Character Hero = new Character(20, name);
        Character Rival = new Character(20, "Dot");
        System.out.println("Now you are entering a Battle!");

        Random r = new Random(1);

        while(Hero.healthcheck() && Rival.healthcheck() ) {




            System.out.println("Do you want to use Attack1 or Attack2 or use Dog.");
            String battleAttack = m.getInput();


            int damagehealth =0;
            if (battleAttack.equals("Attack1")) {
                damagehealth = Hero.attack1();


            } else if (battleAttack.equals("Attack2")) {

                damagehealth = Hero.attack2();
                System.out.println(Rival.health);

            }else if( battleAttack.equals("Dog")){

                 damagehealth = player.AttackDamage;


            }
            Rival.health = Rival.health - damagehealth;
            int Attack = r.nextInt(2);
            damagehealth =0;
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
