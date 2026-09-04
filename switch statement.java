import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner obj= new Scanner(System.in);
    System.out.println("Enter a number 1 - 7 to finding day ");
    int num = obj.nextInt();
    // using switch for reducing an time 
      switch(num) {
        case 1:
          System.out.println("SUNDAY");
          break;
        case 2:
          System.out.println("MONDAY");
          break;
        case 3:
          System.out.println("TUESDAY");
          break;
        case 4:
          System.out.println("WEDNESDAY");
          break;
        case 5:
          System.out.println("THURSDAY");
          break;
        case 6:
          System.out.println("FRIDAY");
          break;
        case 7:
          System.out.println("SATURADAY");
          break;          

        default:
          System.out.println("invalid number");
      }

      
    }
}