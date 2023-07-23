// DJ Trost | CSD320 | Assignment 12 | 22 July 2023
// Update to fix bugs with a program that uses while loops to run through mathematic equations for 1 / x (x == 3.0 through 99.0) and their sum

public class WhileLoopUpdate {
    public static void main(String[] args) {
    
    
    double x = 3.0;     // Declares the var for the denominator
    double y = 0.0;     // Declares the var for the division
    double z = 0.0;     // Declares the var for the sum
    

    while (x <= 99.0) {     // Run until x == 99.0
        if (x < 99.0) {     // Ensures that the last fraction doesn't print a '+' 
            System.out.printf("1 / %.1f + " , x);
        }
        else {
            System.err.printf("1 / %.1f " , x);
        }
        y = 1 / x;
        z = z + y;
        x += 2;     // Increases x by 2 each stage
    }

    System.out.printf("= %.1f", z);

    System.out.println("\n");
    
    // Undoes the variable changes during the last while loop
    x -= 2;     
    z = 0.0;

    
    while (x >= 3.0) {      // Run until x == 3.0
        if (x > 3.0) { 
            System.out.printf("1 / %.1f + " , x);
        }
        else {
            System.err.printf("1 / %.1f " , x);
        }
        y = 1 / x;
        z = z + y;
        x -= 2;     // Decreases x by 2 each stage
    }
    
    System.out.printf("= %.1f", z);
    }
}

