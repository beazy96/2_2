import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s1 = scan.nextLine();
    String s2=s1.replaceAll(" ","_"); 
    System.out.println(s2);  
    
  }
}