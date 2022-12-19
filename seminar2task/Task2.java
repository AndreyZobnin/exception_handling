/* Задание 2
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
 */

package Seminar2Task2;

public class Task2 {

    public static void main(String[] args) {
        try {
            int d = 0;
            double intArray[] = {1, 2};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Catching exception: " + e);
        }

    }
}