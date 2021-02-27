import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    Calculator calc = new Calculator();
    System.out.println("Here's a fun calculator\n");
    while(true) {
      System.out.print("Enter a command: ");
      BufferedReader reader = new BufferedReader(
              new InputStreamReader(System.in));

      String input = reader.readLine();

      String[] command = input.split("\\s+");

      int response = 0;
      if(command[0].equals("add")) {
        response = calc.add(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
      }
      else if(command[0].equals("subtract")) {
        response = calc.subtract(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
      }
      else if(command[0].equals("multiply")) {
        response = calc.multiply(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
      }
      else if(command[0].equals("divide")) {
        response = calc.divide(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
      }
      else if(command[0].equals("fib")) {
        response = calc.fibonacciNumberFinder(Integer.parseInt(command[1]));
      }
      else if(command[0].equals("binary")) {
        System.out.println(calc.intToBinaryNumber(Integer.parseInt(command[1])));
        continue;
      }
      System.out.println(response);
    }
  }
}
