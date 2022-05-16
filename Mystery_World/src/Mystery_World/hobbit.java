/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rwill
 */
public class hobbit extends Entity{
    
    private int age;
    public hobbit(String name, int theAge){
        this.setSymbol("@");
        this.setType("hobbit");
        this.setName(name);
        this.setHealth(100);
        theAge = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
