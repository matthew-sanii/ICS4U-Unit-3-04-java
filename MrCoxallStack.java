import java.util.ArrayList;
import java.util.Collections;

public class MrCoxallStack {
  /**
  * The arrayList creator called theStack.
  */
  private ArrayList<Integer> theStack = new ArrayList<Integer>();

  /**
  * the push method.
  *
  * @param pushValue the value that is being added to the stack.
  */
  public void push(final int pushValue) {
    System.out.println("Adding " + pushValue + " to stack.");
    theStack.add(pushValue);
  }

  /**
  * The showStack method.
  */
  public void showStack() {
    System.out.println("The stacklist.");
    for (Integer aSingleElement : theStack) {
      System.out.println(aSingleElement);
    }
    System.out.println("End of stacklist. \n");
  }

  /**
  * The pop method.
  *
  * @return value in first stack spot.
  */
  public int pop() {
    try {
      int place = theStack.get(0);
      System.out.println("Popping top element: "
      + place);
      theStack.remove(0);
      return place;
    } catch (ArrayIndexOutOfBoundsException errorCode) {
      System.out.println(errorCode);
      return 0;
    }
  }

  /**
  * the peek method.
  *
  * @return value in first stack spot.
  */
  public int peek() {
    try {
      int place = theStack.get(0);
      return place;
    } catch (ArrayIndexOutOfBoundsException errorCode) {
      System.out.println(errorCode);
      return -1;
    }
  }

  /**
  * The clear method.
  */
  public void clear() {
    theStack.clear();
    System.out.println("Cleared stack.");
  }

  /**
  * The reversed method.
  */
  public void reversed() {
    Collections.reverse(theStack);
  }
}
