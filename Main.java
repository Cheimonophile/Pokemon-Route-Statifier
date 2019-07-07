import java.util.Scanner;

public class Main{
  public static void main(String str[]){
    Route route = new Route();
    Scanner scan = new Scanner(System.in);
    
    while(true){
      String temp = scan.nextLine();
      
      if(temp.toLowerCase().equals("stop")){
        break;
      }
      
      route.add(temp);
      System.out.println(route.num());
    }
    
    System.out.println(route);
  }
}