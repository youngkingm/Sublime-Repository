import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
class hello{
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
   }
}