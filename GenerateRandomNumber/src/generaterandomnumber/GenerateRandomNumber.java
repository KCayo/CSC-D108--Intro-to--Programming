package generaterandomnumber;
/**
 *
 * @author Cumputer101
 */import java.util.*;
public class GenerateRandomNumber {

   public static void main(String[] args) {
      int counter;
      Random rnum = new Random();
      /* Below code would generate 10 random numbers
       * between 1 and 10.
       */
      System.out.println("Random Numbers:");
      System.out.println("***************");
      for (counter = 1; counter <= 10; counter++) {
         System.out.println(rnum.nextInt(10));
      }
   }
}