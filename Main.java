import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args)  {
      try{
       Scanner in = new Scanner(new File("test.in"));
       PrintWriter out = new PrintWriter("test.out");
       while (in.hasNextLine()) {      
           out.println(in.nextLine());   
       }   
        in.close();   
        out.close();
      } catch (IOException e){
        System.out.println("There was an error");
      }
    }
}
