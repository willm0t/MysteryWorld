
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rwill
 */
public class elf extends Entity {
    
    private boolean flying;
    
    public elf(String name,boolean fly){
        if(fly == true){
            this.setSymbol("&");
        }
        else{
            this.setSymbol("#");
        }
        this.setType("elf");
        this.setName(name);
        this.setHealth(100);
        flying = fly; 
    }
    public boolean isFlying() {
        return flying;
    }

    public void setFlying(boolean flying) {
        this.flying = flying;
    }
}
