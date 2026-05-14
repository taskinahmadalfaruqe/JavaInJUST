public class BrakeAndContinue {

  public static void main(String[] args) {
    int i = 0;
    for (i = 0; i < 10; i++) {
      if (i == 5) {
        continue; // Skip the rest of the loop when i is 5
      }
      System.out.println(i);
    }

    do {
      if (i == 8) {
        continue; // Skip the rest of the loop when i is 8
      }
      System.out.println(i);
      // Exit the loop immediately
    } while (i < 10);


    
  }
}
