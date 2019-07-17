import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the outage duration calculator");
        System.out.print("How many seconds was your outage? ");
        int seconds = input.nextInt();

        Calculator calc = new Calculator();
        calc.ReturnOutageDuration(seconds);
    }
}
