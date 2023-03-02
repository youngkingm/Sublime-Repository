import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
class prime{
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
    boolean k=true;
    for(int i=2;i<x/2;i++){
      if(x%2==0){
        k=false;
        break;
      }
    }
 if(k==false)System.out.println("Not Prime");
  else System.out.println("True");
   }
}