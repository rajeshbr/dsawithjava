class Palindrome {
  public boolean isPalindrome(String s) {
    char[] chars = s.toCharArray();

    int start = 0;
    int end = chars.length - 1;

    while (start < end) {
      if (chars[start] != chars[end]) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }

  public static void main(String[] args) {
    Palindrome palindrome = new Palindrome();
    String s = "madam";
    if (palindrome.isPalindrome(s)) {
      System.out.println("Given string is palindrome");
    } else {
      System.out.println("Given string is not palindrome");
    }
  }
}
