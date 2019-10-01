import java.util.Scanner;
import java.util.Math;
public class Quiz2{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int randNum=int Math.random()*100+1;

    System.out.print("Provide and reads in an integer number between 1 and 100 ");
    int userNum = sc.nextInt();

    int x = Math.abs(userNum - randNum);

    System.out.println("Your lucky number is "+x);
  }
}
