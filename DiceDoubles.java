/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicedoubles;
import java.util.Random;

/**
 *
 * @author kendrabooker
 */
public class DiceDoubles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        
        
        int roll1, roll2;
        roll1 = 1 + r.nextInt(6);
        roll2 = 1 + r.nextInt(6);
        
        while(roll1 != roll2){
            System.out.println("Here comes the Dice");
            System.out.println("Roll 1: " + roll1 + "\n" + "Roll 2: " + roll2);
            roll1 = 1 + r.nextInt(6);
            roll2 = 1 + r.nextInt(6);
            
         }
        System.out.println("Doubles \n" + "Roll 1: " + roll1 + "\n" + "Roll 2: " + roll2 + "\n" + "The total is "  +  (roll1 + roll2));
    }
    
}
