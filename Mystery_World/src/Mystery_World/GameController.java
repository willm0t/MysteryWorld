import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Arantza
 */
public class GameController {

   

    static void menu(){

        System.out.println("Enter an option");
        System.out.println("1: Display Room");
        System.out.println ("2: Display Entity Information ");
        System.out.println ("3: Reset the room");
        System.out.println ("4: Move all the entities");
        System.out.println ("0: Exit");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Room world = new Room();
        System.out.println("Initialise the room here");
        world.resetRoom();
        System.out.println(world.toString());
          
    Scanner kb = new Scanner(System.in);
    int option;

    do  {
	menu();
    option = kb.nextInt();
    kb.nextLine();
    switch (option) {
       case 1: System.out.println("Option to Display Room");
                System.out.println(world.toString());
                break;
    
      case 2: System.out.println("Enter the x of the entity you want to see ");
                int x = kb.nextInt();
                if (0<= x && x <= 9){
                    System.out.println("Enter the y of the entity you want to see");
                    int y = kb.nextInt();
                    if (0<= y && x <9){
                        System.out.println(world.displayEntity(x, y));
                    }
                    else{
                        break;
                    }
                }
                else{
                    break;
                }
                
      

                break;
       case 3: System.out.println("Option to reset the room:");
                world.clearRoom();
                break;
                
       case 4: System.out.println("Moves all entities: ");
                break;

                
       case 0: System.out.println("Game Over");
                break;

       default: System.out.println("Sorry wrong option");
     }
    } while (option != 0); 
      
    }
 }
