# SJHS Coding Club Practice
Welcome to our curriculum. This includes Codecademy lessons, helpful YouTube videos, 
Coding Bat problems, textbook problems, and some of my own problems. Don't be afraid to look at the solutions
if you cannot figure out a problem.

## Unit 1
0) Download and Install [Eclipse](https://www3.ntu.edu.sg/home/ehchua/programming/howto/EclipseJava_HowTo.html "Eclipse Tutorial")
<br />

1) Create an account on [Codecademy](https://www.codecademy.com/ "Codecademy")
<br />

2) Complete Lesson 1 - ["Hello World"](https://www.codecademy.com/courses/learn-java/lessons/hello-world-java "Hello World") on Codecademy
<br />

3) Write a program that displays "Welcome to Java.", "Welcome to Computer Science.", and "Programming is fun."
<br/>

<details>
  <summary>Solution</summary>
  
  ```java
  public class Solution {
    public static void main(String[] args) {
      System.out.println("Welcome to Java!");
      System.out.println("Welcome to Computer Science!");
      System.out.println("Programming is fun!");
    }
  }
  ```
</details>
<br />

4) Write a program that displays "Welcome to Java" five times. No loops.
<br/>

<details>
  <summary>Solution</summary>
  
  ```java
  public class Solution {
    public static void main(String[] args) {
      System.out.println("Welcome to Java!");
      System.out.println("Welcome to Java!");
      System.out.println("Welcome to Java!");
      System.out.println("Welcome to Java!");
      System.out.println("Welcome to Java!");
    }
  }
  ```
</details>
<br />

5) Complete Lesson 2 - ["Variables"](https://www.codecademy.com/courses/learn-java/lessons/learn-java-variables "Variables") on Codecademy
<br />


6) Complete Lesson 3 - ["Manipulating Variables"](https://www.codecademy.com/courses/learn-java/lessons/learn-java-manipulating-variables "Manipulating Variables")
<br />

7) Write a program that displays the result of 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9.
<br/>

<details>
  <summary>Solution</summary>
  
  ```java
  public class Solution {
    public static void main(String[] args) {
      System.out.print(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);
    }
  }
  ```
</details>
<br />

8) Write a program that displays the area and perimeter of a circle that has a radius of 5.5 using the following formulas: perimeter = 2 * radius * pi and area = radius * radius * pi
<br/>

<details>
  <summary>Solution</summary>
  
  ```java
  public class Solution {
    public static void main(String[] args) {
      final double PI = 3.14159265359; // use keyword 'final' for constants (basically the variable doesn't change)
      double radius = 5.5;
      
      double perimeter = 2 * radius * PI;
      System.out.println("Perimeter: " + perimeter);
      
      double area = radius * radius * PI;
      System.out.println("Area: " + area);
    }
  }
  ```
</details>
<br />

9) Write a program that displays the area and perimeter of a rectangle with a width of 4.5 and height of 7.9 using the following formula: area = width x height
<br/>

<details>
  <summary>Solution</summary>
  
  ```java
  public class Solution {
    public static void main(String[] args) {
      double width = 4.5;
      double height = 7.9;
      double area = width * height;
      System.out.println("Area: " + area);
    }
  }
  ```
</details>
<br />

10) Assume a runner runs 14 kilometers in 45 minutes and 30 seconds. Write a program that displays the average speed in miles per hour. (Note that 1 mile is 1.6 kilometers)
<br/>

<details>
  <summary>Solution</summary>
  
  ```java
  public class Solution {
    public static void main(String[] args) {
      double distance = 14; // kilometers
      double time = 45.5; // minutes
      // Convert kilometers to miles and minutes to hours.
      // Divide those values to get miles per hour
      double mph = (distance / 1.6) / (time / 60);
      System.out.print("14 kilometers in 45 minutes and 30 seconds is equal to "
        + mph + " miles per hour");
    }
  }
  ```
</details>
<br />

11) Complete Coding Bat Problem String-1 ["helloName"](https://codingbat.com/prob/p171896 "helloName")
<br />


## Unit 2
1) Watch this video to learn about the Scanner class for getting user input. Follow along in eclipse.
<br />

[![Scanner Video](http://img.youtube.com/vi/Wgkb0zg7WOM/0.jpg)](https://youtu.be/Wgkb0zg7WOM)
<br />

2) Look through [this page](https://www.w3schools.com/java/java_user_input.asp) for reference on the Scanner class
<br />

3) Write a program that reads a celsius degree in a double value from the console, then converts it to Fahrenheit and displays the result. The formula for the conversion is as follows: fahrenheit = (9 / 5) * celsius + 32 --- Hint: in Java, 9/5 is 1, but 9.0/5 is 1.8
<br/>

<details>
  <summary>Solution</summary>
  
  ```java
  public class Solution {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      double celsius = s.nextDouble();
      double fahrenheit = (9.0 / 5) * celsius + 32;
      System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
  }
  ```
</details>
<br />

4) Write a program that reads in the radius and length of a cylinder and computes the area and volume using the following formulas: area = radius * radius * pi volume = area * length
<br/>

<details>
  <summary>Solution</summary>
  
  ```java
  public class Solution {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      // Declare constant pi
      final double PI = 3.14159265359;

      System.out.println("Radius: ");
      double radius = in.nextDouble();

      System.out.println("Length: ");
      double length = in.nextDouble();

      double area = Math.pow(radius, 2) * PI;
      System.out.println("Area: " + area);

      double volume = area * length;
      System.out.println("Volume: " + volume);
    }
  }
  ```
</details>
<br />

5) Write a program that reads a number in feet, converts it to meters, and displays the result. One foot is 0.305 meters.
<br />

<details>
  <summary>Solution</summary>
  
  ```java
  public class Solution {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter feet: ");
      double feet = s.nextDouble();
      double meters = feet * 0.305;
      System.out.println(feet + " feet is " + meters + " meters.");
    }
  }
  ```
</details>
<br />

6) Write a program that converts pounds into kilograms. The program prompts the user to enter a number in pounds, converts it to kilograms, and displays the results. One pound is 0.454 kilograms
<br />

<details>
  <summary>Solution</summary>
  
  ```java
  public class Solution {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);

      System.out.println("Pounds: ");
      double pounds = s.nextDouble();

      double kilograms = pounds * 0.454;
      System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
    }
  }
  ```
</details>
<br />

7) Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total. For example, if the user enters 10 for subtotal and 15% for the gratuity rate, the program displays $1.5 as gratuity and $11.5 as total.
<br />

<details>
  <summary>Solution</summary>
  
  ```java
  public class Solution {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);

      System.out.println("Enter subtotal and gratuity rate, without % symbol: ");
      double subtotal = s.nextDouble();
      double gratuityRate = s.nextDouble() / 100.0; // convert percent to decimal

      double gratuity = (subtotal * gratuityRate);
      double total = gratuity + subtotal;
      System.out
        .println("The gratuity is $" + gratuity + " and total is $" + total);
    }
  }
  ```
</details>
<br />

8) Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer. For example, if an integer is 932, the sum of all its digits is 14. This one may be hard for beginners. Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93
<br />

<details>
  <summary>Solution</summary>
  
  ```java
  public class Solution {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a number between 0 and 1000: ");
      int n = s.nextInt();

      // For 932, digit0 = 9, digit1 = 3, digit2 = 2
      int digit2 = n % 10;
      int digit1 = (n / 10) % 10;
      int digit0 = ((n / 10) / 10) % 10;

      System.out.println(digit0 + digit1 + digit2);
    }
  }
  ```
</details>
<br />

9) Write a program that prompts the user to enter the minutes (e.g., 1 billion), and displays the number of years and days for the minutes. For simplicity, assume a year has 365 days.
<br />

<details>
  <summary>Solution</summary>
  
  ```java
  public class Solution {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);

      System.out.println("Enter the number of minutes: ");
      int minutes = s.nextInt();

      // 1440 minutes in a day
      int days = minutes / 1440;
      int years = days / 365; 
      int daysLeftOver = days % 365;

      System.out.println(minutes + " is approximately " + years + " years and "
        + daysLeftOver + " days.");
    }
  }
  ```
</details>
<br />

10) Write a program that calculates the energy needed to heat water from an initial temperature to a final temperature. Your program should prompt the user to enter the amount of water in grams and the initial and final temperatures of the water. The formula to compute the energy is: q = M * (finalTemperature - initalTemperature) * 4.18, where q is heat in Joules, M is mass in grams, and 4.18 represents the specific heat capacity of water. 
<br />

<details>
  <summary>Solution</summary>
  
  ```java
  public class Solution {
    public static void main(String[] args) {
      final double c = 4.18;
      Scanner s = new Scanner(System.in);

      System.out.println("Enter mass of water in grams: ");
      double mass = s.nextDouble();

      System.out.println("Enter initial temperature: ");
      double initialTemperature = s.nextDouble();

      System.out.println("Enter final temperature");
      double finalTemperature = s.nextDouble();

      double energy = mass * (finalTemperature - initialTemperature) * c;
      System.out.println("The energy needed is " + energy + " J");
    }
  }
  ```
</details>
<br />

11) Watch this video on the Math.class
<br />

[![Math.class Video](http://img.youtube.com/vi/ufegX5o8uc4/0.jpg)](https://youtu.be/ufegX5o8uc4)
<br />

12) [Math class reference](https://www.w3schools.com/java/java_ref_math.asp)
<br />

13) Write a program that takes in three integers (a, b, c) and displays the lowest value and the highest value. Hint: You must use Math.max() and Math.min() in some way.
<br />

<details>
  <summary>Solution</summary>
  
  ```java
  public class Solution {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
    
      int a = s.nextInt();
      int b = s.nextInt();
      int c = s.nextInt();
    
      int min = Math.min(a, Math.min(b, c));
      int max = Math.max(a, Math.max(b, c));
    
      System.out.println("Min= " + min);
      System.out.println("Max= " + max);
    }
  }
  ```
</details>
<br />

14) Write a program that prompts the user to enter two points (x1, y1) and (x2, y2) and displays their distance. The formula for computing distance is sqrt( (x2-x1)^2 + (y2-y1)^2 ). Note that you can use Math.pow(a, 0.5) to compute sqrt(a).
<br />

<details>
  <summary>Solution</summary>
  
  ```java
  public class Solution {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);

      System.out.println("Enter x1 and y1: ");
      double x1 = s.nextDouble();
      double y1 = s.nextDouble();

      System.out.println("Enter x2 and y2: ");
      double x2 = s.nextDouble();
      double y2 = s.nextDouble();

      double distance =
        Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
      System.out.println("The distance between (" + x1 + ", " + y1 + ") and ("
        + x2 + ", " + y2 + ") is " + distance);
    }
  }
  ```
</details>
<br />

## Unit 3
1) Complete - ["Conditionals and Flow Control"](https://www.codecademy.com/courses/learn-java/lessons/java-conditionals-and-control-flow/) on Codecademy
<br />
























