package com.mycompany.ice_task_9;
import javax.swing.JOptionPane;

public class ICE_TASK_9 {

    public static void main(String[] args) {
        //Promt the user to enter 2 numbers
        String num1Str = JOptionPane.showInputDialog("Please enter the first number: ");
        String num2Str = JOptionPane.showInputDialog("Please enter the second number: ");
        
        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);
        
        int option = -1;
        
        while (option != 0){
            //display the menu options
            String menu = "Select an operation: \n"
                    + "1. Addition"
                    + "2. Subtraction"
                    + "3. Multiplication"
                    + "4. Division"
                    + "0. Exit";
            
            String optionStr = JOptionPane.showInputDialog(menu);
            option = Integer.parseInt(optionStr);
            
            switch(option){
                case 1:
                    //Addition
                    double additionResult = num1 + num2 ;
                    JOptionPane.showMessageDialog(null, "Result of Addition: " + additionResult);
                    break;
                    
                case 2:
                    //Subtraction
                    double subtractionResult = num1 -num2;
                   JOptionPane.showMessageDialog(null, "Result of Subtraction: " + subtractionResult);
                    break;
                
                case 3:
                    //Multiplication
                    double multiplicationResult = num1 * num2;
                    JOptionPane.showMessageDialog(null, "Result of Multiplication: " + multiplicationResult);
                    break;
                
                case 4:
                    //Division
                    if(num2 != 0){
                        double divisionResult = num1 /num2;
                        JOptionPane.showMessageDialog(null, "Result of Division: " + divisionResult);
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: Division by zero is undefined!");
                    }
                default:
                    //An invalid option
                    JOptionPane.showMessageDialog(null, "Calculation not recognized! ");
                    break;
            }
        }
    }
}
