package edu.cnm.deepdive.fizzbuzz;

public class Main {

  //psvm to create this
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      int remainder = i % 15;
      switch (remainder) {
        case 0:
          System.out.println("fizzbuzz");
          break;
        case 3:
        case 6:
        case 9:
        case 12:
          System.out.println("fizz");
          break;
        case 5:
        case 10:
          System.out.println("buzz");
          break;
        default:
          System.out.println(i);
      }
/*      boolean divisibleBy3 = (i % 3 == 0);
      boolean divisibleBy5 = (i % 5 == 0);
      if(divisibleBy3 || divisibleBy5){
        if(divisibleBy3) {
          System.out.print("Fizz");
        }
        if(divisibleBy5) {
          System.out.print("Buzz");
        }
      }
      else {
        System.out.print(i);
      }
      System.out.println(); */

    }
  }

}
