import java.util.ArrayList;
import java.util.Random;

public class Room {
     // List with all the entities
    ArrayList<Entity> entities = new ArrayList<Entity>();
    


 /**
  * Set up a new room with entities in random places
  * first the room, must be clear of entities
  */
   public void resetRoom() {
        clearRoom();
                
        Random rand = new Random();
        int upperbound = 10;
        int WizRand1 = rand.nextInt(upperbound);
        int WizRand2 = rand.nextInt(upperbound);
        
        
                              
        //Creating game pieces
        hobbit hobbit1 = new hobbit("Frodo", 50);
        hobbit hobbit2 = new hobbit("Bilbo", 38);
        hobbit hobbit3 = new hobbit("Sam", 128);
        addNewEntityinRoom(hobbit1, 1, 1);
        addNewEntityinRoom(hobbit2, 3, 5);
        addNewEntityinRoom(hobbit3, 5, 3);
        
        elf elf1 = new elf("Galadriel",true);
        elf elf2 = new elf("Legolas", false);
        elf elf3 = new elf("Elrond", false);
        addNewEntityinRoom(elf1, 6,1);
        addNewEntityinRoom(elf2, 1, 6);
        addNewEntityinRoom(elf3, 3, 1);
        
        wizard wizard1 = new wizard("Gandalf", WizRand1);
        wizard wizard2 = new wizard("Saruman", WizRand2);        
        addNewEntityinRoom(wizard1,5,1);
        addNewEntityinRoom(wizard2,7,2);
        
        
        
   }
   
    /**
     * method that adds a new entity into a position
     * PRE: position (x,y) must be empty
     * @param e The entity 9<=x<9 and 0<=y<9
     *
     */
    public void addNewEntityinRoom(Entity e, int x, int y ) {
        //adds the passed entity to the entities arraylist
        entities.add(e);
        //moves the previous entitiy to the x,y provided
        entities.get(entities.size() - 1).move(x, y);
        
    }

    /**
     * Empty the list of entities
     */
    public void clearRoom() {
        entities.clear();
    } 



    /**
     *  Method that tell us if a cell is occupied by an entity
     * @param x  row 0 <= x <= 9
     * @param y column 0 <= y <= 9
     * @return true is cell occupied
     */
    public boolean isFree(int x, int y) {
        boolean Free = false;
        //checks all X and Y's of each entity. if an x and y matches the passed values, returns true.
        for(int i = 0; i < entities.size(); i++){
            int X = entities.get(i).getX();
            int Y = entities.get(i).getY();
            
            if ((X == x ) && (Y == y)){
                Free = true;
            }          
        }
        return Free; 
        
    }


    /**
     *  Method that returns the position  occupied by an entity 
     * given its coordinates
     * @param x  row 0 <= x <= 9
     * @param y column 0 <= y <= 9
     * @return position in the list or -1 if the cell is free
     */
    private int getPosition (int x, int y) {
        
        for(int i = 0; i > entities.size(); i++){
            if(entities.get(i).getX() != 0 || entities.get(i).getY() != 0){
                x = entities.get(i).getX();
                y = entities.get(i).getY();
            }
        }
        return x & y;
        
        
    }

    /**
     * Display all the properties of an entity that occupies a particular cell
     * PRE: Cell must not be empty
     * @param x row 0<= x <=9
     * @param y column 0<=y<=9
     * @return String with the properties of the entity or
	 *  	
     */
    public String displayEntity (int x, int y) {
        String Display = new String();
        for (int i = 0; i < entities.size(); i++){
            if (entities.get(i).getX() == x && entities.get(i).getY() == y){
                Display += "Entity Properties: ";
                Display += "\n";
                
                Display += "Type: ";
                String type = entities.get(i).getType();
                Display += type;
                Display += "\n";
                
                Display += "Name: ";
                String name = entities.get(i).getName();
                Display += name;
                Display += "\n";
                
                Display += "Health: ";
                int Health = entities.get(i).getHealth();
                Display += Health;
                Display += "\n";                                      
            }         
        }
        if (Display.length() < 1){
            Display += "Entity Not Found";
        }

        return Display;
    }
    
    
    /**
     * method that moves all the entities 
     */
    public void move() {
    
}

    /**
     * Display the room in ASCII 
     */
    
    
    public String toString() {
        String myBoard = new String();
        for(int y = 0; y <= 9; y++){
            for(int x = 0; x <= 9; x++){
                if(this.isFree(x, y) == true){
                    for (int i = 0; i < entities.size(); i++){
                        if(entities.get(i).getX() == x && entities.get(i).getY() == y){
                            if(entities.get(i).getType() == "hobbit"){
                                myBoard += entities.get(i).getSymbol() + " ";
                            }
                            else if(entities.get(i).getType() == "elf"){
                                myBoard+= entities.get(i).getSymbol() + " ";
                            }
                            else if(entities.get(i).getType() == "wizard"){
                                myBoard += entities.get(i).getSymbol() + " ";
                            }
                        }
                    }
                }
                else{
                    myBoard += ". "; 
                }
                             
            }                                                                           
            myBoard += "\n";
        }
        myBoard += "\n";
        return myBoard;        
    }
}


