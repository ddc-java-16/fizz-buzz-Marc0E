package edu.cnm.deepdive.fizzbuzz;

public class Main {

  //psvm to create this
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      int remainder = i % 15;
      String value = switch (remainder) {
        case 0 -> ("fizzbuzz");
        case 3, 6, 9, 12 -> ("fizz");
        case 5, 10 -> ("buzz");
        default -> //doesn't have to be the last
            String.valueOf(i);
      };

      System.out.println(value);
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
