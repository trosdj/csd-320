// DJ Trost | CSD320 | Assignment 5 | 18 June 2023
// Uses while loops to run through mathmatic equations for 1 / x (x == 3.0 through 99.0)

public class WhileLoop {
    public static void main(String[] args) {
    
    double x = 3.0;

    while (x <= 99.0) {     // Run until x == 99.0
        System.out.println(1 / x);
        x += 2;     // Increases x by 2 each stage
    }

    System.out.println("");

    while (x >= 3.0) {      // Run until x == 3.0
        x -= 2;     // Decreases x by 2 each stage; runs before the print to set x back to 99.0
        System.out.println(1 / x);
    }
    
    }
}

