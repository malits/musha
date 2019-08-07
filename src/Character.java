public class Character {
    public String name;
    public int health;

    public Character( int health, String name){
        this.name = name;
        this.health = health;

    }

    public int attack1(){

        return 5;


    }
    public int attack2(){

        return 3;


    }
    public boolean healthcheck() {

        return health > 0;


    }


}
