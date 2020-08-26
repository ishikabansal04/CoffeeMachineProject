//STAGE 4 =======

//STAGE INSTRUCTION ========
/* Write a program that offers to buy one cup of coffee or to fill the ingredients or to take its money. At the same time, the program should calculate how many ingredients it has left. And also display the number of ingredients before and after purchase.*/

//STAGE DESCRIPTION ==========
/*
Let's simulate an actual coffee machine. It has a limited supply of water, milk, coffee beans, and disposable cups. Also, it counts how much money it gets for selling coffee. The coffee machine has several options: first, it needs to be able to sell coffee. It can make different varieties of coffee: espresso, latte, and cappuccino. Of course, each variety requires a different amount of supplies, except that all of them requires only one disposable cup. Second, the coffee machine should be able to get replenished by a special worker. Third, another special worker should be able to take money from the coffee machine.

Write the program that can do one of these actions at a time. It reads one line from standard input, which can be "buy", "fill", "take". If you want to buy some coffee, input "buy". If you are a special worker and you think that it is time to fill out all the supplies for the coffee machine, input "fill". If you are another special worker and it is time to take the money from the coffee machine, input "take".

If the user writes "buy" then he must choose one of three varieties of coffee that the coffee machine can make: espresso, latte, or cappuccino.

For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee beans. It costs $6.
If the user writes "fill", the program should ask him how much water, milk, coffee, and how many disposable cups he wants to add to the coffee machine.

If the user writes "take" the program should give him all the money that it earned from selling coffee.

At the moment, the coffee machine has $550, 400 ml of water, 540 ml of milk, 120 g of coffee beans, and 9 disposable cups.

Write the program that prints the coffee machine’s state, processes one query from the user, and also prints the coffee machine’s state after that. Try to use methods to implement every action that the coffee machine can do.
*/

/*
13 / 13 STAGE PREREQUISITES ==========

Units of information
Sizes and ranges
Type casting
Ternary operator
The for-loop
The while and do-while loops
Branching statements
Switch statement
Defining methods
IDE
IntelliJ IDEA
IDEA Basics
EduTools

*/

//STAGE IMPLEMENTATION ===========

package Machine;
import java.util.Scanner;
public class Stage4 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        System.out.println("The coffee machine has:");
        System.out.println("400 of water");
        System.out.println("540 of milk");
        System.out.println("120 of coffee beans");
        System.out.println("9 of disposable cups");
        System.out.println("550 of money");
        System.out.println();
    
        System.out.println("Write action (buy, fill, take):");
        int water= 400;
        int milk= 540;
        int coffee= 120;
        int cups= 9;
        int money=550;
        /*For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
        For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
        And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee beans. It costs $6.*/

        String str=scn.next();
           if(str.equals("buy")){
               System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
               int n=scn.nextInt();
               if(n==1){
                   water=water-250;
                   coffee=coffee-16;
                   money=money+4;
               }
               else if(n==2){
                   water=water-350;
                   milk=milk-75;
                   coffee=coffee-20;
                   money=money+7;
                }
                else{
                    water=water-200;
                    milk=milk-100;
                    coffee=coffee-12;
                    money=money+6;
                }
              cups=cups-1;
            }
            else if(str.equals("fill")){
                System.out.println("Write how many ml of water do you want to add:");
                 int Reqwater1=scn.nextInt();
                 water+=Reqwater1;
                 System.out.println("Write how many ml of milk do you want to add:");
                 int Reqmilk1=scn.nextInt();
                 milk+=Reqmilk1;
                 System.out.println("Write how many grams of coffee beans do you want to add:");
                 int Reqcoffee1=scn.nextInt();
                 coffee+=Reqcoffee1;
                 System.out.println("Write how many disposable cups of coffee do you want to add:");
                 int Reqcups1=scn.nextInt();
                 cups+=Reqcups1;
            }
            else if(str.equals("take")){
                  
                System.out.println("I gave you $" + money);
                money=0;
            }
 
         System.out.println();
         System.out.println("The coffee machine has:");
         System.out.println(water + " of water");
         System.out.println(milk + " of milk");
         System.out.println(coffee + " of coffee beans");
         System.out.println(cups + " of disposable cups");
         System.out.println(money + " of money");
         scn.close();
        }
        
    }
    