import java.util.Scanner;
import java.util.InputMismatchException;

final class Stack {

  /**
  * Prevent instantiation
  * Throw an exception IllegalStateException.
  * if this ever is called
  *
  * @throws IllegalStateException
  *
  */
  private Stack() {
    throw new IllegalStateException("Cannot be initated.");
  }

    /**
    * The starting main() function.
    *
    * @param args Name of file containing a string of numbers
    */
  public static void main(final String[] args) {
    final Scanner userInput = new Scanner(System.in);
    final int min = 1;
    final int max = 10;
    final int multi = 4;
    int times = multi;
    // use MrCoxallStack class
    MrCoxallStack newStack = new MrCoxallStack();
    while (times >= 0) {
      final int randomizer = (int) Math.floor(Math.random() * (max - min + 1)
      + min);
      newStack.push(randomizer);
      times -= 1;
    }
    System.out.println("What do you want to add? ");
    try {
      final int input = userInput.nextInt();
      newStack.push(input);
    } catch (InputMismatchException errorCode) {
      System.out.println(errorCode);
      System.exit(0);
    }
    newStack.reversed();
    newStack.showStack();
    newStack.pop();
    newStack.showStack();
    try {
      int value = newStack.peek();
      System.out.println("Top value is: " + value);
      newStack.Clear();
      newStack.showStack();
      int inte = newStack.peek();
    } catch (IndexOutOfBoundsException errorCode) {
      System.out.println(errorCode);
      System.exit(0);
    }
  }
}
