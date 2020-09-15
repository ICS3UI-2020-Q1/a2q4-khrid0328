import java.util.Scanner;

/**
 * This program calculates the discount available to customers that shop at the
 * store during a special sale
 * 
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for the amount of money spent
    System.out.println("Please enter the amount the customer spent");

    // declare and initializ the amount of money
    double amount_money = input.nextDouble();
    
    // declare the discount amount
    if(0.01 <= amount_money && amount_money <= 40.00){

      // calculate the amount of discount 10%
      double discount10 = 0.1 * amount_money;

      // calculate the new total amount
      double total_amount10 = 0.9 * amount_money;

      // tell the user what discount they get
      System.out.println("They will receive 10% off.");

      // tell the user how much money they save
      System.out.println("They will save $" + discount10 + ".");

      // tell the user their final total 
      System.out.println("The new total is $" + total_amount10 + ".");

    } else if(40.01 <= amount_money && amount_money <= 80.00){

      // calculate the amount of discount 20%
      double discount20 = 0.2 * amount_money;

      // calculate the new total amount
      double total_amount20 = 0.8 * amount_money;

      // tell the user what discount they get
      System.out.println("They will receive 20% off.");

      // tell the use how much money they save
      System.out.println("They will save $" + discount20 + ".");

      // tell the user their final total
      System.out.println("The new total is $" + total_amount20 + ".");

    } else if(80.01 <= amount_money && amount_money <= 120.00){

      // calculate the amount of discount 30%
      double discount30 = 0.3 * amount_money;

      // calculate the new total amount
      double total_amount30 = 0.7 * amount_money;

      // tell the user what discount they get
      System.out.println("They will receive 30% off.");

      // tell the user how much money they saved
      System.out.println("They will save $" + discount30 + ".");

      // tell the user their final total
      System.out.println("The new total is $" + total_amount30 + ".");

    } else if(amount_money > 120){

      // calculate the amount of discount 40%
      double discount40 = 0.4 * amount_money;

      // calculate the new total amount
      double total_amount40 = 0.6 * amount_money;

      // tell the user what discount they get
      System.out.println("They will receive 40% off.");

      // tell the user how much money they saved
      System.out.println("They will save $" + discount40 + ".");

      // tell the user the new total amount 
      System.out.println("The new total is $" + total_amount40 + ".");
    }
  }
}
