import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner fah= new Scanner(System.in);
      System.out.println("ENTER THE VALUE FOR a&b");
      int a = fah.nextInt();
      int b = fah.nextInt();
      int c = a+b;
      int d = a-b;
      int e = a*b;
      int f = a/b;
      int g = a%b;
      System.out.println(c);
      System.out.println(d);
      System.out.println(e);
      System.out.println(f);
      System.out.println(g);
    }
}