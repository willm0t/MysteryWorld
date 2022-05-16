/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rwill
 */
public class wizard extends Entity{
    
    private int wisdom;
    public wizard(String name, int theWisdom){
        this.setSymbol("*");
        this.setType("wizard");
        this.setName(name);
        this.setHealth(100);
        wisdom = theWisdom;
    }
}
