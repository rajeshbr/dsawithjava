package com.rrb.dsawithjava.problemsolving;

public class FindSecondLargest {

  public static void main(String[] args) {

    int[] numbers = { 3, 4, 5, 7, 2, 8 };
    int largest = numbers[0];
    int secondLargest = numbers[0];

    for (int i = 1; i < numbers.length; i++) {
      if (largest < numbers[i]) {
        secondLargest = largest;
        largest = numbers[i];

      }
      if (secondLargest > numbers[i]) {
        secondLargest = numbers[i];
      }

    }
    System.out.print("Largest:");
    System.out.println(largest);
    System.out.print("Second Largest:");
    System.out.println(secondLargest);
  }

}
