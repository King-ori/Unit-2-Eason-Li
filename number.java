/*5. Write a program that creates and prints a random phone number of the form (XXX) XXX – XXXX.
In the area code (first group of three digits) the first digit cannot start with a zero or a one
and the second digit cannot be a 9.
In the exchange code (second group of three digits) the first digit cannot be a zero or a one.
There are no restrictions for the last four digits (line number).*/
import java.util.Random;
public class number{
  public static void main(String[]args){
    Random rand=new Random();
    int num1;
    int num2;
    int num3;
    int num4;
    int num5;
    num1=rand.nextInt(9)+2;
    num2=rand.nextInt(8);
    num3=rand.nextInt(9);
    num4=rand.nextInt(1000 )+200;
    num5=rand.nextInt(10000);
    System.out.println("("+num1+num2+num3+")"+num4+"-"+num5+".");
  }
}
