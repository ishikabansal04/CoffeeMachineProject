//STAGE 2 ====== 

//INSTRUCTION =========

/* Write a program that calculates the amount of ingredients needed to make a certain amount of coffee.*/

//STAGE DESCRIPTION =========

/*Now let's consider a case where you need a lot of coffee. Maybe, for example, you’re hosting a party with a lot of guests. The program should calculate how much water, coffee, and milk are necessary to make the specified amount of coffee. One cup of coffee made on this coffee machine contains 200 ml of water, 50 ml of milk, and 15 g of coffee beans.
The user should input the amount of coffee he needs, in cups, for all the guests.
Of course, all this coffee is not needed right now, so at this stage, the coffee machine doesn’t actually make any coffee.*/

/* 
15 / 15 STAGE PREREQUISITES ==========
Types and variables
Comments
Naming variables
Scanning the input
Arithmetic operations
Integer types and operations
Increment and decrement
Characters
String
Write, compile, and run
JVM, JRE, and JDK
Introduction to operating systems
Command line overview
Parameters and options
Running programs on your computer
*/

package Machine;
import java.util.Scanner;
public class Stage2 {
    
    public static void main(String[] args) {

        System.out.println("Write how many cups of coffee you will need:");
        Scanner scn=new Scanner(System.in);
        int input=scn.nextInt();
        int water=(input*200);
        int milk=(input*50);
        int coffeebeans=(input*15);
        System.out.println("> "+input);
        System.out.println("For "+input +" cups of coffee you will need:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeebeans + " g of coffee beans");
        scn.close();
    }
}