//STAGE 6 =======

//STAGE INSTRUCTION ========
/* Refactor the program. Make it so that you can communicate with the coffee machine through a single method.*/

//STAGE DESCRIPTION ==========
/*
Let's redesign our program and write a class that represents the coffee machine. The class should have a method that takes a string as input. Every time the user inputs a line (a string) to the console, the program invokes this method with one argument: the line that user input to the console. This system simulates pretty accurately how real-world electronic devices work. External components (like buttons on the coffee machine or tapping on the screen) generate events that pass into the single interface of the program.

The class should not use system input at all; it only should handle input that comes to it via this method and its string argument.

The first problem that comes to mind: how to write that method in a way that it represents all that coffee machine can do? If the user inputs a single number, how can the method determine what that number is: a variant of coffee chosen by the user or the number of the disposable cups that a special worker added into the coffee machine?

The right solution to this problem is to store the current state of the machine. The coffee machine has several states it can be in. For example, the state could be "choosing an action" or "choosing a variant of coffee". Every time the user inputs something and a program passes that line to the method, the program determines how to interpret this line using the information about the current state. After processing this line, the state of the coffee machine can be changed or can stay the same. The most efficient way of handling states is using an enum with all predefined states.

Remember, that:

For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.
*/

/*
10 / 10 STAGE PREREQUISITES ==========

Introduction to OOP
Primitive and reference types
Array
Final variables
Iterating over arrays
Defining classes
Constructor
Instance methods
Static members
Enum
*/

//STAGE IMPLEMENTATION ===========

package Machine;
import java.util.*;
public class Stage6Final {
     
    public static Scanner scn=new Scanner(System.in);
   
// For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
// For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
// And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.
    
    public static class CoffeeMaker{
          String str;
          int water= 400;
          int milk= 540;
          int coffee= 120;
          int cups= 9;
          int money=550;
          
          public void getInput(String str){
               this.str=str;
               assign(str);
          }
          
          public void assign (String str){
               if(str.equals("buy")){
                     BUY();
               }
               else if(str.equals("fill")){
                    FILL();
               }
               else if(str.equals("take")){
                    TAKE();
               }
               else if(str.equals("remaining")){
                    REMAINING();
               }
          }
          
          public void BUY(){
               System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
               String n=scn.next();
               if(n.equals("back")){
                   return;
               }
               else if(n.equals("1")){
                    if(water>=250 && coffee>=16){
                        System.out.println("I have enough resources, making you a coffee!");
                        water=water-250;
                        coffee=coffee-16;
                        money=money+4;
                        cups=cups-1;
                    }
                    else if(water<250){
                        System.out.println("Sorry, not enough water!");
                    }
                    else if(coffee<16){
                        System.out.println("Sorry, not enough coffee beans!");
                    }
               }
               else if(n.equals("2")){
                   if(water>=350 && coffee>=20 && milk>=75){
                        System.out.println("I have enough resources, making you a coffee!");
                        water=water-350;
                        milk=milk-75;
                        coffee=coffee-20;
                        money=money+7;
                        cups=cups-1;
                   }
                   else if(water<350){
                        System.out.println("Sorry, not enough water!");
                   }
                   else if(coffee<20){
                        System.out.println("Sorry, not enough coffee beans!");
                   }
                   else if(milk<75){
                        System.out.println("Sorry, not enough milk!");
                   }
                   
               }
               else{
                   if(water>=200 && coffee>=12 && milk>=100){
                        System.out.println("I have enough resources, making you a coffee!");
                        water=water-200;
                        milk=milk-100;
                        coffee=coffee-12;
                        money=money+6;
                        cups=cups-1;
                   }
                   else if(water<200){
                        System.out.println("Sorry, not enough water!");
                   }
                   else if(coffee<12){
                        System.out.println("Sorry, not enough coffee beans!");
                   }
                   else if(milk<100){
                        System.out.println("Sorry, not enough milk!");
                   }
                   
               }
               System.out.println();  
          }
           public void FILL(){
               System.out.println("Write how many ml of water do you want to add:");
               int Reqwater=scn.nextInt();
               water+=Reqwater;
               System.out.println("Write how many ml of milk do you want to add:");
               int Reqmilk=scn.nextInt();
               milk+=Reqmilk;
               System.out.println("Write how many grams of coffee beans do you want to add:");
               int Reqcoffee=scn.nextInt();
               coffee+=Reqcoffee;
               System.out.println("Write how many disposable cups of coffee do you want to add:");
               int Reqcups=scn.nextInt();
               cups+=Reqcups;
          }
           public void TAKE(){
               System.out.println("I gave you $" + money);
               System.out.println();
               money=0;
          }
           public void REMAINING(){
               System.out.println();
               System.out.println("The coffee machine has:");
               System.out.println(water + " of water");
               System.out.println(milk + " of milk");
               System.out.println(coffee + " of coffee beans");
               System.out.println(cups + " of disposable cups");
               System.out.println("$" + money + " of money");
               System.out.println();
          }
          
     }
     public static void main(String[] args) {
        CoffeeMaker obj= new CoffeeMaker();
        
        
        String inp="";
        do{
             System.out.println("Write action (buy, fill, take, remaining, exit):");
             String str=scn.next();
             inp=str;
             obj.getInput(str);
             
        }while(!inp.equals("exit"));
    }
}
