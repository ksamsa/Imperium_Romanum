package bttstudio.imperiumromanum;

/**
 * Created by ksamsa on 07.09.2016.
 */
public class Player {

    public String name = "Test";
    public int age = 1;
    public int health = 100;
    public int wealth = 10;
    public int fame = 0;
    public int god_1 = 0;
    public int god_2;
    public int god_3;


    public void setName(String new_name){
        name = new_name;
    }

    public String getName(){
        return name;
    }

    public void changeAge(int add_age){
        age = age + add_age;
    }

    public int getAge(){
        return age;
    }

    public void changeHealth(int add_health){
        health = health + add_health;
    }

    public int getHealth(){
        return health;
    }

    public void changeWealth(int add_wealth){
        wealth = wealth + add_wealth;
    }

    public int getWealth(){
        return wealth;
    }

    public void changeFame(int add_fame){
        fame = fame + add_fame;
    }

    public int getFame(){
        return fame;
    }

    public void changeGod(int add_god_1){
        fame = god_1 + add_god_1;
    }

    public int getGod(){
        return god_1;
    }
}
