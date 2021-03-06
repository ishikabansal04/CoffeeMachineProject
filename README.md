# CoffeeMachineProject
# This is an Easy Level Project under JetBrains Academy.

# STAGE 1 ========

STAGE INSTRUCTION ==========

Write a program that calculates the amount of ingredients needed to make a certain amount of coffee.

STAGE DESCRIPTION =======

Let's start with a program that makes you a coffee – virtual coffee, of course. But in this project, you will implement functionality that simulates a real coffee machine. It can run out of milk, it can run out of coffee beans, it can make different varieties of coffee, and it can take the money for making a coffee.
The first version of the program just makes you a coffee. It prints to the standard output what it is doing as it makes a coffee.

4 / 4 STAGE PREREQUISITES=========

Introduction to Java

Basic literals

Overview of the basic program

Printing data


# STAGE 2 ====== 

STAGE INSTRUCTION =========

Write a program that calculates the amount of ingredients needed to make a certain amount of coffee.

STAGE DESCRIPTION =========

Now let's consider a case where you need a lot of coffee. Maybe, for example, you’re hosting a party with a lot of guests. The program should calculate how much water, coffee, and milk are necessary to make the specified amount of coffee. One cup of coffee made on this coffee machine contains 200 ml of water, 50 ml of milk, and 15 g of coffee beans.
The user should input the amount of coffee he needs, in cups, for all the guests.
Of course, all this coffee is not needed right now, so at this stage, the coffee machine doesn’t actually make any coffee.

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


# STAGE 3 =====

STAGE INSTRUCTION ========

Write a program that calculates whether it will be able to make the required amount of coffee from the specified amount of ingredients.

STAGE DESCRIPTION ==========

A real coffee machine never has an infinite supply of water, milk, or coffee beans. And if you input a really big number, it’s almost certain that a real coffee machine wouldn't have the supplies needed to make all that coffee.
In this stage, you need to improve the previous program. Now you need to input amounts of water, milk, and coffee beans that your coffee machine has at the moment.
If the coffee machine has enough supplies to make the specified amount of coffee, the program should print "Yes, I can make that amount of coffee". If the coffee machine can make more than that, the program should output "Yes, I can make that amount of coffee (and even N more than that)", where N is the number of additional cups of coffee that the coffee machine can make. If the amount of resources is not enough to make the specified amount of coffee, the program should output "No, I can make only N cup(s) of coffee".
Like in the previous stage, the coffee machine needs 200 ml of water, 50 ml of milk, and 15 g of coffee beans to make one cup of coffee

3 / 3 STAGE PREREQUISITES ==========

Boolean and logical operations

Relational operators

Conditional statement



# STAGE 4 =======

STAGE INSTRUCTION ========

Write a program that offers to buy one cup of coffee or to fill the ingredients or to take its money. At the same time, the program should calculate how many ingredients it has 
left. And also display the number of ingredients before and after purchase.

STAGE DESCRIPTION ==========

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



# STAGE 5 =======

STAGE INSTRUCTION ========

Write a program that will work endlessly to make coffee for all interested persons until the shutdown signal is given.

STAGE DESCRIPTION ==========

But just one action isn’t interesting. Let's improve the program so it can do multiple actions, one after another. The program should repeatedly ask what the user wants to do. If the user types "buy", "fill" or "take", then just do what the program did in the previous step. However, if the user wants to switch off the coffee machine, he should type "exit". Then the program should terminate. Also, when the user types "remaining", the program should output all the resources that the coffee machine has.
Also, do not forget that you can be out of resources for making coffee. If the coffee machine doesn’t have enough resources to make coffee, the program should output a message that says it can't make a cup of coffee.
And the last improvement to the program at this step—if the user types "buy" to buy a cup of coffee and then changes his mind, he should be able to type "back" to return into the main cycle.
Remember, that:
For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.


# STAGE 6 =======

STAGE INSTRUCTION ========

Refactor the program. Make it so that you can communicate with the coffee machine through a single method.

STAGE DESCRIPTION ==========

Let's redesign our program and write a class that represents the coffee machine. The class should have a method that takes a string as input. Every time the user inputs a line (a string) to the console, the program invokes this method with one argument: the line that user input to the console. This system simulates pretty accurately how real-world electronic devices work. External components (like buttons on the coffee machine or tapping on the screen) generate events that pass into the single interface of the program.
The class should not use system input at all; it only should handle input that comes to it via this method and its string argument.
The first problem that comes to mind: how to write that method in a way that it represents all that coffee machine can do? If the user inputs a single number, how can the method determine what that number is: a variant of coffee chosen by the user or the number of the disposable cups that a special worker added into the coffee machine?
The right solution to this problem is to store the current state of the machine. The coffee machine has several states it can be in. For example, the state could be "choosing an action" or "choosing a variant of coffee". Every time the user inputs something and a program passes that line to the method, the program determines how to interpret this line using the information about the current state. After processing this line, the state of the coffee machine can be changed or can stay the same. The most efficient way of handling states is using an enum with all predefined states.
Remember, that:
For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.

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
