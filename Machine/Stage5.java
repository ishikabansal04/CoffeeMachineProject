//STAGE 5 =======

//STAGE INSTRUCTION ========
/* Write a program that will work endlessly to make coffee for all interested persons until the shutdown signal is given.*/

//STAGE DESCRIPTION ==========
/*
But just one action isn’t interesting. Let's improve the program so it can do multiple actions, one after another. The program should repeatedly ask what the user wants to do. If the user types "buy", "fill" or "take", then just do what the program did in the previous step. However, if the user wants to switch off the coffee machine, he should type "exit". Then the program should terminate. Also, when the user types "remaining", the program should output all the resources that the coffee machine has.

Also, do not forget that you can be out of resources for making coffee. If the coffee machine doesn’t have enough resources to make coffee, the program should output a message that says it can't make a cup of coffee.

And the last improvement to the program at this step—if the user types "buy" to buy a cup of coffee and then changes his mind, he should be able to type "back" to return into the main cycle.

Remember, that:

For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.
*/

//STAGE IMPLEMENTATION ===========

package Machine;
import java.util.Scanner;
public class Stage5 {
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);
       
        int water= 400;
        int milk= 540;
        int coffee= 120;
        int cups= 9;
        int money=550;
        
        String inp="";
        do{
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String str=scn.next();
            inp=str;
            if(str.equals("buy")){
               System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
               String n=scn.next();
               if(n.equals("back")){
                   continue;
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
          else if(str.equals("fill")){
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
          else if(str.equals("take")){
               System.out.println("I gave you $" + money);
               System.out.println();
               money=0;
          }
          else if(str.equals("remaining")){
               System.out.println();
               System.out.println("The coffee machine has:");
               System.out.println(water + " of water");
               System.out.println(milk + " of milk");
               System.out.println(coffee + " of coffee beans");
               System.out.println(cups + " of disposable cups");
               if(money!=0)
                 System.out.println("$" + money + " of money");
               else{
                 System.out.println(money + " of money");
               }
               System.out.println();
          }
        }while(!inp.equals("exit"));
        scn.close();
    }
}