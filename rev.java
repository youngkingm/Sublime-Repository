import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
class rev{
  public static void inout(){
      try{
        System.setIn(new FileInputStream("input.txt"));
        System.setOut(new PrintStream(new FileOutputStream("output.txt")));
      }catch(Exception e){
        System.err.println("error");
      }
  }
public static void main(String args[]){
    inout();
    Scanner sc = new Scanner(System.in);
    int x =sc.nextInt();
    // System.out.println("HElo b  "+x);
    int rev=0;
    while(x>0){
      int k =x%10;
      rev =rev*10+k;
      x/=10;
    }
    System.out.println(rev);
   }
}