/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package catchingexceptions;
import javax.swing.*;
/**
 *
 * @author kabut2496
 */
public class CatchingExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String myInput;
        double numerator = 0,denominator=0;
        double result = 0;
        
        
        try{
            //user inputs
            myInput=JOptionPane.showInputDialog("enter a integer numerator");
            //crashon no-integer inputs
            numerator = Integer.parseInt(myInput);
            
            myInput =JOptionPane.showInputDialog("Enter an integer Denominator");
            denominator= Integer.parseInt(myInput);
            
            //will crash if denominator == 0 
            result= numerator/denominator;
        }catch(ArithmeticException ae){
            System.err.println("you cannot have a denominator of 0");
            System.err.println("exception:"+ae);
            System.exit(1);
        }catch(NumberFormatException nfe){
            System.err.println("you must enter integers");
            System.err.println("exception:"+nfe);
            System.exit(1);
        }
        System.out.println("Result:"+numerator+"/"+denominator+"="+result);
    }
    
}
