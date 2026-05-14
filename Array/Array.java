public class Array {

  public static void main(String[] args) {
    char[] arr = new char[5];
    char c = 'A';

    for (int i = 0; i < arr.length; i++) {
      arr[i] = c;
      c++;
    }

    for (char ch : arr) {
      System.out.println(ch);
    }
  }
}