import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int myNumber = (int)(Math.random()*100);
      Scanner sc = new Scanner(System.in);
      int userNumber = 0;
      
      do{
        System.out.println("Guess My number : ");
        userNumber = sc.nextInt();
        
        if(userNumber == myNumber){
          System.out.println("Correct Number !!");
          break;
        }
        
        else if(userNumber > myNumber){
          System.out.println("Your Number is large");
        }
        else {
          System.out.println("Your Number is small");
        }
      }
      while(userNumber>=0);
      
      System.out.print("My Number was :");
      System.out.println(myNumber);

  }
  
}
// https://www.programiz.com/online-compiler/4Rc2b4xooClMg  
