import java.lang.*;
import java.util.Scanner;

 class Ascii {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char c = input.next().charAt(0);
        int ascii = (int) c;

        System.out.println("The ASCII code for " + c + " is " + ascii);
    }
}
