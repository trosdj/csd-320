/* DJ Trost | CSD320 | Assignment 1 | 28 May 2023
Shows the importance of using floats instead of integers when working with calculations.
Java truncates division when using integers so you won't get the most accurate computations. 
*/

public class IntFloatTest {
    public static void main(String[] args) {
        System.out.println(4 * (1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0)); // Prints 3.2837384837384844
        System.out.println(4 * (1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13)); // Prints 4
    }
}
