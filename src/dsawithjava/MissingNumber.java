class MissingNumber {

  public static int findMissingNumber(int[] arr) {

    int arrLength = arr.length + 1;
    int sum = (arrLength * (arrLength + 1)) / 2;

    for (int num : arr) {
      sum = sum - num;
    }
    return sum;
  }

  public static void main(String[] args) {
    int[] list = { 1, 2, 3, 5, 6 };
    System.out.print("Missing number is: ");
    System.out.print(findMissingNumber(list));
  }
}
