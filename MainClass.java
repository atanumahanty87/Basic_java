public class MainClass {
  public static void main(String args[]) {
 
    int urAns, urDiv;
 
    try {
 
      urDiv = 0;
      urAns = 25 / urDiv;
 
      System.out.println("Do you really think this will print out? No! It won't!");
 
    }
 
    catch (ArithmeticException e) {
 
      System.out.println("Division by zero not Possible!");
 
    }
 
    System.out.println("This will print out after Exception Handling");
  }
 
}