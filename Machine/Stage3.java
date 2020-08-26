//STAGE 3 =======

//STAGE INSTRUCTION ========
/* Write a program that calculates whether it will be able to make the required amount of coffee from the specified amount of ingredients.*/

//STAGE DESCRIPTION ==========
/*
A real coffee machine never has an infinite supply of water, milk, or coffee beans. And if you input a really big number, it’s almost certain that a real coffee machine wouldn't have the supplies needed to make all that coffee.

In this stage, you need to improve the previous program. Now you need to input amounts of water, milk, and coffee beans that your coffee machine has at the moment.

If the coffee machine has enough supplies to make the specified amount of coffee, the program should print "Yes, I can make that amount of coffee". If the coffee machine can make more than that, the program should output "Yes, I can make that amount of coffee (and even N more than that)", where N is the number of additional cups of coffee that the coffee machine can make. If the amount of resources is not enough to make the specified amount of coffee, the program should output "No, I can make only N cup(s) of coffee".

Like in the previous stage, the coffee machine needs 200 ml of water, 50 ml of milk, and 15 g of coffee beans to make one cup of coffee
*/
/*
3 / 3 STAGE PREREQUISITES ==========
Boolean and logical operations
Relational operators
Conditional statement
*/

//STAGE IMPLEMENTATION ===========

package Machine;
import java.util.Scanner;
public class Stage3 {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        int Reqwater=scn.nextInt();
         System.out.println("Write how many ml of milk the coffee machine has:");
        int Reqmilk=scn.nextInt();
         System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int Reqcoffee=scn.nextInt();
         System.out.println("Write how many cups of coffee you will need:");
        int Reqcups=scn.nextInt();
        int noOfwater= Reqwater/200;
        int noOfmilk= Reqmilk/50;
        int noOfcoffee= Reqcoffee/15;
        
        int mincups=Math.min(Math.min(noOfcoffee,noOfmilk),noOfwater);
        if(mincups==Reqcups){
            System.out.println("Yes, I can make that amount of coffee");
        }
        else if(mincups>Reqcups){
            int val=mincups-Reqcups;
            System.out.println("Yes, I can make that amount of coffee  (and even " + val + " more than that)");
        }
        else{
            System.out.println("No, I can make only " + mincups + " cup(s) of coffee");
        }
    scn.close();
    }
}